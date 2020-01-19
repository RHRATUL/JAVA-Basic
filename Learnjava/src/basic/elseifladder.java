package basic;

import java.util.Scanner;

public class elseifladder {

	public static void main(String[] args) {
		int marks;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number to check Pass or fail");
       marks=input.nextInt();
       if(marks<33)
       {
    	   System.out.println("Fail");
       }
       else if(marks>=33&&marks<50)
       {
    	   System.out.println("C Greade ");
       }
       else if(marks>=51&&marks<70)
       {
    	   System.out.println("B Greade ");
       }
       else if(marks>=71&&marks<90)
       {
    	   System.out.println("A Greade ");
       }
       else if(marks>=90&&marks<100)
       {
    	   System.out.println("A+ Greade ");
       }
	}
	

}
