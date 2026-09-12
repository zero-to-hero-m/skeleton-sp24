import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        int total=0;
        for(int i:L){
            total+=i;
        }
        return total;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        List<Integer> ans = new ArrayList<>();
        for(int i:L){
            if(i%2==0)ans.add(i);
        }
        return ans;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        List<Integer> ans = new ArrayList<>();
        for(int num:L1){
            if(L2.contains(num))ans.add(num);
        }
        return ans;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        int times=0;
        for(String num:words){
            for(int i=0;i<num.length();i++){
                if(num.charAt(i)==c)times++;
            }
        }
        return times;
    }
}
