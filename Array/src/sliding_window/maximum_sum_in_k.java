package sliding_window;

public class maximum_sum_in_k {
	public static void main(String []args)
	{
		int[] arr= {2,3,5,2,9,7,1};
		int k=3;
		
		int max=0;
		for(int i=0;i<=arr.length-k;i++)
		{
			int sum=0;
			for(int j=i;j<i+k;j++)
			{
				
				sum=sum+arr[j];
				//System.out.println(sum);
				
			}
			if(sum>max)
			{
				max=sum;
			}
		}
		System.out.println(max);
	}
	
	
	
	

}
