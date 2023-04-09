package Array;

import java.util.Stack;

public class removeduplicatestack {
	
	
	public static void main(String[]args) {
		
		
		int[]arr= {1,3,2,4};
		int n=arr.length;
		nle(arr,n);
	}
		
		  public static void nle(int arr[] ,int n)
		    {
		       Stack<Integer> stk=new Stack<>();
		        int []ans=new int[n];
		        for(int i=arr.length-1;i>=0;i--)
		        {
		            while( !stk.isEmpty() && stk.peek()<arr[i])
		            {
		                stk.pop();
		            }
		            
		            if(stk.isEmpty())
		            {
		                ans[i]=-1;
		            }
		            else if(stk.peek()>arr[i])
		            {
		                ans[i]=stk.peek();
		            }
		            
		            stk.push(arr[i]);
		            
		            
		        }
		        for(int i=0;i<ans.length;i++)
		        {
		            System.out.print(ans[i]+" ");
		        }
		    }
		
	}


