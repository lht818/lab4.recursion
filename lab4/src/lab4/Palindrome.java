package lab4;
import java.util.Scanner;

public class Palindrome
{
	public static  boolean isaPalindrome(String str)
	{   int aa = str.length();
	    String strL = ""; // create a new String
	
	    for(int i=0; i<aa; i++)
	    {
			if (str.charAt(i) >= 65 && str.charAt(i)<=90) // for capital letters (based on ASCII table) 
				strL += (char)(str.charAt(i)+32);         // convert to lower case letters 
		    if(str.charAt(i)>=97 && str.charAt(i)<=122 ) // for lower case letters
		    	strL += str.charAt(i);
		    if(str.charAt(i)>=48 && str.charAt(i)<=57) //for numbers  
		    	strL += str.charAt(i);
	    }
	    for(int i = 0; i < (aa-1)/2; i++)
	    {
		    if(strL.charAt(i) != strL.charAt(strL.length()-1-i))
		         return false;
		}
	    return true;
	}


	public static void main( String [] args )
	{
		System.out.print( "Enter a palindrome to test: " );
		Scanner console = new Scanner( System.in );
		String inStr = console.nextLine();
		if ( isaPalindrome( inStr ) )
		{			
			System.out.printf("The input string, %s, is a palindrome.\n",inStr );
            System.out.println();
		}
		else
		{
			System.out.printf("The input string, %s, is Not a palindrome.\n",inStr);
		}
		
	}
}
