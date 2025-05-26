package ArrayPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validateEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String email="naveen@gmail.com";
		
		String regex= "^[a-zA-Z0-9_\\.\\-]+[@][a-z]+[\\.][a-z]{2,}$";
		
		Pattern pattern=Pattern.compile(regex);
		
		Matcher matcher=pattern.matcher(email);
		
		if(matcher.matches())
		{
			System.out.println("matches");
		}
		
	}

}
