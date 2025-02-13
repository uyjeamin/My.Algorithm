import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
        String str = br.readLine();
        
        char c;
        int time=0;
		
		for(int i=0 ; i<str.length() ; i++){
		    c = str.charAt(i);
		    
		    
		    if(65<= c && c <=67){
		        time+=3;
		    }else if(68<= c && c <=70){
		        time+=4;
		    }else if(71<= c && c <=73){
		        time+=5;
		    }else if(74<= c && c <=76){
		        time+=6;
		    }else if(77<= c && c <=79){
		        time+=7;
		    }else if(80<= c && c <=83){
		        time+=8;
		    }else if(84<= c && c <=86){
		        time+=9;
		    }else if(87<= c && c <=90){
		        time+=10;
		    }else{
		        time+=11;
		    }

		}
		bw.write(time+"");
		
    
		bw.close();
		br.close();
	}
}
