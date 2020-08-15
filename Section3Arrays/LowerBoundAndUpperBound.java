package Section3Arrays;

public class LowerBoundAndUpperBound {

	public static void main(String[] args) {

		int[] arr = { 1,2,2,2,2,2,2,3,3,3,9,11 };
		System.out.println(lowerBound(2, arr));
		System.out.println(upperBound(2, arr));
	}

	public static int lowerBound(int num, int[] arr) {

		int lo = 0;
		int hi = arr.length - 1;
		int ans = -1;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (num > arr[mid]) {
				lo = mid + 1;
			} else if (num < arr[mid]) {
				hi = mid - 1;
			} else if (num == arr[mid]) {
				ans = mid;
				hi = mid - 1;
			}
		}
		return ans;
	}

	public static int upperBound(int num, int[] arr) {

		int lo = 0;
		int hi = arr.length - 1;
		int ans = -1;
		for (int i = 0; lo <= hi; i++) {
			int mid = (lo + hi) / 2;
			if (num > arr[mid]) {
				lo = mid + 1;
			} else if (num < arr[mid]) {
				hi = mid - 1;
			} else {
				ans = mid;
				lo = mid + 1;
			}
		}
		return ans;
	}

}
