package leetcodeproblem;

import java.util.HashMap;

public class ValidAnagram242 {
	public static void main(String[]args)
	{
		String s="anagram";String t="nagaram";
		//String s="rat";String t="car";
		HashMap<Character,Integer> hm=new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
		}
		
		for(int i=0;i<t.length();i++)
		{
			if(!hm.containsKey(t.charAt(i)))
			{
				System.out.println("false");
			}
			if(hm.get(t.charAt(i))==1)
			{
				hm.remove(t.charAt(i));
			}
			else
			{
				hm.put(t.charAt(i),hm.get(t.charAt(i))-1);
			}
		}
		if(hm.size()==0)
		{
			System.out.println("true");
		}
		
		else System.out.println("false");
	}

}
