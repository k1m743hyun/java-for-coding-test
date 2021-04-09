class Solution {
    boolean solution(String s) {
        String[] sArr = s.toLowerCase().split("");

        int pc = 0;
        int yc = 0;
        for (String c : sArr) {
            if (c.equals("p")) {
                pc++;
            }
            
            else if (c.equals("y")) {
                yc++;
            }
        }
     
        return pc == yc ? true : false;
    }
}