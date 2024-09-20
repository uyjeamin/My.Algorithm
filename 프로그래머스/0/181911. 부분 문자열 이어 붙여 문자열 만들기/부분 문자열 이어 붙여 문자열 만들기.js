function solution(my_strings, parts) {
    var answer = '';
    for(let i=0 ; i<my_strings.length ; i++){
        let first,second;
        
             first = parts[i][0];
             second = parts[i][1];
       
        
        answer += my_strings[i].slice(first,second+1);
    }
    
    return answer;
}