public class RowColumnSorted {
    public static void main(String[] args) {

        int [][] arr = new int[][]{{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int row=0;
        int col=arr.length-1;
        int num =29;
        while(row<arr.length && col>0){
            if(arr[row][col]>num){
                col--;
            }else if(arr[row][col]<num){
                row++;
            }else if(arr[row][col]==num){
                System.out.println("Row = "+row+" Col = "+col);
                return;
            }
        }
        System.out.println("Not Found");
    }
}
