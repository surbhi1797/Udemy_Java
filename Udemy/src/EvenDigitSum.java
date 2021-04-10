
public class EvenDigitSum {

	public static int getEvenDigitSum(int number)
    {
        if(number < 0)
        {
            return -1;
        }
        int sum = 0, rem = 0, temp = number;
        while(temp != 0)
        {
            
            	rem = temp % 10;
	            temp = temp / 10;
	            if(rem % 2 == 0)
	            {
	            	sum = sum + rem;
	            }
            
        }
        System.out.print(sum);
        return sum;
    }

	public static void main(String args[])
	{
		getEvenDigitSum(2222);
	}
}
