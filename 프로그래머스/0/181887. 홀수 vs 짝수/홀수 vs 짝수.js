function solution(num_list) {
    var answer = 0;
    let mh = 0;
    let mj = 0;
    for(let i=0 ; i<num_list.length ; i+=2){
       mj += num_list[i];
    }
    for(let i=1 ; i<num_list.length ; i+=2){
        mh += num_list[i];
    }
    
    if(mj > mh)
        return mj;
    else
        return mh;
}