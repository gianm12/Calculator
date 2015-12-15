package calculatorWithIntOnly;

public class Command {
	public int x;
	public int y;
	private int Result;
	private double resultDouble;
	public String expression;
	public static Boolean isDouble;

	public Command(int x, int y, String expression) //might not need this...
	{
		System.out.println("inside constructor......");
		this.x = x;
		this.y = y;
		this.expression = expression;
	}

	public void prepareToCalculate()
	{
		if(expression.equals("+"))
		{
			System.out.println("going to add function...");
			add();
		}
		else if (expression.equals("-"))
		{
			System.out.println("going to subtract function....");
			subtract();
		}
		else if(expression.equals("*"))
		{
			System.out.println("going to mult function...");
			multiply();
		}
		else if (expression.equals("/") ||expression.equals("\\"))
		{
			System.out.println("going to divide function...");
			divide();
		}
		else{
			System.out.println("please enter a valid expression");
		}
	}

	public void add()
	{
		Result= x+y;
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

	}

	public boolean divide()
	{
		if(x%y > 0)//this means there is a remainder aka its a fraction
		{

			resultDouble = (double) x/y;
			isDouble = true;	
		}
		else
		{
			System.out.println( "inside else...");
			Result = x/y;
			isDouble = false;
		}		
		return isDouble;
	}

	public int getResult() {
		return Result;
	}


	public double getresultDouble()
	{
		return resultDouble;
	}
}
