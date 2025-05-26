package ArrayPrograms;

public class slidingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int[] arr= {3,1,5,4,2,4};
		
		int w=3;
		int current=0;
		int index=0;
		
		for(int i=0;i<w;i++)
		{
			current=current+arr[i];
			
		}
		
		int max =current;
		
		for (int i=1; i <arr.length-w;i++)
		{
			current=current-arr[i-1]+arr[i+w-1];
		
		
		if (current>max)
		{
			max=current;
			index =i;
		}
		}
		System.out.println(max);
		
		for(int i=index;i<index+w;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
