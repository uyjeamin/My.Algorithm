function solution(li) {
    var answer = li.sort((a, b) => a - b);    
    return li.slice(5);
}