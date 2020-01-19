package basic;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
	  char ch;
	  System.out.println("Enter Charecter");
      Scanner input=new Scanner(System.in);
      ch=input.next().charAt(0);
      if(ch=='a'||ch=='A')
      {
    	  System.out.println("Vowel");
      }
      else {
    	  System.out.println("Not a vowel");
    	  
      }
	}

}
