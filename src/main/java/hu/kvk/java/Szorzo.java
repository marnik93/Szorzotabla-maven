package hu.kvk.java;

public class Szorzo {
	int szel;
	int[][] tabla;
	public Szorzo(int meret){
		szel = meret+1;
		tabla = new int[meret+1][meret+1];
	}
	
	public int[][] Szorzotabla(){
		for (int i = 1; i < szel; i++) {
			for (int j = 1; j < szel; j++) {
				tabla[i][j] = (i)*(j);
			}
		}
		return tabla;
	}
}
