public class Variable {
	public static void main(String[] args ) {
		byte cpu = 3;
		short model = 2100;
		int minMemory = 1066;
		long maxMemory = 1333;
		float limit = 3.40f;
		double limit2 = 3.40d;
		char name = 'I';
		boolean isStarted = true;
		
		System.out.println(name + " i" + cpu + "-" + model + " " + limit + "Ghz" + " " + limit2 + " Ghz");
		System.out.println("Частота оперативной памяти " + minMemory + "-" + maxMemory);
		System.out.println(isStarted);
	}
}
