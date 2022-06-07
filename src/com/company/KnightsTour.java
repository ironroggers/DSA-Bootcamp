import java.util.Scanner;

public class KnightsTour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int row=in.nextInt();
        int col=in.nextInt();
        int [][] chess = new int[N][N];
        printKnightsTour(chess,row,col,1);

    }

    private static void displayChessBoard(int [][] chess) {
        for(int i=0;i< chess.length;i++){
            for(int j=0;j< chess.length;j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void printKnightsTour(int[][] chess, int row, int col,int move) {

        if(row>=chess.length || col>=chess.length || row<0 || col<0 || chess[row][col]>0){
            return;
        }else if(move == chess.length*chess.length){
            chess[row][col]=move;
            displayChessBoard(chess);
            chess[row][col]=0;
            return;
        }

        chess[row][col]=move;
        printKnightsTour(chess,row-2,col-1,move+1);
        printKnightsTour(chess,row-2,col+1,move+1);
        printKnightsTour(chess,row-1,col-2,move+1);
        printKnightsTour(chess,row+1,col-2,move+1);
        printKnightsTour(chess,row+2,col+1,move+1);
        printKnightsTour(chess,row+2,col-1,move+1);
        printKnightsTour(chess,row-1,col+2,move+1);
        printKnightsTour(chess,row+1,col+2,move+1);
        System.out.println("loading...");
        chess[row][col]=0;
    }

}
