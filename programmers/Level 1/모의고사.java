import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {0, 0, 0};
        for (int i = 0; i < answers.length; i++) {
            switch (i % 5) {
                case 0: answer[0] += (answers[i] == 1) ? 1 : 0;
                    break;
                case 1: answer[0] += (answers[i] == 2) ? 1 : 0;
                    break;
                case 2: answer[0] += (answers[i] == 3) ? 1 : 0;
                    break;
                case 3: answer[0] += (answers[i] == 4) ? 1 : 0;
                    break;
                case 4: answer[0] += (answers[i] == 5) ? 1 : 0;
                    break;
            }
            
            if (i % 2 == 0) {
                answer[1] += (answers[i] == 2) ? 1 : 0;
                switch ((i % 10) / 2) {
                    case 0: answer[2] += (answers[i] == 3) ? 1 : 0;
                        break;
                    case 1: answer[2] += (answers[i] == 1) ? 1 : 0;
                        break;
                    case 2: answer[2] += (answers[i] == 2) ? 1 : 0;
                        break;
                    case 3: answer[2] += (answers[i] == 4) ? 1 : 0;
                        break;
                    case 4: answer[2] += (answers[i] == 5) ? 1 : 0;
                        break;
                }
            }
            else {
                switch ((i % 8) / 2) {
                    case 0: answer[1] += (answers[i] == 1) ? 1 : 0;
                        break;
                    case 1: answer[1] += (answers[i] == 3) ? 1 : 0;
                        break;
                    case 2: answer[1] += (answers[i] == 4) ? 1 : 0;
                        break;
                    case 3: answer[1] += (answers[i] == 5) ? 1 : 0;
                        break;
                }
                
                switch ((i % 10) / 2) {
                    case 0: answer[2] += (answers[i] == 3) ? 1 : 0;
                        break;
                    case 1: answer[2] += (answers[i] == 1) ? 1 : 0;
                        break;
                    case 2: answer[2] += (answers[i] == 2) ? 1 : 0;
                        break;
                    case 3: answer[2] += (answers[i] == 4) ? 1 : 0;
                        break;
                    case 4: answer[2] += (answers[i] == 5) ? 1 : 0;
                        break;
                }
            }
        }
        
        int max = 0;
        for (int j = 0; j < answer.length; j++) {
            if (max < answer[j]) {
                max = answer[j];
            }
        }
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int k = 0; k < answer.length; k++) {
            if (answer[k] == max) {
                result.add(k + 1);
            }
        }
        
        int[] res = new int[result.size()];
        for (int l = 0; l < res.length; l++)
        {
            res[l] = result.get(l).intValue();
        }
        
        return res;
    }
}