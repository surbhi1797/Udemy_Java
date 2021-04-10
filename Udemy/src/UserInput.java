import java.util.Scanner;

public class UserInput {

	public static void main(String args[]) {
		int count = 0, sum = 0;
		Scanner sc= new Scanner(System.in);
		while(true)
		{
			int order = count + 1;
			System.out.print("Enter number "+order+" : ");  
			boolean isAnInt = sc.hasNextInt();
			if(isAnInt)
			{
				int num = sc.nextInt();
				count++;
				sum += num;
				if(count == 4)
				{
					break;
				}
			}
			else
			{
				System.out.println("Invalid Number");
			}
			sc.nextLine();
		}
		System.out.print("Sum = "+sum);
		sc.close();
	}

}
