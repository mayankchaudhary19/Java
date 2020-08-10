
public class ForLoop {
	public static void main(String[] args) {
		System.out.println("Loop1");
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		System.out.println("Loop2");
		int j=1;
		for(;j<=5;j++) {
			System.out.println(j);
		}
		System.out.println("Loop3");
		int k=1;
		for(;k<=5;) {
			System.out.println(k);
			k++;
		}
		for(;;) {
			System.out.println("HEY"); //infinite loop
		}
	}

}
