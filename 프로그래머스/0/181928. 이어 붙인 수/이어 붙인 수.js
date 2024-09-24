function solution(num_list) {
    var answer = 0;
    let sum1 ='';
    let sum2 ='';
    for(let num of num_list){
        if(num %2 == 0){
            sum1 += num;
        }else{
            sum2 += num;
        }
    }
    
    answer = parseInt(sum1)+ parseInt(sum2);
    return answer;
}