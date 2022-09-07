import java.util.HashMap;

class Main5 {
  public static void main(String[] args) {

    String[] participant;
    String[] completion;

    participant = new String[]{"leo", "kiki", "eden"};
    completion = new String[]{"eden", "kiki"};
    System.out.println(solution(participant, completion));

    
    participant = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
    completion = new String[]{"josipa", "filipa", "marina", "nikola"};
    System.out.println(solution(participant, completion));
  }

  public static String solution(String[] participant, String[] completion) {
      String answer = "";
        HashMap<String, Integer> pp = new HashMap<>();

        for(String p : participant){
            pp.put(p, pp.getOrDefault(p, 0) + 1);
        }       

        for(String c : completion){
            pp.put(c, pp.get(c) - 1);
        }

        for(String key : pp.keySet()){
            if(pp.get(key) > 0) {
                answer = key;
            }

        }

        return answer;
  }
}