import java.util.*;

public class Sudoku {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [][] sudoku = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sudoku[i][j]=in.nextInt();
            }
        }

        printSudoku(sudoku,0,0);


    }
    public static void displayBoard(int [][] sudoku){
        System.out.println("----------------------------------------");
        for(int i=0;i< sudoku.length;i++){
            for(int j=0;j< sudoku.length;j++){
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void printSudoku(int[][] sudoku,int row,int col) {
        if(row== sudoku.length){
            displayBoard(sudoku);
            return;
        }
        int ni = 0;
        int nj=0;
        if(col==sudoku[0].length-1){
            ni=row+1;
            nj=0;
        }else{
            ni=row;
            nj=col+1;
        }
        if(sudoku[row][col]!=0){
            printSudoku(sudoku,ni,nj);
        }else{
            for(int i=1;i<=sudoku.length;i++){
                if(isSatisfy(sudoku, i,row,col)){
                    sudoku[row][col]=i;
                    printSudoku(sudoku,ni,nj);
                    sudoku[row][col]=0;
                }
            }
        }
    }

    private static boolean isSatisfy(int[][] sudoku, int num,int row, int col) {
        for(int i = 0;i<sudoku.length;i++){
            if(sudoku[row][i] == num){
                return false;
            }
        }
        for(int i = 0;i<sudoku.length;i++){
            if(sudoku[i][col] == num){
                return false;
            }
        }
        int x = 3*(row/3);
        int y = 3*(col/3);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(sudoku[x+i][y+j]==num){
                    return false;
                }
            }
        }
        return true;
    }

}
