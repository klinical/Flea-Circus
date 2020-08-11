
import java.util.Scanner;

public class Validator {
    
    private final static Scanner SC = FleaCircus.SC;
    
    public static int getRandomIntWithinRange(int min, int max) {
        int i=(int)(Math.random()*max+min);
        return i;
    }
    
    public static int getInt(String prompt) {
        int i=0;
        String preSel;
        boolean isValid = false;
        
        while (!isValid) {
            System.out.print(prompt);
            preSel = SC.nextLine();
            try {
                i=Integer.parseInt(preSel);
                isValid=true;
            } catch (NumberFormatException e) {
                System.out.print("Error, invalid input. Please try again.\n");
            }
        }
        return i;
    }
        
    public static int getIntWithinRange(String prompt, int min, int max) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            i = getInt(prompt);
            if (i <= min) {
                System.out.println("Error, Number must be greater than "+min+".");
            } else if (i >= max) {
                System.out.println("Error, Number must be less than "+max+".");
            } else {
                isValid = true;
            }
        }
        return i;
    }
    
    public static double getDouble(String prompt) {
        double d=0;
        String preSel;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            preSel = SC.nextLine();
            try {
                d=Integer.parseInt(preSel);
                isValid=true;
            } catch (NumberFormatException e) {
                System.out.print("Error, invalid input. Please try again.\n");
            }
        }
        return d;
    }
    
    public static double getDoubleWithinRange(String prompt, double min, double max) {
        double d = 0;
        boolean isValid = false;
        while (!isValid == false) {
            d = getDouble(prompt);
            if (d <= min) {
                System.out.println("Error, Number must be greater than "+min+".");
            } else if (d >= max) {
                System.out.println("Error, Number must be less than "+max+".");
            } else {
                isValid = true;
            }
        }
        return d;
    }
}
