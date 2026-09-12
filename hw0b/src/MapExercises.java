import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        Map<Character,Integer> ans = new HashMap<>();
        for(char l='a';l<='z';l++){
            int n=l-'a'+1;
            ans.put(l,n);
        }
        return ans;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        Map<Integer,Integer> ans = new HashMap<>();
        for(int num:nums){
            ans.put(num,num*num);
        }
        return ans;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        Map<String,Integer> ans = new HashMap<>();
        for(String word:words){
            int count = ans.getOrDefault(word,0);
            ans.put(word,count+1);
        }
        return ans;
    }
}
