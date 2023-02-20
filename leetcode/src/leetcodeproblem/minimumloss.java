package leetcodeproblem;

public class minimumloss {
	public static void main(String []args) {
		//int arr[]= {20,15,8,2,12};
		int arr[]= {20,7,8,2,5};
				int max=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i]) {
				if(Math.abs(arr[j]-arr[i])<max)
				{
					max=Math.abs(arr[j]-arr[i]);
				}
			}
		}
		}
		System.out.println(max);
	}
	

}
