function solution(my_string, is_prefix) {
    var answer = 0;
    for(let i=0 ; i<is_prefix.length ; i++){
        if(!(my_string[i] === is_prefix[i])){
            return answer;
        }
    }
    answer = 1;
    return answer;
}