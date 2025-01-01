import java.io.*;
import java.util.*;

fun main():Unit = with(BufferedReader(InputStreamReader(System.`in`)))
{
    var n: Int = Integer.parseInt(readLine())
    
    for(i in 1..n){
        for(j in 1..i){
            print("*")
        }
        println()
    }
  
}
