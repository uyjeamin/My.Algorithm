function solution(x) {
    var answer;
    let total = 0;
    let strX = String(x);
    for(let i=0 ; i<strX.length ; i++){
        total += parseInt(strX[i]);
    }
    if(x%total == 0){
        answer = true;
    }else{
        answer = false;
    }
    return answer;
}