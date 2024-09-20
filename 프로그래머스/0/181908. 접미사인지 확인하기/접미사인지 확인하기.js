function solution(my_string, is_suffix) {
    var answer = 0;
    let my_suffix = my_string.slice(-is_suffix.length)
    //for(let i=1 ; i<=is_suffix.length ; i++){
        if(my_suffix === is_suffix){
            answer = 1;
        }else{
            answer = 0;
        }
        return answer;
    //}
}