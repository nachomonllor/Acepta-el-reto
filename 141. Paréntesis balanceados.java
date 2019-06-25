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

    
     public static boolean esValido(String s) {
         
        if(s.length() == 0) return true;
        if (s.length() == 0) return true;

        Stack<Character> pila = new Stack();
        HashMap<Character, Character> dic = new HashMap();
        dic.put('[',']');
        dic.put('(',')');
        dic.put('{','}');

        int balanceado = 0;
          
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{' || ch == ')' || ch == ']' || ch == '}') {
                if (dic.containsKey(s.charAt(i)))
                {
                    pila.push(s.charAt(i));
                    balanceado++;
                }
                else
                {

                    if (!pila.isEmpty() && dic.get(pila.peek()) != s.charAt(i)) return false;
                    if (!pila.isEmpty())
                    {
                        pila.pop();
                    }
                    balanceado--;
                }
            }
        }
        return balanceado == 0 && pila.isEmpty();
    }
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        String s;
        while( (s = br.readLine()) != null) {
            
            //String s = br.readLine().trim();
            
            System.out.println(esValido(s) ? "YES": "NO");
            
        }
        
        
        
    }
    
    
    
}