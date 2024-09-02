import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int N = in.nextInt();
        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i]=in.nextInt();
            if(num[i]<min) min=num[i];
            if(num[i]>max) max=num[i];
        }
        System.out.println(min+" "+max);
    }
}