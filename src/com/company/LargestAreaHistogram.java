import java.util.Arrays;
import java.util.Stack;

public class LargestAreaHistogram {
    public static void main(String[] args) {
        int [] area = new int[]{2,1,5,6,2,3};
        int [] nse = nextSmallElement(area);
        int [] pse = prevSmallElement(area);
        int max = 0;
//        System.out.println(Arrays.toString(pse));
        for(int i=0;i< area.length;i++){
            int temp = area[i]*(1+nse[i]+pse[i]);
            if(temp>max){
                max=temp;
            }
        }
        System.out.println(max);
    }

    private static int[] prevSmallElement(int[] area) {
        Stack<Integer> st = new Stack<>();
        int [] pse = new int[area.length];
        pse[0]=0;
        st.push(0);
        for(int i=1;i< area.length;i++){
            while(!st.isEmpty() && area[st.peek()]>=area[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[i]=i;
            }else {
                pse[i]=i-1-st.peek();
            }
            st.push(i);
        }
        return pse;
    }

    private static int[] nextSmallElement(int[] area) {
        int [] nse = new int[area.length];
        Stack<Integer> st = new Stack<>();
        nse[area.length-1]=0;
        st.push(area.length-1);
        for(int i=area.length-2; i>=0;i--){
            while(!st.isEmpty() && area[st.peek()]>=area[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i]= area.length-1-i;
            }else {
                nse[i]= st.peek()-i-1;
            }
            st.push(i);
        }
        return nse;

    }
}
