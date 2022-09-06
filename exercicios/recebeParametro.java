package exercicios;



public class recebeParametro {
	
	public static String somaNumero(double n1,double n2) {
		String result ="";
		result = String.valueOf(n1+n2);
		return result;
	}
	public static String subtraiNumero(double n1,double n2) {
		String result ="";
		result = String.valueOf(n1-n2);
		return result;
	}
	public static String multiplicaNumero(double n1,double n2) {
		String result ="";
		result = String.valueOf(n1*n2);
		return result;
	}
	public static String divideNumero(double n1,double n2) {
		String result ="";
		result = String.valueOf(n1/n2);
		return result;
	}
	public static String raizQuadrada(double n1,double n2) {
		String result ="";
		result = String.valueOf(Math.sqrt(n1));
		return result;
	}
}
