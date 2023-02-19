package leetcodeproblem;

import java.util.HashMap;
import java.util.Map;

public class Majority_ele169 {
	public static void main(String[]args)
	{
		int[]arr= {2,2,3,3,3};
		System.out.println(majorityElement(arr));
	}
	 public static int majorityElement(int[] nums) {
	        
		 HashMap <Integer,Integer> hm= new HashMap<>();
		 for(int i=0;i<nums.length;i++)
		 {
		     if(hm.containsKey(nums[i]))
		     {
		         hm.put(nums[i],hm.get(nums[i])+1);
		     }
		     else
		     {
		         hm.put(nums[i],1);
		     }
		 }
		 int max=0;

		  for(Map.Entry<Integer, Integer> entry: hm.entrySet()) {
		       if(entry.getValue()>nums.length/2) {
		        max=entry.getKey();

		     }
		  }
		     return max;
		     }

}
