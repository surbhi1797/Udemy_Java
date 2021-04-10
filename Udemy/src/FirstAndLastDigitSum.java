
public class FirstAndLastDigitSum {

	    public static int sumFirstAndLastDigit(int number)
	    {
	        if(number < 0)
	        {
				System.out.print("Number should be greater than 0");
	            return -1;
	        }
	        int temp = number, rem = 0, sum = 0;
	        while(number != 0)
	        {
	            rem = number % 10;
	            sum = sum * 10 + rem;
	            number = number / 10;
	        }
	        int start = sum % 10;
	        int end = temp % 10; 
	        int finalSum = start + end;
	        System.out.print("Sum of "+start+" and "+end+" is "+finalSum);
	        return finalSum;
	    }
	    public static void main(String args[])
	    {
	    	sumFirstAndLastDigit(252);
	    }

}
