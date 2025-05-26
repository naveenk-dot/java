package StringPrograms;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="naveen is a QA";
		
		String newstr="";
		
		for(int i =0;i<=str.length()-1;i++)
		{
			if (str.charAt(i)!=' ')
			{
				newstr=newstr+str.charAt(i);
			}
		}
		System.out.println(newstr);
	}

}
