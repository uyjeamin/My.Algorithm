class Solution {
    public int solution(int hp) {
        int answer = 0;
        int w,b,j;
        j = hp/5;
        hp = hp - (j*5);
      
        b = hp/3;
        hp = hp - (b*3);
        
        w = hp/1;
        hp = hp - (w);
        
        
        return w+b+j;
    }
}