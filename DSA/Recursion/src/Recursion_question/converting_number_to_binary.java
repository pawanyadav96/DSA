package Recursion_question;

public class converting_number_to_binary {
	
	
	public static void main(String []args) {
		int n=15;
	    convert(n);
		
	}

	private static void convert(int n) {
		// TODO Auto-generated method stub
		if(n==0)
		{
			
			return ;
		}
		else
		{
			convert(n/2);
			System.out.print(n%2);
			
		}
	}

}
