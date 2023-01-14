public class NicolayE09 {
	public static boolean isPalindrome(int x) {
        if(x < 0) return false;

        int reversed = 0;
        int auxiliar = x;
        while(auxiliar != 0) {
            int residuo = auxiliar % 10;
            reversed = reversed * 10 + residuo;
            auxiliar /= 10;
        }

        return x == reversed;
    }

    public static void main(String[] args) {
    	System.out.println(isPalindrome(121)); // true
    }
}