package methods;

public class Recursion2 {

	public static void main(String[]args){
		System.out.println("the factorial is:"+fact(6));}
	public static int fact(int n)
	{
	if(n>1)
	{
		return n*fact(n-1);
		}
	
	else {
		return 1;
	}
	}
}



