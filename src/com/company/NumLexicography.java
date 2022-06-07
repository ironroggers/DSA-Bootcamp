import java.util.Scanner;

public class NumLexicography {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=9;i++){
            printLex(i,n);
        }
    }

    private static void printLex(int i ,int n){
        if(i>n){
            return;
        }
        System.out.print(i+",");
        for(int j=0;j<10;j++){
            printLex(10*i+j ,n);
        }
    }
}
