import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String[] answer = s.split("");
        
        Arrays.sort(answer);
        Collections.reverse(Arrays.asList(answer));
        
        return  String.join("",answer);
    }
}