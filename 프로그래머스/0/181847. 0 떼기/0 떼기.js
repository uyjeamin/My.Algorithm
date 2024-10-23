function solution(str) {
    var answer = '';
    let temp;
    for(let i=0 ; i<str.length ;i++){
        if(!(str[i]=='0')){
           temp = i;
            break;
        }
    }
    
    return str.slice(temp);
}