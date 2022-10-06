Chef and Happy String [CodeChef]
Problem
Chef has a string SS with him. Chef is happy if the string contains a contiguous substring of length strictly greater than 22 in which all its characters are vowels.

Determine whether Chef is happy or not.

Note that, in english alphabet, vowels are a, e, i, o, and u.

Input Format
First line will contain TT, number of test cases. Then the test cases follow.
Each test case contains of a single line of input, a string SS.
Output Format
For each test case, if Chef is happy, print HAPPY else print SAD.

You may print each character of the string in uppercase or lowercase (for example, the strings hAppY, Happy, haPpY, and HAPPY will all be treated as identical).

Constraints
1 \leq T \leq 10001≤T≤1000
3 \leq |S| \leq 10003≤∣S∣≤1000, where |S|∣S∣ is the length of SS.
SS will only contain lowercase English letters.
Sample 1:
Input
4
aeiou
abxy
aebcdefghij
abcdeeafg
Output
Happy
Sad
Sad
Happy


Solution
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int count=0;
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		for(int j=1;j<=t;j++){
		    String s= sc.next();
		    
		    for(int i=0;i<s.length();i++){
		        if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u' ||s.charAt(i)=='A' ||s.charAt(i)=='E' ||s.charAt(i)=='I' ||s.charAt(i)=='O' ||s.charAt(i)=='U'){
		            count++;
		            if(count>2){
		                System.out.println("Happy");
		                    break;
		                
		            }
		    }
		        else
		        count=0;
		    }
		    if(count<3)
		    System.out.println("Sad");
		  
		  count=0;
		}
	}
}


