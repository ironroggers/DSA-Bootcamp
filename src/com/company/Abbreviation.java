import java.util.Scanner;

public class Abbreviation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        printAbbreviation(str,"",0);
    }

    private static void printAbbreviation(String str, String ans, int count) {
        if(str.length()==0){
            if(count!=0){
                System.out.println(ans+count);
            }else{
                System.out.println(ans);
            }

            return;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        if(count>0){
            printAbbreviation(ros,ans+count+ch, 0);
        }else {
            printAbbreviation(ros,ans+ch, 0);
        }
        printAbbreviation(ros,ans, count+1);
    }
}
