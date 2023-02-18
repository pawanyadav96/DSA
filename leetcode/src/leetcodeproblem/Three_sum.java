package leetcodeproblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Three_sum {
	public static void main(String[]args)
	{
		int[]arr= {-1,0,1,2,-1,-4};
		int []arr2= {0,0,0};
		System.out.println(threesum( arr));
	}

	private static List<List<Integer>> threesum(int[] arr) {
		Set<List<Integer>> set=new HashSet<>();
		Arrays.sort(arr);
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			int j=i+1;
			int k=arr.length-1;
			
			while(j<k)
			{
				sum=arr[i]+arr[j]+arr[k];
				if(sum==0)
				{
					set.add(Arrays.asList(arr[i],arr[j],arr[k]));
					j++;k--;
				}
				else if(sum<0)
				{
					j++;
				}
				else
				{
					k--;
				}
			}
		}
		return new ArrayList<>(set);
		// TODO Auto-generated method stub
		
	}

}
