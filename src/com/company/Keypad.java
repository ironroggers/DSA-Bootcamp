import java.util.*;
public class Keypad {
    public static void main(String[] args) {
        Map<Character,String> map = new HashMap<>();
        map.put('0',",;");
        map.put('1',"abc");
        map.put('2',"def");
        map.put('3',"ghi");
        map.put('4',"jkl");
        map.put('5',"mno");
        map.put('6',"pqrs");
        map.put('7',"tu");
        map.put('8',"vwx");
        map.put('9',"yz");
        String num = "678";
        List<String> list = getKeypadWords(map,num);
        System.out.println(list);
    }

    private static List<String> getKeypadWords(Map<Character, String> map, String num) {
        if(num.length()==0){
            List<String> rest = new ArrayList<>();
            rest.add("");
            return rest;
        }
        char ch = num.charAt(0);
        String sub = num.substring(1);
        List<String> list = getKeypadWords(map,sub);
        List<String> rest = new ArrayList<>();
        String codeforch = map.get(ch);
        for(int i=0;i<codeforch.length();i++){
            char chcode = codeforch.charAt(i);
            for(String rstr : list){
                rest.add(chcode+rstr);
            }
        }
        return rest;
    }

}
