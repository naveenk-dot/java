package StringPrograms;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="naaahhhbb";
		
		StringBuilder result=new StringBuilder();
		int Count=1;
		
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i)==str.charAt(i-1))
					{
				Count++;
				
			}
			else
			{
				result.append(str.charAt(i-1)).append(Count);
				Count=1;
		}
		
		
		
	}
//		result.append(str.charAt(str.length()-1)).append(Count);
		System.out.println(result.toString());
}
}
