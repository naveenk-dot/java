package StringPrograms;

public class occuranceofcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="naveen";
		
		char value='e';
		
		int count=0;
		
		for (int i=0;i<=str.length()-1;i++)
		{
			if (str.charAt(i)== value)
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
