import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;

/**
 *
 * @author Usuario
 */
public class JavaApplication19 {

     
    static long factorial(long num, long den) {
        long prod = 1;
        for(long i =den+1; i <= num; i++) {
            prod *= i;
        }
        return prod;
    }
   
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
       // System.out.println(Long.MAX_VALUE);
        
        String s;
        while( (s = br.readLine()) != null) {
            String[] split = s.split(" ");
            long num = Integer.parseInt(split[0]);
            long den = Integer.parseInt(split[1]);
            if(num < den) {
                break;
            }
            System.out.println( factorial(num, den));
        }
    }

}
