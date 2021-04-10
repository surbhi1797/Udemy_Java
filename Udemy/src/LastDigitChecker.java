public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a , int b, int c)
    {
        if(a >= 10 && a <= 1000 && b >= 10 && b <= 1000 && c >= 10 && c <= 1000)
        {
            int remA = 0, remB = 0, remC = 0;
            remA = a % 10;
            remB = b % 10;
            remC = c % 10;
            if(remA == remB || remA == remC || remB == remC)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
    	System.out.print(hasSameLastDigit(41,221,701));
    }
}