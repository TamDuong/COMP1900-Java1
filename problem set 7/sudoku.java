import java.util.*;
/**
 * Tam Duong
 * COMP 1900
 * PS7
 * 11/14/2013
 * Sudoku
 */
public class sudoku
{
    public static boolean isValidSolution(int[][] a)
    {
        boolean answer = true;
        for(int i = 0; i < 9; i++){            
            for(int j = 1; j < 9; j++){
                if(a[i][0] == a[i][j])
                    answer = false;
            }
        }
        
        for(int j = 0; j < 9; j++){            
            for(int i = 1; i < 9; i++){
                if(a[0][j] == a[j][i])
                    answer = false;
            }
        }
                
        return answer;
    }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[][] sudoku = new int[9][9];
        System.out.println("Enter a solved sudoku solution:");
        
        //read sudoku solution
        for(int i = 0; i < sudoku.length; i++){
            for(int j = 0; j < sudoku[i].length; j++){
                sudoku[i][j] = input.nextInt();
            }
        }
        
        System.out.println("The solved sudoku puzzle is: "+isValidSolution(sudoku));
    }
}

