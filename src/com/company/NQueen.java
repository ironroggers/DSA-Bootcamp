import java.util.Scanner;

public class NQueen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int [][] chess = new int[N][N];
        boolean[] c = new boolean[N];
        boolean[] nd = new boolean[(2*N)-1];
        boolean[] rd = new boolean[(2*N)-1];
        printNQueen(chess,"",0,c,nd,rd);
    }


    private static void printNQueen(int[][] chess, String qsf, int row, boolean[]c, boolean[] nd, boolean[] rd) {
        if(row==chess.length){
            System.out.println("-------------------------------");
            printChessBoard(chess);
            System.out.println("-------------------------------");
//            System.out.println(qsf);
            return;
        }
        for(int col=0;col<chess[0].length;col++){
            if(!nd[row+col] && !rd[row-col+chess.length-1] && !c[col] ) {
                chess[row][col] = 1;
                c[col] = true;
                nd[row + col] = true;
                rd[row - col + chess.length - 1] = true;
                printNQueen(chess, qsf + row + "-" + col + ",", row + 1, c, nd, rd);
                chess[row][col] = 0;
                c[col] = false;
                nd[row + col] = false;
                rd[row - col + chess.length - 1] = false;
            }
        }
    }

    private static void printChessBoard(int[][] chess) {
        for(int i=0;i< chess.length;i++){
            for(int j=0;j< chess[0].length;j++){
                System.out.print(chess[i][j]);
            }
            System.out.println();
        }

    }
}
