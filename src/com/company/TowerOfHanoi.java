import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        toh(n,"A","B","C");
    }

    public static void toh(int num,String A,String B,String C) {
        if((num)==0){
            return;
        }
        toh(num-1,A,C,B);
        System.out.println(num+" "+A+"->"+B);
        toh(num-1,C,B,A);
    }
}
