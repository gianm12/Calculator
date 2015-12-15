package calculatorWithDoubleOnly;

public class Command {
	public double x;
	public double y;
	private double Result;
	//private double resultDouble;
	public String expression;
	//public static Boolean isDouble;

	public Command(double x, double y, String expression) //might not need this...
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

	public void divide()
	{
	
	}

	public double getResult() {
		return Result;
	}


	
}
