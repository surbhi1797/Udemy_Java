
public class MethodOverloading {

	public static void calculate(int a, int b) {
		int c = a + b;
		System.out.println(c);
		}
	public static void calculate(double x, double y)
	{
		double z = x / y;
		System.out.println(z);
	}
	public static void calculate()
	{
		System.out.print("Hi");
	}
	public static void main(String args[])
	{
		calculate(100,200);
		calculate(10.0,5.0);
		calculate();
	}
}
