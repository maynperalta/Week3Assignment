package week3Assignment;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in); 
		DecimalFormat decFor = new DecimalFormat("$#,###.00"); /* decimal formatter for final output */
		double coupon;
		double weekOneBill;
		double weekTwoBill;
		double weekThreeBill;
		double weekFourBill;
		double monthlyTotal;
		double monthlyTotalCoupon;
		double weeklyAverage;
		double weeklyAverageCoupon;
		double couponPercentage;
		
		System.out.println("Please enter your coupon amount as a decimal (example: .10 for 10%):");
		coupon = scnr.nextDouble();
		
		if (coupon <= 0 || coupon >= 1) {
			System.out.println("Invalid coupon value. Defaulting to 10% (.10)."); /* default coupon to 10 percent if invalid */
			coupon = 0.10;
		}
		
		couponPercentage = coupon * 100;  /* convert coupon value entered and display as percentage */
		System.out.println("You have entered a coupon for " + couponPercentage + "%.");
			
		System.out.println("Please enter your grocery bill for week 1:");
		weekOneBill = scnr.nextDouble();
		
		System.out.println("Please enter your grocery bill for week 2:");
		weekTwoBill = scnr.nextDouble();
		
		System.out.println("Please enter your grocery bill for week 3:");
		weekThreeBill = scnr.nextDouble();
		
		System.out.println("Please enter your grocery bill for week 4:");
		weekFourBill = scnr.nextDouble();
		
		monthlyTotal = (weekOneBill + weekTwoBill + weekThreeBill + weekFourBill); /* calculations and totals with and without coupon */
		monthlyTotalCoupon = monthlyTotal * (1 - coupon);
		weeklyAverage = monthlyTotal / 4.0;
		weeklyAverageCoupon = monthlyTotalCoupon / 4.0;
				
		System.out.println("Your monthly total grocery bill without a coupon is: " + decFor.format(monthlyTotal));
				
		System.out.println("Your monthly total grocery bill with a coupon is: " + decFor.format(monthlyTotalCoupon));		
		
		System.out.println("Your weekly average grocery bill without a coupon is: " + decFor.format(weeklyAverage));
		
		System.out.println("Your weekly average grocery bill with a coupon is: " + decFor.format(weeklyAverageCoupon));
		
		scnr.close(); /* Close scanner */
	}

}
