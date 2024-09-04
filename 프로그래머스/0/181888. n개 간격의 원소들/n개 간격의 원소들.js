function solution(num_list, n) {
    var answer = [];
    for(let i=0 ; i<num_list.length ; i++){
        if(num_list[n*i] == null){
            break;
        }
        answer[i] = num_list[n*i];
        
    }
    return answer;
}