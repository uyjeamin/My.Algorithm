function solution(start_num, end_num) {
    var answer = [];
    for(let i=0 ; i<=start_num - end_num;i++){
        answer[i] = start_num-i;
    }
    return answer;
}