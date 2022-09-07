import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int i, j, k;

        for(int m = 0; m < commands.length; m++) {
            i = commands[m][0] - 1;
            j = commands[m][1] - 1;
            k = commands[m][2] - 1;

            int[] a = new int[j - i + 1];
            for(int q = 0; q < j - i + 1; q++){
                a[q] = array[i + q];
            }
            Arrays.sort(a);
            answer[m] = a[k];
        }

        return answer;
    }
}