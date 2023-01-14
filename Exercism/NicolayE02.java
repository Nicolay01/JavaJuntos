public class NicolayE02 {
	// TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int m) {
        return expectedMinutesInOven() - m;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int capas) {
        return capas * 2;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int capas, int m) {
        return preparationTimeInMinutes(capas) + m;
    }

   	public static void main(String[] args) {
   		NicolayE02 nicolayE02 = new NicolayE02();
   		System.out.println(nicolayE02.expectedMinutesInOven()); // 40
   		System.out.println(nicolayE02.remainingMinutesInOven(30)); // 10
   		System.out.println(nicolayE02.preparationTimeInMinutes(2)); // 4
   		System.out.println(nicolayE02.totalTimeInMinutes(3, 20)); // 6 * 20 = 26
   	}
}