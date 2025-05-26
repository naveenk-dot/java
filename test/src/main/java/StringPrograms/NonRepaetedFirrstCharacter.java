package StringPrograms;

public class NonRepaetedFirrstCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="swiss";
		
		for(int i=0;i<str.length();i++)
		{
			char current=str.charAt(i);
			boolean isRepeated=false;
			
			for(int j=i+1;j<str.length();j++)
			{
				if(current==str.charAt(j))
				{
					isRepeated=true;
					break;
				}
				
				
			}
			if(isRepeated!=true)
			{
				System.out.println(str.charAt(i));
				break;
			}
			
			
		}
	}

}
