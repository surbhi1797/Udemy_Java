
public class SpeedConverter {

	public static long toMilesPerHour(double kilometersPerHour) {
		if(kilometersPerHour < 0)
			return -1;
		else
		{
			double a = kilometersPerHour/1.609;
			long round = Math.round(a);
			return round;
		}
	}
	public static void printConversion(double kilometersPerHour)
	{
		   long ab =toMilesPerHour(kilometersPerHour);
	        if (ab==-1){
	            System.out.println("Invalid Value");
	            return;
	        }
	        System.out.println(kilometersPerHour+" km/h = "+ab+" mi/h");
	}
	
	public static void main(String args[])
	{
		printConversion(-1.5);
	}

}
