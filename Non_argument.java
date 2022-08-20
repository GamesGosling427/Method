package methods;

public class Non_argument {

	public static void main(String[] args) {
		System.out.println("it is main mehtod");
		test();
		findfactorial();
	}
	
	public static void test()
	{
		System.out.println("this is test method");
		int a=12;
		int b=1432;
		int sum=a+b;
		System.out.println("sum is:"+sum);
	}
	public static void findfactorial()
	{

	int fact=1;
	for(int i=1;i<=12;i++)
	{
		fact=fact*i;
	}
		System.out.println("facotrial is:"+fact);
	}
}
