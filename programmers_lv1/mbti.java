import java.util.HashMap;

class Main2 {
  public static void main(String[] args) {

    String[] survey = new String[]{"AN", "CF", "MJ", "RT", "NA"};
    int[] choices = new int[]{5, 3, 2, 7, 5};
    
    System.out.println(solution(survey, choices));

    survey = new String[]{"TR", "RT", "TR"};
    choices = new int[]{7, 1, 3};
    System.out.println(solution(survey, choices));
  }


  public static String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<String, Integer> num = new HashMap<String, Integer>();
        num.put("R", 0);
        num.put("T", 0);
        num.put("C", 0);
        num.put("F", 0);
        num.put("J", 0);
        num.put("M", 0);
        num.put("A", 0);
        num.put("N", 0);
        
        for(int c = 0; c < choices.length; c++) {
            String type = "";
            if(choices[c] < 4) {
                type = survey[c].substring(0, 1);
                num.put(type, num.get(type) + choices[c]);
            } else {
                type = survey[c].substring(1, 2);
                num.put(type, num.get(type) + choices[c] - 5);
            }
        }
        
        answer = "RCJA";
        if(num.get("R") < num.get("T")) {
            answer = "T" + answer.substring(1, 4);
        }
        if(num.get("C") < num.get("F")) {
            answer = answer.substring(0, 1) + "F" + answer.substring(2, 4);
        }
        if(num.get("J") < num.get("M")) {
            answer = answer.substring(0, 2) + "M" + answer.substring(3, 4);
        }
        if(num.get("A") < num.get("N")) {
            answer = answer.substring(0, 3) + "N";
        }
        
        return answer;
    }
}