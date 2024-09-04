import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int i,j,k;
        int[] basket = new int[n];
        for(int a = 0; a < m; a++) {
            i = in.nextInt();
            j = in.nextInt();
            k = in.nextInt();
            for(int b= i-1; b < j; b++) {
                basket[b] = k;
            }
        }
        for(int c=0 ; c<n ; c++) {
            System.out.print(basket[c]+" ");
        }
    }
}