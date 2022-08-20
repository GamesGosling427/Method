package methods;

public class Recursionprograms {

	public static void main(String[] args) {
		System.out.println();
		test(29);
				}
	public static void test(int n)
	{
	if(n>0)
	{
		System.out.print(n+"   ");
		test(n-1);
	
      }
	else {
		System.out.println("program end now");
	}
}
}