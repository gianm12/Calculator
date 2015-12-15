package calculatorAllInOneLine;

public class Command {
	public String mathEq;
	public double Result;
	public double x, y;
	public String[] mathEqs;
	public String str, firstNumber, secondNumber;
	String numberStr;
	int counter;	
	
	public Command(String mathEq) {
		//System.out.println("inside constructor....");
		this.mathEq = mathEq;
	}

	public void prepareToCalculate()
	{	

		//System.out.println("inside prepare to calculate...");
		//System.out.println("this is the incoming string: "+ mathEq);
		mathEqs = mathEq.split("");
		
		for(int j=0; j<mathEqs.length;j++)
		{
			//System.out.println("this is split up: " +mathEqs[j]);
			numberStr = mathEqs[j];
			counter = j;
	
			if(numberStr.equals("+"))
			{
				setUpNumbers();
				//System.out.println("its the addition function! and the counter is: " + counter);	
				add();
			}
			if(numberStr.equals("-"))
			{
				setUpNumbers();
				//System.out.println("its the sub function!");
				subtract();
			}
			if(numberStr.equals("*"))
			{
				setUpNumbers();
				
				//System.out.println("its the sub function!");
				multiply();
			}
			if(numberStr.equals("/") || numberStr.equals("\\"))
			{
				setUpNumbers();
				//System.out.println("its the sub function!");
				divide();
			}
//			else if(!(numberStr.equals("+") || numberStr.equals("-") ||numberStr.equals("*")|| numberStr.equals("/") || numberStr.equals("\\")))
//			{
//				System.out.println("its a number!");
//				//x = Integer.parseInt(numberStr);
//			}
		}
	}

	public void setUpNumbers()
	{
		firstNumber =  mathEq.substring(0, counter);
		secondNumber = mathEq.substring(counter+1, mathEq.length());
		//System.out.println("this is the first string " + firstNumber+ " this is the second number " + secondNumber);
		x = Integer.parseInt(firstNumber);
		y = Integer.parseInt(secondNumber);
	}
	public void add()
	{
		//System.out.println("inside the add function............");
		
//		System.out.println("the string being passed in: " + mathEq);
//		String  firstNumber =  mathEq.substring(0, counter);
//		String secondNumber = mathEq.substring(counter+1, mathEq.length());
//		System.out.println("this is the first string " + firstNumber+ " this is the second number " + secondNumber);
//		x = Integer.parseInt(firstNumber);
//		y = Integer.parseInt(secondNumber);
		Result= x+y;
		System.out.println("the result is: " +Result);
		
		
//		double a = Double.parseDouble(firstNumber);
//		double b = Double.parseDouble(secondNumber);
//		double c = a+b;
//		System.out.println("the double result is: " +c);
	}
	public void subtract()
	{	
		if (x>=y)
		{
			Result = x-y;
		}
		else
		{
			Result = -1* (y-x);
		}
	}
	public void multiply()
	{
		Result = x*y;
		//System.out.println("result is: " +Result);
	}

	public void divide()
	{
//		double z;
//		String  firstNumber =  mathEq.substring(0, counter);
//		String secondNumber = mathEq.substring(counter+1, mathEq.length());
//		System.out.println("this is the first string " + firstNumber+ " this is the second number " + secondNumber);
//		x = Integer.parseInt(firstNumber);
//		y = Integer.parseInt(secondNumber);

		Result = x/y;
	}

	public double getResult() {
		return Result;
	}


}
