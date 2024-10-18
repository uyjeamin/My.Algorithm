function solution(li) {
    var answer = li.sort((a, b) => a - b);
    console.log(answer)
    answer = answer.slice(5)
    console.log(answer)
    
    
    return answer;
}