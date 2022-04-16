
package compoundinterestcalculator;

/**
 *
 * @author Malhar Pandya
 * Calculates Compound Interest on your Investments.
 */

import java.util.Scanner;

public class CompoundInterestCalculator {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        double principal;
        double totalAmount;
        double interestRate;
        double time;
        double numberOfTimesInterestIsCompounded;
         
        
        System.out.println("Enter Initial Investment: ");
        principal = input.nextDouble();
        
        System.out.println("Enter Annual Rate (decimal): ");
        interestRate = input.nextDouble();
        
        System.out.println("Enter # of Compounds per Year: ");
        numberOfTimesInterestIsCompounded = input.nextDouble();
        
        System.out.println("Enter Time (years): ");
        time = input.nextDouble();
        
        
        double R;
        double n;
        
        R = (interestRate / numberOfTimesInterestIsCompounded);
        n = (numberOfTimesInterestIsCompounded * time);
        
        totalAmount = principal * Math.pow(1 + R, n);
        
        System.out.printf("You will have: $%,.2f after %.0f years.", totalAmount, time);
        
    }
    
}
