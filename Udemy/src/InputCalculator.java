import java.util.Scanner;
 
public class InputCalculator {
    public static void inputThenPrintSumAndAverage()
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0, avg = 0, count = 0;
        while(true)
        {
            boolean isAnInt = sc.hasNextInt();
            if(isAnInt)
			{
            	System.out.print("Enter number = ");  
                int num = sc.nextInt();
                count++;
                sum += num;
                avg = sum / count;
                System.out.print("SUM = "+sum+" AVG = "+avg);
			}
			else
			{
			    System.out.print("SUM = "+sum+" AVG = "+avg);
			}
        }
    }
    public static void main(String args[])
	{
    	inputThenPrintSumAndAverage();
	}
}