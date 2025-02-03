import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		String n = br.readLine();
		
		bw.write((int)n.charAt(0)+"");
		        //char 타입은 내부적으로 정수를 저장하기 때문에 정수 자료형(int, short등) 이랑 캐스팅 됨.
    
		bw.close();
		br.close();
	}
}
