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

    
     public static void sumarDigitos(String s) {
         
         int sum =0;
         for(int i =0; i<s.length(); i++) {
             
             int dig = s.charAt(i) - '0';
             sum += dig;
             if(i < s.length() - 1) {
                 System.out.print(dig + " + ");
             }
             else{
                 System.out.print(dig + " = ");
             }
             
         }
         
         System.out.print(sum);
         System.out.print("\n");
     }
             
             
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        String s;
        while( (s = br.readLine()) != null) {
            
            if(Integer.parseInt(s  ) < 0 ) {
                break;
            }
            
            sumarDigitos(s);
            
            
        }
        
        
        
    }
    
    
    
}