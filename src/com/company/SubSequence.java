import java.util.*;

public class SubSequence {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(getSubSequence(s));
    }
    public static List<String> getSubSequence(String s){
        if(s.length()==0){
            List<String> list = new ArrayList<>();
            list.add(" ");
            return list;
        }
        char ch = s.charAt(0);
        String rstr = s.substring(1);
        List<String> l1 = getSubSequence(rstr);
        List<String> l2 = new ArrayList<>();
        for(String x : l1){
            l2.add(x);
            l2.add(ch+x);
        }
        return l2;
    }
}
