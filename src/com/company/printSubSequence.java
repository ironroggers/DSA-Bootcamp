public class printSubSequence {
    public static void main(String[] args) {
        String q = "atul";
        printSubSeq(q,"");

    }
    public static void printSubSeq(String ques, String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        String roq = ques.substring(1);
        printSubSeq(roq,ans+ch);
        printSubSeq(roq,ans+"");

    }
}
