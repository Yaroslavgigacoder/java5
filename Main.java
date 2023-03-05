import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
       System.out.println(Check("(({}[()]))"));
       System.out.println(Check("[]{}((<>))"));
       System.out.println(Check("[)"));
    }
    private static Boolean Check(String str) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put('}', '{');
        brackets.put(']', '[');
        brackets.put('>', '<');
        Deque<Character> list= new LinkedList<>();
        for (char i : str.toCharArray()) {
            if (brackets.containsValue(i)) {
                list.push(i);
            }
            else if(brackets.containsKey(i)){
                if(list.isEmpty() || list.pop() != brackets.get(i)){
                    return false;
                }
            }            
        }
        return true;
        
    }
    
}