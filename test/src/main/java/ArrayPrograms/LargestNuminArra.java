package ArrayPrograms;

public class LargestNuminArra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] num= {1,2,3,4,5};
	
	int largest=Integer.MIN_VALUE;
	int secondlargest=Integer.MIN_VALUE;
	
	for(int i=0;i<num.length;i++)
	{
		if (num[i]>largest)
		{
			secondlargest=largest;
			largest=num[i];
		}
		else if(num[i]>secondlargest && num[i]!=largest)
		{
			secondlargest = num[i];
		}
				
		
	}
	System.out.println(secondlargest);
	
	
	
	}
	

}
