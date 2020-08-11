
import java.util.Scanner;

public class FleaCircus {
    public static Scanner SC = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int cont;
        do {
            Menu.Menu();
            System.out.println("\n\nWould you like to run another round?");
            cont=Validator.getIntWithinRange("Enter 1 for yes, 2 for no: ",0,3);
        } while(cont==1);
        
        System.out.println("\nThank You for Playing!");
        
    }
}
