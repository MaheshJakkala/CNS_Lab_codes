import java.util.*;

public class sub
{
	public static void main(String args[]) throws Exception
	{
		String a = "abcdefghijklmnopqrstuvwxyz";
		String b = "qwertyuiopasdfghjklzxcvbnm";
		
		String s = "hellow world";
		
		String enc="",dec="";
		System.out.print("Encrypted: ");
		for(int i=0;i<s.length();i++)
		{
			
//			System.out.print(b.charAt(a.indexOf(s.charAt(i))));
			if(s.charAt(i)>'z' || s.charAt(i)<'a') enc+=s.charAt(i);
			else{
			 System.out.print(b.charAt(a.indexOf(s.charAt(i))));
			 enc+=b.charAt(a.indexOf(s.charAt(i)));
			}
		}
		
		System.out.print("\nDecrypted: ");
		for(int i=0;i<s.length();i++)
		{
			if(enc.charAt(i)>'z' || enc.charAt(i)<'a') System.out.print(enc.charAt(i));
			else
				System.out.print(a.charAt(b.indexOf(enc.charAt(i))));
		}
	}
}
			
