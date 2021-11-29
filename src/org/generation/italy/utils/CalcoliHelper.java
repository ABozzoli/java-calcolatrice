package org.generation.italy.utils;

public class CalcoliHelper {

	private CalcoliHelper() {
		// costruttore private così non posso creare istanze
	}
	
	private int x;
	private int y;

	public static int sommaInt(int x, int y) {
		int sommaInt = x + y;
		return sommaInt;
	}
	
	public static int differenzaInt(int x, int y) {
		int differenzaInt = x - y;
		return differenzaInt;
	}
	
	public static int moltiplicaInt(int x, int y) {
		int moltiplicaInt = x * y;
		return moltiplicaInt;
	}
	
	public static int valoreAssolutoInt(int x) {
		if(x < 0) {
			x = x * -1;
		}
		return x;
	}
	
}
