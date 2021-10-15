import java.util.Stack;

class Solution {
    public boolean isOpenPar(char c){
        return c == '(' || c == '[' || c == '{';
    }
    public boolean isValid(String s) {
    HashMap<Character, Character> par = new HashMap<Character, Character>(3);
    par.put('(', ')');
    par.put('[', ']');
    par.put('{', '}');
    char[] c = s.toCharArray();
    Stack<Character> stack = new Stack<Character>();
    for (int i = 0; i < c.length; i++){
        if (isOpenPar(c[i])) stack.push(c[i]);
        else{
            if (stack.size() == 0 || c[i] != par.get(stack.pop())) return false;
        }
    }
        return stack.size() == 0;
    }
}
