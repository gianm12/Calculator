package calculatorWithIntOnly;
import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		System.out.println("Welcome to the Calculator!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 =  scan.nextInt();
		System.out.println("What do you want to do? ( + - * /)");
		scan.nextLine();
		String expression = scan.nextLine();
		System.out.println("Enter second number and hit enter");
		int num2 = scan.nextInt();
		
		Command command = new Command(num1, num2, expression);
		command.prepareToCalculate();// next try to make this as a static method...
		
	//	System.out.println("1st num: " + num1 +" expression: " + expression + " 2nd number " + num2);
		
		if(expression.equals("/") &&  command.divide())
		{
			System.out.println("Answer: " + command.getresultDouble());
		}
		else
		{
		System.out.println("Answer: " + command.getResult());
		}
	}
}
