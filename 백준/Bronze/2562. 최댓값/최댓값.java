import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int temp = 0;

        int[] n = new int[9];

        for(int i = 0; i < 9; i++) {
            n[i] = in.nextInt();
            if(n[i] > max){
                max = n[i];
                temp = i;
            }
        }
        temp++;
        System.out.print(max+"\n"+temp);
    }
}