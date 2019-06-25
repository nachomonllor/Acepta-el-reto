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

    
     
    public static boolean esReversible(String s) {
        
        String rev = "";
        for(int i = s.length() - 1; i>=0; i--) {
            rev += s.charAt(i);
        }
        
        
        
        int a = Integer.parseInt(s);
        int rev_a = Integer.parseInt(rev);
        
        if(String.valueOf(Integer.parseInt(rev)).length() != s.length()) return false;
        
        int sum = a + rev_a;
        
        String sum_string = String.valueOf(sum);
        
        for(int i =0; i<sum_string.length(); i++) {
            if( (sum_string.charAt(i) - '0') % 2 == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        String s;
        while( (s = br.readLine()) != null) {
            if(s.equals("0")) {
                break;
            }
            System.out.println(esReversible(s) ?"SI":"NO");
        }
    }

}