package methods;

public class Parameterized {

	public static void main(String[] args) {
	findfactorial(5);
	}
	public static void findfactorial(int n) {
	{
	int i=1;
    int fact=1;
    while(i<=n) {
    	fact=fact*i;
    	i++;
    }
	System.out.println("factorial is:"+fact);
	}
	}
}
