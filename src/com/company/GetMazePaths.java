import java.util.Scanner;

public class GetMazePaths {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int [][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=in.nextInt();
            }
        }
        boolean [][] visited = new boolean[n][m];
        showPath(arr,0,0,"",visited);
    }

    public static void showPath(int[][] arr, int row, int col, String psf, boolean[][] visited) {
        if(row<0 || col<0 || row==arr.length || col==arr[0].length || arr[row][col]==1 || visited[row][col]){
            return;
        }
        if(row==arr.length-1 && col==arr[0].length-1){
            System.out.println(psf);
            return;
        }
        visited[row][col]=true;
        showPath(arr,row-1,col,psf+"t",visited);
        showPath(arr,row,col+1,psf+"r",visited);
        showPath(arr,row+1,col,psf+"d",visited);
        showPath(arr,row,col-1,psf+"l",visited);
        visited[row][col]=false;
    }
}
