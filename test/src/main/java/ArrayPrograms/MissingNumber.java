package ArrayPrograms;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr= {1,2,3,4,5,7,8,9};
		
		int len=arr.length+1;
		int totalSum=len * (len+1)/2;
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			
			sum=sum+arr[i];
		}
		
		int missingNumber=totalSum-sum;
		System.out.println(missingNumber);
	}

}
