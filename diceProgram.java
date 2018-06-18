imort java.util.*;
import java.util.Random;
import java.util.Scanner;
public class diceProgram 
{
	public static void main(Sting [] args)
	[] {
		int result;
		Scanner sc = new Scanner(Sysetm.in);
		int sides= sc.nextInt();
		switch(sides)
		{
		case 2: result= (int)(Math.random()*2)+1;
		  		if(result==1)
		  			System.out.println("true");
		  		else
		  			System.out.println("false");
		  			break;
		  			
		case 4: result= (int)(Math.random()*4)+1;
				System.out.println(result);
				break;
		case 6: result=(int)(Math.random()*6)+1;
				System.out.println(result);
				break;
		default: System.out.println("Invalid Choice");		
		  			
		}
	}
}
