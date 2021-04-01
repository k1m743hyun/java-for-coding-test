import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 0 || arr.length == 1) {
            return arr;
        }
        
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp.add(arr[i]);
            }
        }
        
        if (temp.size() > 1 && temp.get(temp.size() - 1) != arr[arr.length - 1]) {
            temp.add(arr[arr.length - 1]);
        }
        else {
            temp.add(arr[arr.length - 1]);
        }
        
        int[] answer =  new int[temp.size()];
        int size = 0;
        for(int item : temp) {
            answer[size++] = item;
        }

        return answer;
    }
}