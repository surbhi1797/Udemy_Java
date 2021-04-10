public class NumberToWords {
    public static void numberToWords(int number)
    {
        if(number < 0)
        {
            System.out.print("Invalid Value");
        }
        int n = reverse(number);
        int temp = n;
        for(int i = 0; i < getDigitCount(number); i++)
        {
            int rem = temp % 10;
            temp = temp / 10;
            switch(rem)
            {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
        }
    }
    public static int reverse(int number)
    {
        int rem = 0, rev = 0, temp = number;
        while(temp != 0)
        {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        return rev;
    }
    public static int getDigitCount(int number)
    {
        if(number < 0)
        {
            return -1;
        }
        int count = 0, temp = number;
        if(temp == 0)
        {
        	return 1;
        }
        while(temp != 0)
        {
            count += 1;
            temp = temp / 10;
        }
        return count;
    }
    public static void main(String args[])
    {
    	numberToWords(345016543);
    }
}