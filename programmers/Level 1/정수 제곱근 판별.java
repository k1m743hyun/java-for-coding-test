import java.lang.Math;

class Solution {
    public long solution(long n) {
        double answer = Math.sqrt(n);
        if (answer == (int)answer) {
            return (long)Math.pow(answer + 1, 2);
        }
        else {
            return -1;
        }
    }
}