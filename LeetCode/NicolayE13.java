public class NicolayE13 {
	public static int romanToInt(String s) {
        Map map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int sum = 0;
        /*
         * Si se encuentra con un +*caracter** igual se debe restarle el valor.
         */
        int ans = 0;
        char prev = ' ';
        for (int i = s.length() - 1; i >= 0; i--) {

            //sum = sum + (int)(map.get(s.charAt(i)));
            if(s.charAt(i)== 'I' && prev == 'V' || s.charAt(i)=='I' && prev == 'X'){
                ans -=1;
            }else if(s.charAt(i)== 'X' && prev == 'L' || s.charAt(i)=='X' && prev == 'C'){
                ans -= 10;
            }else if(s.charAt(i)== 'C' && prev == 'D' || s.charAt(i)=='C' && prev == 'M'){
                ans -= 100;
            }else{
                ans = ans + (int) map.get(s.charAt(i));
            }
            prev = s.charAt(i);
        }
        return ans;
    }

    public static void main(String[] args) {
    	System.out.println(romanToInt("MCMXCIV"));
    }
}