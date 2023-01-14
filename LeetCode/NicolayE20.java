public class NicolayE20 {
	public static boolean isValid(String s) {
        Stack<Character> stackCharacter = new Stack<>();
        
        for (char ch : s.toCharArray()) {            
            if (ch == '(') stackCharacter.push(')');
            if (ch == '[') stackCharacter.push(']');
            if (ch == '{') stackCharacter.push('}');
            if (ch == ')' || ch == '}' || ch == ']') {               
                if (stackCharacter.empty() || stackCharacter.pop() != ch) {
                    return false;
                }
            }            
        }        
        return stackCharacter.empty();
    }

    public static void main(String[] args) {
    	System.out.println(isValid("()[]{}"));
    }
}