import java.util.Arrays;
import java.util.Scanner;

public class anagram 
{
	public static void checkanagram(String s1, String s2)
	{
		boolean status=true;
		if(s1.length()!=s2.length())
		{
			status=false;
			System.out.println("Anagram:"+status);
		}
		else
		{
			char [] arrs1=s1.toLowerCase().toCharArray();
			char [] arrs2=s2.toLowerCase().toCharArray();
			Arrays.sort(arrs1);
			Arrays.sort(arrs2);
			status=Arrays.equals(arrs1,arrs2);
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