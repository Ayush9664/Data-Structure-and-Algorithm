package bridgelabz;
import bridgelabz.Utility.Utility;
public class PrimeNumbersInRange {
	 public static void main(String[] args) {
	        Utility Utility=new Utility();
	        System.out.print("Enter lower bound and upper bound : ");
	        int start= Utility.getIntValue();
	        int end=Utility.getIntValue();

	        Utility.findPrimeNumbers(start,end);
	    }
	}

