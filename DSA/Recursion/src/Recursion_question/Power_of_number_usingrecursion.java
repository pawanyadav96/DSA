package Recursion_question;

public class Power_of_number_usingrecursion {
	public static void main(String []args) {
		int a=2;
		int b=4;
		System.out.println(pow(a,b));
		
	}

	private static int pow(int a, int b) {
		// TODO Auto-generated method stub
		
		if(b==0)
		{
			return 1;
		}
		if(b==1)
		{
			return a;
		}
		else
		{
			return a*pow(a,b-1);
		}
		
	}

}
