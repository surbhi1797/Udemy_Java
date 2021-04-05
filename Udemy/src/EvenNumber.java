
public class EvenNumber {

	public static boolean isEvenNumber(int num) {
		if(num % 2 == 0)
		{
			return true;
		}
		return false;
	}
	public static void main(String args[])
	{
		int num = 4, count = 0;
		int finishNum = 20;
		while(num <= finishNum)
		{
			num++;
			if(!isEvenNumber(num))
			{
				continue;
			}
				count++;
				System.out.println("Even Number "+num);
				if(count == 5)
				{
					break;
				}
		}
	}

}
