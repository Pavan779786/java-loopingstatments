package pavan;
import java.util.Scanner;
public class Loopingstatments {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a name");
		String a=sc.nextLine();
		
		int i = 1;  // we need to intialize the i  first for while and do while 
		
		//while
		
		while(i<=10)
		{
		System.out.println(a);
		i++;
		}
		
		
		
		
		
		                                          
		//do while
		
		do		{
			System.out.println(a);
			i++;

		}
		while(i<=5);
		

	}

}
