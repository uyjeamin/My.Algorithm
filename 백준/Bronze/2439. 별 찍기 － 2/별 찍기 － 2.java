import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int l = 1;
    for(int i=n ; i>0 ; i--){
        for(int j=i ; j>1 ; j--){
            System.out.print(" ");
        }
            for (int j = 0; j < l; j++) {
                System.out.print("*");
            }
            l++;

        System.out.println();
    }


    }
}