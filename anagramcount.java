import java.util.Arrays;
import java.util.Scanner;

public class anagramcount
{

    public static boolean isAnagram(String s1, String s2) {
        if(s1.length()!=s2.length())
        {
            return false;
        }
        int count[]=new int[26];
        for(int i=0;i<s1.length();i++)
        {
            ++count[s1.charAt(i)-'a'];
            --count[s2.charAt(i)-'a'];
        }
        for(int j:count)
        {
            if(j!=0)
                return false;
        }
        return true;
    }

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1,s2;
		s1=sc.nextLine();
		s2=sc.nextLine();	
		//System.out.println(s1);
		//System.out.println(s2);	
		System.out.println(isAnagram(s1,s2));
	}
}