package ArrayPrograms;

import java.util.Arrays;

public class twopointetproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//sorted array
		
		int[] arr= {6,8,11,6,7,18};
		
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
		int left=0;
		int right=arr.length-1;
		int target=15;
		
		
		while(left<right)
		{
			int sum=arr[left]+arr[right];
			if (sum==target){
				
				System.out.println(left+ " "+right);
				left++;
				right--;
			}
			
			else if (sum<target)
			{
				left++;
			}
			else
			{
				right--;
			}
		
		}
		
	}
	}

