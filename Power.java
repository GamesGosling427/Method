package methods;

public class Power {

	public static void main(String[] args) {
		findpower(76,3);
		}
	   public static void findpower(int a, int b) 
	   {
		  int pow=1;
		  while(b>0)
		  {
			  pow=pow*a;
			  b--;
		  }
		 System.out.println("power is:"+pow); 
	   }
}
