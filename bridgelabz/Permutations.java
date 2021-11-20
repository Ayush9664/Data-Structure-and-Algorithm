package bridgelabz;
import bridgelabz.Utility.Utility;

public class Permutations {
	 public static void main(String[] args) {
	        Utility utility = new Utility();
	        System.out.println("Enter String : ");
	        String input= utility.getString();
	        utility.permutation(input,0,input.length());
	    }
	}

