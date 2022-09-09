import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] score = new int[3];
        int[] pattern1 = {1, 2, 3, 4, 5};
        int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for(int i = 0; i < answers.length; i++) {
            //1번
            if(pattern1[i % 5] == answers[i])   score[0]++;
            //2번
            if(pattern2[i % 8] == answers[i])   score[1]++;
            //3번
            if(pattern3[i % 10] == answers[i])   score[2]++;
        }
        
        int[] top = {};
        top = Arrays.copyOf(score, score.length);
        Arrays.sort(top);//점수 값을 정렬
        
        //최고점을 받은 학생 수
        int topCnt = 0;
        for(int i = 0; i < score.length; i++){
            if(score[i] == top[top.length - 1]) topCnt++;
        }
        
        answer = new int[topCnt];
        int index = 0;
        for(int i = 0; i < score.length; i++) {
            
            if(score[i] == top[top.length - 1]) {
                answer[index] = i + 1; //학생번호를 담는다
                index++;
            }
        }
        
        
        return answer;
    }
}