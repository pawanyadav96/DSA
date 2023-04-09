package sliding_window;

import java.util.ArrayList;
import java.util.List;

public class maximum_element_in_windowK {
	public static void main(String[]args) {
		
		int arr[]= {1,3,-1,-3,5,3,6,7};
		int k=3;
		
		
//		Brute force {3,3,5,5,6,7}//output
		List<Integer>list=new ArrayList<>();
		for(int i=0;i<=arr.length-k;i++)
		{
			int max=0;
			for(int j=i;j<i+k;j++)
			{
				if(arr[j]>max)
				{
					max=arr[j];
				}
			}
			list.add(max);
		
		}
		System.out.println(list);
		
		
		
		
		
	}

}
