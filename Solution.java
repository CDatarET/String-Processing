import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		
		for(int c = 0; c < cases; c++){
		    String str = scan.next();
		    int sum = 0;
		    
		    for(int i = 0; i < str.length(); i++){
		        if(Character.isDigit(str.charAt(i))){
		            sum = sum + (str.charAt(i) - '0');
		        }
		    }
		    
		    System.out.println(sum);
		}
	}
}
