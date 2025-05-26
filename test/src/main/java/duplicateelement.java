
public class duplicateelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,4,2,1,5};
		
		System.out.println("Duplicate elements : ");
		
		for (int i=0; i<=arr.length-1;i++)
		{
			boolean isDuplicate=false;
			
			for (int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]==arr[j])
				{
					isDuplicate=true;
					arr[j]= -1;
					break;
				}
			}
			
			if (isDuplicate && arr[i]!= -1 )
			{
				System.out.print(arr[i]+ " ");
			}
		}
		
		

	}

}
