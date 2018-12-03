import java.util.Scanner;
import java.text.DecimalFormat;

public class geometricSeriesCalculator {

	private double firstTerm;
	private double commonRatio;
	private double precision;
	private double total;
	private Scanner input = new Scanner(System.in);
	
	
	public void getValues() {
		
		System.out.println("Program developed by Forrester Hinds\nGeometric Series Calculator");
		
		
		System.out.println("First term: ");
		firstTerm = input.nextDouble();
		
		while (firstTerm <= 0) {
			
			System.out.println("Error. Please select a non-zero value, First term: ");
			firstTerm = input.nextDouble();
			
		}
		
		System.out.println("Common Ratio: ");
		commonRatio = input.nextDouble();
		
		while (commonRatio >= 1 || commonRatio <= -1) {
			
			System.out.println("Error. Please select a value between -1 and 1, Common ratio: ");
			commonRatio = input.nextDouble();
			
		}
		
		System.out.println("Precision: ");
		precision = input.nextDouble();
			
		while (precision < 0) {
			
			System.out.println("Error. Please select a non-negative value, Precision: ");
			precision = input.nextDouble();
						
		}
		
	} // end of getValues
	
	public void calculateSeries() {
		
		total = 0;
		double term = firstTerm;
		
		while (term > precision || -term > precision) {
			
			total = total + term;
			term = term * commonRatio;
						
		}
		
		
	} //end of calculateSeries
	
	public void display() {
		
		DecimalFormat df = new DecimalFormat("#.####"); //use DecimalFormat to round the numbers to four decimals.
		
		System.out.println("Total = " + df.format(total));
		
	} //end of display class
	
} // end of class
