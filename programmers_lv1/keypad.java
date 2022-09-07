class Main3 {
  public static void main(String[] args) {

    int[] numbers;
    String hand;


    numbers = new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
    hand = "right";
    
    System.out.println(solution(numbers, hand));
    System.out.println("LRLLLRLLRRL");


    numbers = new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
    hand = "left";

    System.out.println(solution(numbers, hand));
    System.out.println("LRLLRRLLLRR");
    
  }


  public static String solution(int[] numbers, String hand) {
        String answer = "";
        
        //현재 위치
        int left = 10; //*
        int right = 12; //#

        int ld = 0; //왼쪽 거리
        int rd = 0; //오른쪽 거리
        
        String type = ""; //초기화
        
        for(int num : numbers){
            if(num == 0) {
                num = 11;
            }
          
            if(num % 3 == 0){
                type = "right";
            } else if(num % 3 == 1){
                type = "left";
            } else {

                //2, 5, 8, 0
                ld = (Math.abs(num - left) / 3) + (Math.abs(num - left) % 3);
                rd = (Math.abs(num - right) / 3) + (Math.abs(num - right) % 3);

                if(ld < rd) {
                    type = "left";
                } else if(ld > rd) {
                    type = "right";
                } else {
                    type = hand;
                }
            }
        
            if(type.equals("left")) {
                answer += "L";
                left = num;
            } else {
                answer += "R";
                right = num;
            }
            
        }
        
        return answer;
    }
    
}