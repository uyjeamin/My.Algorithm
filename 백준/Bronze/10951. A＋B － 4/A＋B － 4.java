import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){ //EOF(End Of File): 입력이 더이상 없을때 종료.

            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a+b);
        }
        in.close();

    }
}