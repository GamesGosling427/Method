package methods;

public class Return1 {
		public static void main(String[]args) {
		System.out.println("factorial is:"+test(6));	
		}
		public static int test(int n) {
			if (n>0)
			{
				return n* test(n-1);
			}
			else {
				return 1;
			}
		}
}
