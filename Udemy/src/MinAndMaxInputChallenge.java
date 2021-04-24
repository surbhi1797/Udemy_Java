import java.util.Scanner;

public class MinAndMaxInputChallenge {
	public static void main(String args[])
	{
		int min = 2147483647, max = -2147483648;
//		boolean first = true;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter number:");
			boolean isAnInt = sc.hasNextInt();
			if(isAnInt)
			{
				int num = sc.nextInt();
//				if(first)
//				{
//					first = false;
//					min = num;
//					max = num;
//				}
				if(num > max)
				{
					max = num;
				}
				if(num < min)
				{
					min = num;
				}
			}
			else
			{
				break;
			}
			sc.nextLine();
		}
		System.out.print("Min = "+min+" Max = "+max);
		sc.close();
	}

}
