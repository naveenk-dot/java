package StringPrograms;

public class reverseStringCompression {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String original="a2b3ht6";
		
		StringBuilder result=new StringBuilder();
		
		//expected = aabbbht
		
		for(int i=0;i<original.length();i++)
		{
			char ch=original.charAt(i);
			if(Character.isLetter(ch))
			{
				result.append(ch);
			}
			else if(Character.isDigit(ch))
			{
				int count=Character.getNumericValue(ch);
				for(int j=1;j<count;j++)
				{
					result.append(original.charAt(i-1));  
				}
			}
			
		
		
		}
		System.out.println(result);
	}
	
}
