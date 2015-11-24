/*
 * Enter a number and have the program generate PI up to that many decimal 
places. Keep a limit to how far the program will go.
 */
package pitonthdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 *
 * @author Dan Bennett
 */
public class PiToNthDecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter the number of decimals in PI you would like to"
                + " view.  (No more than 100 decimals.)");
        Scanner ip = new Scanner(System.in);
        int ip1 = ip.nextInt();
        
        BigDecimal bd1 = new BigDecimal(22);
        BigDecimal bd2 = new BigDecimal(7);
        
        if(ip1 <= 100){
            System.out.println("PI to the " + ip1 + " decimal is: " + bd1.divide(bd2, ip1, RoundingMode.CEILING));
        }else{
            System.out.println("We can only display to 100 digits.  Program is now closing.");
        }
    }
}
