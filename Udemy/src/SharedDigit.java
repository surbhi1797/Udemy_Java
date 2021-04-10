public class SharedDigit {
    public static boolean hasSharedDigit(int a , int b)
    {
        if(  a >= 10 && a <= 99 &&  b >= 10 && b <= 99)
        {
            int remA = 0, remB = 0; 
            remA = a % 10;
            remB = b % 10;
            a = a / 10;
            b = b / 10;
            return (remA == remB || remA == b || remB == a || a == b);
        }
        return false;
    }
    public static void main(String args[])
    {
    	System.out.print(hasSharedDigit(12,62));
    }
}