package calculatorAllInOneLine;
import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
	//	System.out.println("Welcome to the Calculator!");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your equation");
		while(scan.hasNextLine())
		{
			
			//System.out.println("Enter your equation");
//		scan.nextLine();
		String mathEq = scan.nextLine();

		if(mathEq.equals("exit"))
		{
			System.out.println("Ending program....");
			System.exit(0);
		}
		
		Command command = new Command(mathEq);
		command.prepareToCalculate();// next try to make this as a static method...
		System.out.println("Main: the result is: " + command.getResult());
		System.out.println("Enter your equation or type exit:");
		}
		scan.close();
	}
}
