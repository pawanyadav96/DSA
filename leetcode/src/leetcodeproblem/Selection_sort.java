package leetcodeproblem;

public class Selection_sort {
	public static void main(String[]args)
	{
		int arr[]= {2,3,8,1,9,8,7};
		selectionsort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	private static void selectionsort(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			int min=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
				
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		//.out.println(arr.toString());
		
	}
	
	

}
