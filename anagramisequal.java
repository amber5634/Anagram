import java.util.Scanner;

public class anagramisequal
{
	public static void checkanagram(String s1, String s2)
	{
		boolean status=s1.equalsIgnoreCase(s2);
		if(s1.length()!=s2.length())
		{
			System.out.println("Anagram:"+status);
		}
		else
		{
			status=true;
			System.out.println("Anagram:"+status);	
		}

	}
	

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1,s2;
		s1=sc.nextLine();
		s2=sc.nextLine();	
		//System.out.println(s1);
		//System.out.println(s2);	
		checkanagram(s1,s2);
	}


}