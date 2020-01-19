package basic;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
	int num;
	Scanner input = new Scanner(System.in);
	  System.out.println("Enter a Number");
num=input.nextInt();

switch(num)
{ 
case 1:
	System.out.println("This is 1");
	break;
case 2:
	System.out.println("This is 2");
	break;
case 3:
	System.out.println("This is 3");
	break;
case 4:
	System.out.println("This is 4");
	break;
	
	
case 5:
	System.out.println("This is 5");
	break;
	case 6:
		System.out.println("This is 6");
		break;
		
	default:
		System.out.println("Invalid input");

		
	
}

	}

}
