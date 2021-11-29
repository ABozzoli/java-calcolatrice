package org.generation.italy.utils;

public class CalcoliHelper {

	private CalcoliHelper() {
		// costruttore private così non posso creare istanze
	}
	
	private int x;
	private int y;

	public static int somma(int x, int y) {
		int somma = x + y;
		return somma;
	}
	
	public static int sottrai(int x, int y) {
		int sottrai = x - y;
		return sottrai;
	}
	
	public static int moltiplica(int x, int y) {
		int moltiplica = x * y;
		return moltiplica;
	}
	
	public static int valoreAssoluto(int x) {
		if(x < 0) {
			x = x * -1;
		}
		return x;
	}
	
	public static int min(int x, int y) {
		if(x < y) {
			return x;
		}
		return y;
	}
	
	public static int max(int x, int y) {
		if(x > y) {
			return x;
		}
		return y;
	}
}
