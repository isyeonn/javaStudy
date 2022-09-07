import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int helped = 0;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        //잃어버린 학생들 비교
        for(int i = 0; i < lost.length; i++){
            //여유분 가져온 학생들 비교 - 자기자신
            for(int j = 0; j < reserve.length; j++){
                if(lost[i] == reserve[j]){

                    lost[i] = -1;
                    reserve[j] = -1;
                    helped++;
                    break;

                }
            }
        }

        //여유분 가져온 학생들 비교 - 앞뒤
        for(int i = 0; i < lost.length; i++){
            if(lost[i] == -1){
                continue;
            }   
            for(int j = 0; j < reserve.length; j++){
                if(reserve[j] != -1 && Math.abs(lost[i] - reserve[j]) == 1){

                    reserve[j] = -1;
                    helped++;
                    break;

                }
            }

        }

        answer = n - (lost.length - helped);


        return answer;
    }
}