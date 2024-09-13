function solution(n, k) {
    var answer = [];
    let j=0;
    for(let i=1 ; i<=n ; i++){
        if(i%k===0){
            answer[j++] = i;
        }
    }
    return answer;
}