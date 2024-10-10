class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int max = 0;
        for(int j=1 ; j<=emergency.length ; j++){
        
       	for(int i=0 ; i<emergency.length ; i++){
            if(emergency[i] > emergency[max]){
                max = i;
            }
        }
            emergency[max] = 0;
            answer[max] = j;
        }
        return answer;
    }
}