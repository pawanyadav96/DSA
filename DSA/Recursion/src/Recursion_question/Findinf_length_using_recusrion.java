package Recursion_question;

public class Findinf_length_using_recusrion {
	
	public static void main(String []args) {
		String s="masaischool";
		System.out.println(find_length(s));
		
	}

	private static int find_length(String s) {
		// TODO Auto-generated method stub
		if(s.equals(""))
		{
			return 0;
		}
		else
		{
			return 1+find_length(s.substring(1));
		}
		
	
	}

}
