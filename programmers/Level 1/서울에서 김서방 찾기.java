class Solution {
    public String solution(String[] seoul) {
        int idx = 0;
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                break;
            }
            idx += 1;
        }
        
        return String.format("김서방은 %d에 있다", idx);
    }
}