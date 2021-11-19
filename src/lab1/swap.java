package lab1;

public class swap
{
	public static void main(String args[])
	{
		int a = 12;
		int b = 5;

		
		System.out.println("A: "+a);
		System.out.println("B: "+b);
		
		System.out.println("swap...");
		
		int swap = a;
		a=b;
		b=swap;
		
		System.out.println("A: "+a);
		System.out.println("B: "+b);
		
    }
}
