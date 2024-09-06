function solution(num_list, n) {
    var answer = [];
            let a=0;
    for(let i=n-1 ; i<num_list.length ; i++){
        
        answer[a++] = num_list[i];
    }
    return answer;
}