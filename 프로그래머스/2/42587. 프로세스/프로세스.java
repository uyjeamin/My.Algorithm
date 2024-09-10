import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int solution(int[] priorities, int location) {
        int temp = 0;
        int answer=0;
        int[] arr = new int[priorities.length];
        
     PriorityQueue<Integer>pQ=new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0 ; i<priorities.length ; i++){   
            
            arr[i] = i; 
            pQ.offer(priorities[i]);  
        }
        while(!pQ.isEmpty())
        for(int i=0 ; i<priorities.length;i++){
            if(pQ.peek() == priorities[i]){ //9 1, 9 1, 9 9,1 1,1 1,1 1,1, 1
                pQ.poll();//9,1,1,1
                answer++;//1,2,3,4,5
                if(i == location){
                    return answer;
                }
            }
        }       
        return answer;
        
    }
}