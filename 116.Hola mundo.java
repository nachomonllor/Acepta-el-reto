import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class JavaApplication16 {

    
    
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
       // Scanner s = new Scanner(System.in); 
        //s=s.useLocale(java.util.Locale.UK);
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);
        
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i =0; i<n; i++) {
            System.out.println("Hola mundo.");
        }
        
        
        
    }
    
}