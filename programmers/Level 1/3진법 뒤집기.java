class Solution {
    public int solution(int n) {
        int len = (int)(Math.log10(n) / Math.log10(3)) + 1;
        int[] numArr = new int[len];
        for (int i = 0; i < len; i++) {
            numArr[i] = (int)(n % 3);
            n /= 3;
        }
        int answer = 0;
        for (int j = len - 1; j > -1; j--) {
            answer += numArr[j] * Math.pow(3, len - (j + 1));
        }
        return answer;
    }
}