package calculatorWithDoubleOnly;
import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		System.out.println("Welcome to the Calculator!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number:");
		double num1 =  scan.nextDouble();
		System.out.println("What do you want to do? ( + - * /)");
		scan.nextLine();
		String expression = scan.nextLine();
		System.out.println("Enter second number and hit enter");
		double num2 = scan.nextDouble();

		Command command = new Command(num1, num2, expression);
		command.prepareToCalculate();// next try to make this as a static method...

		//	System.out.println("1st num: " + num1 +" expression: " + expression + " 2nd number " + num2);


		System.out.println("Answer: " + command.getResult());
	}
}
