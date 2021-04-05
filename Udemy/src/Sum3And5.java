
public class Sum3And5 {

	public static void main(String args[]) {
		int sum = 0, count = 0;
		for(int i = 1; i <= 1000; i++)
		{
			if((i % 3 == 0) && (i % 5 == 0))
			{
				count++;
				System.out.println(i+" is divided by 3 and 5.");
				sum = sum + i;
				if(count == 5)
				{
					break;
				}
			}
		}
		System.out.println("Sum = "+sum);
		} 
}
