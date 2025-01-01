import java.io.*  // 세미콜론 없이 사용
import java.util.* // 세미콜론 없이 사용

fun main() {
    
    var br = BufferedReader(InputStreamReader(System.`in`)) // 백틱 사용
    var bw = BufferedWriter(OutputStreamWriter(System.`out`)) // 백틱 사용
    
    var s: String = br.readLine()
    bw.write("${s.length}")
    
    br.close()
    bw.close()
}
