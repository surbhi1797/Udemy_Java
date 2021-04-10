
public class DigitSum {

	public static int sumDigits(int number) {
		if(number < 10)
		{
			System.out.print("Number should be greater than or equal to 10");
			return -1;
		}
		int sum = 0;
		while(number != 0)
		{
			int rem = number % 10;
			sum = sum + rem;
			number = number / 10;
			
		}
		System.out.print(sum);
		return sum;
	}

	public static void main(String args[])
	{
		sumDigits(123456);
	}
}
