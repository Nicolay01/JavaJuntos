public class NicolayE01 {
	public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) { // Para que (i + 1) no "llegue" al indice <4>.
            for (int k = i + 1; k < nums.length; k++) {
                if ((nums[i] + nums[k] == target)) {
                    return new int[]{i, k}; // retorna un array con los valores de i y (i + 1);
                }
            }
        }
        return new int[]{0};
    }

    public static void main(String[] args) {
    	int[] nums = {0, 1, 2, 5, 9};
    	System.out.println(twoSum(nums, 7));
    }
}