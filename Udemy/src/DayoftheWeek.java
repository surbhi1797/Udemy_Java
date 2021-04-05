
public class DayoftheWeek {

	public static void printDayOfTheWeek(int day) {
		switch(day)
		{
		case 0:
			System.out.print("Sunday");
			break;
		case 1:
			System.out.print("Monday");
			break;
		case 2:
			System.out.print("Tuesday");
			break;
		case 3:
			System.out.print("Wednesday");
			break;
		case 4:
			System.out.print("Thursday");
			break;
		case 5:
			System.out.print("Friday");
			break;
		case 6:
			System.out.print("Saturday");
			break;
		default:
			System.out.print("Inalid day");
			break;
		}
	}
	public static void main(String args[])
	{
		printDayOfTheWeek(0);
	}

}
