package testPackage;

import java.io.Serializable;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class TestJava {

	
	public static void main(String z[]) {
		
		 
	}
	
	public static class DecimalHelper {

	    public static final String PATTERN="##.##";
	    private static DecimalFormat decimalFormat = null;


	    public static String format(String pattern,Double number){
	        if(decimalFormat == null){
	            decimalFormat = new DecimalFormat(pattern);
	            decimalFormat.setRoundingMode(RoundingMode.UP);
	        }
	        return decimalFormat.format(number);
	    }

	    public static String format(String pattern,RoundingMode roundingMode,double number){
	        if(decimalFormat == null){
	            decimalFormat = new DecimalFormat(pattern);
	            decimalFormat.setRoundingMode(roundingMode);
	        }
	        return decimalFormat.format(number);
	    }
	}
	
	private static int convertStringtoInt(String number){

	    int total =0;
	    double multiplier = Math.pow(10, number.length()-1);
	        for(int i=0;i<number.length();i++){
	        	// total = total + (int)multiplier*((int)number.charAt(i) -48);
	        	int charToNum = (int)number.charAt(i);
	        	int minus48 = charToNum -48;
	        	int mult = (int)multiplier*minus48;
	        	
	            total = total + mult; 
	            
	            multiplier/=10;

	        }

	        return total;
	    }
	
}
