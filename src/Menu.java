
public class Menu {
    private static final String PROMPT = "How many times would you like the bell to ring? ";
    
    public static void Menu() {
        int rings;

        System.out.println("Welcome to the Flea Circus!");
        rings = Validator.getIntWithinRange(PROMPT, 0, 100000);
        System.out.println("");

        Game.run(rings);
        Game.displayGrid();
        Game.displayStats();
        
    }
}
