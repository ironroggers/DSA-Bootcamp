import java.util.ArrayList;
import java.util.Scanner;

public class GoldMine2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int m = in.nextInt();
        int [][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               arr[i][j]=in.nextInt();
            }
        }
        boolean [][] visited = new boolean[n][m];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int gold = printMaxGold(arr,i,j,visited);
                if(gold!=0){
                    list.add(gold);
                }
            }
        }

        System.out.println(list);
    }

    private static int printMaxGold(int[][] arr, int row, int col, boolean [][] visited) {
        if((row==arr.length) || (col==arr[0].length) || (row<0) || (col<0) || visited[row][col] || (arr[row][col]==0)){
            return 0;
        }
        visited[row][col]=true;
        return   arr[row][col] + printMaxGold(arr,row+1,col,visited) +
                      printMaxGold(arr,row,col+1,visited) +
                      printMaxGold(arr,row-1,col,visited) +
                      printMaxGold(arr,row,col-1,visited);


    }
}
