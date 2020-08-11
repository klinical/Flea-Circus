
import java.util.ArrayList;
import java.util.List;


public class Game {
    
    private static final int[][] GRID = new int[30][30];
    public static final int MINDIR=1;
    public static final int MAXDIR=4;    
    
    public static void run(int rings) {

        for (int r=0; r<rings; r++) {
            // Fill array values to 1, effectively resetting it each loop
            for (int row=0;row<GRID.length;row++) {
                for (int column=0;column<GRID[row].length;column++) {
                    GRID[row][column]=1;
                }
            }
            for (int row=0; row<GRID.length; row++) {
                
                 for (int column=0; column<GRID[row].length; column++) {
                     
                    int dir = Validator.getRandomIntWithinRange(MINDIR,MAXDIR);
                    
                    switch (dir) {
                        case 1:
                            if (row>0) {
                                GRID[row][column]--;
                                GRID[row-1][column]++;
                            }
                            break;
                        case 2:
                            if (row<3) {
                                GRID[row][column]--;
                                GRID[row+1][column]++;
                            }
                            break;
                        case 3:
                            if (column>0) {
                                GRID[row][column]--;
                                GRID[row][column-1]++;
                            }
                            break;
                        case 4:
                            if (column<3) {
                                GRID[row][column]--;
                                GRID[row][column+1]++;
                            }
                            break;
                            
                        //Debug value - should never appear
                        default:
                            GRID[row][column]=77;
                            break;
                    }     
                 }
            }
        }
    }
    
    public static void displayGrid() {
        for (int row=0; row<GRID.length; row++) {
            System.out.printf("R:"+ "%-2d",row+1);
            System.out.print("   ");
            for (int column=0; column<GRID[row].length; column++) {
                System.out.printf("%-4d",GRID[row][column]);
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
    
    public static void displayStats() {
        List<String> topNums = new ArrayList<>();
        int topNumCount=0;
        int highestNumber = 0;
        int numEmptySquares = 0;
        
        for (int row=0; row<GRID.length; row++) {
            for (int column=0; column<GRID[row].length; column++) {
                if (GRID[row][column]>highestNumber) {
                    highestNumber = GRID[row][column];
                }
            }
        }
        
        System.out.println("Most fleas in one square: "+highestNumber);
        
        for (int row=0; row<GRID.length; row++) {
            for (int column=0; column<GRID[row].length; column++) {
                if (GRID[row][column]==highestNumber&&topNumCount < 3) {
                    topNums.add("("+(row+1)+","+(column+1)+")");
                    topNumCount++;                   
                }
            }
        }
        
        for (int i = 0; i < topNumCount; i++) {
            System.out.println(highestNumber+" occurs at: "+topNums.get(i));
        }
        
        for (int row = 0; row < GRID.length; row++) {
            for (int column = 0; column < GRID[row].length; column++) {
                if (GRID[row][column] == 0) {
                    numEmptySquares++;
                }
            }
        }
        
        System.out.println("Number of empty squares:"+numEmptySquares);
    }
    
}
