
public class SwitchChallenge {

	public static void main(String args[]) {
		char charValue = 'C';
		
		switch(charValue)
		{
		case 'A':
			System.out.print("A was found");
			break;
		case 'B':
			System.out.print("B was found");
			break;
		case 'C':case 'D':case 'E':
			System.out.print(charValue+" was found");
			break;
		default:
			System.out.print("Not found");
			break;
		}
		
	}

}
