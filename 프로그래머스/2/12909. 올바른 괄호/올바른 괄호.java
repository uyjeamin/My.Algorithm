class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int count=0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        //만약 입력값이 ( 라면
    //"(" 이 들어오지 않는 순간에 "(" 가 들어온 수 카운트한만큼  ")" 여야함 
    //만약 정상적으로 작동하지 않은 경우 ")" 가 맨처음에 들어오거나 연산이 끝났을 때 카운트에 숫자가 남아있는 경우
        for(int i=0 ; i<s.length() ; i++){
            if(count < 0){
                return false;
            }
            
            if(s.charAt(i) == '('){
                count++;
            }else{
                count--;
            }
        }
        
        if(count == 0){
            return true;
        }else{
            return false;
        }
       }
}