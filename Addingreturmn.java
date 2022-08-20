package methods;

public class Addingreturmn {

	public static void main(String[] args) {
		System.out.println("sum is:"+test(4));	
		}
		public static int test(int n) {
			if (n>0)
			{
				return n+ test(n-1);
			}
			else {
				return 1;
			}
		}
}

