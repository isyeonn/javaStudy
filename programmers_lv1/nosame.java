import java.util.*;

public class Nosame_Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> ddd = new ArrayList<>();

        ddd.add(arr[0]);

        for(int i = 1; i < arr.length; i++) {
            if(ddd.get(ddd.size() - 1) != arr[i]){
                ddd.add(arr[i]);
            }
        }

        int[] answer = new int[ddd.size()];
        for(int i = 0; i < ddd.size(); i++) {
            answer[i] = ddd.get(i);
        }

        return answer;
    }
}