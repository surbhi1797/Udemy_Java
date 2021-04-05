
public class PrimeNumber {

	public static boolean isPrime(int num) {
		if(num == 1)
		{
			return false;
		}
		for(int i = 2; i <= (long) Math.sqrt(num); i++)
		{
			if(num % i == 0)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String args[])
	{
		int count = 0;
		for(int i  = 2; i < 50; i++)
		{
			if((isPrime(i)) == true)
			{
				count ++;
				System.out.println("Number "+i+" is a Prime Number.");
				if(count == 10)
				{
					System.out.println("Exiting for loop");
					break;
				}
			}
		}
	}
}
