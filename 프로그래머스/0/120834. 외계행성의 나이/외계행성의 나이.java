//import java.lang.StringBuffer; 프로그래머스에서 임포트 안해도 됨.

class Solution {
    public String solution(int age) {
        //아스키 a == 97
        int temp;
        int count=0;
        StringBuffer str = new StringBuffer();
        String result;
        
        while(age > 0){
       	temp = age%10; 
        age /= 10;
 
        temp += 97;

        char charAge = (char)temp;
            str.insert(count++,charAge);    
        }
        
        return str.reverse().toString();
    }
}