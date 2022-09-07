import java.util.ArrayList;

class Main4{
  public static void main(String[] args) {

    int[] numbers;

    numbers = new int[]{3,3,3,2,2,4};
    System.out.println(solution(numbers)+"");

    
    numbers = new int[]{3,3,3,2,2,2};
    System.out.println(solution(numbers)+"");
  }

  public static int solution(int[] nums) {
      int answer = 0;
      ArrayList<Integer> type = new ArrayList<>();
      
      for(int num : nums){
          if( !type.contains(num) ){
              type.add(num);
          }
      }
      
      if(nums.length/2 <= type.size()){
          answer = nums.length/2;
      } else {
          answer = type.size();
      }
      
      return answer;
  }
}