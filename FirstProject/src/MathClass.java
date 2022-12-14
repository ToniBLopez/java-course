
public class MathClass {

	public static void main(String[] args) {
		
		// CALCULAR LA RAÍZ CUADRADA DE UN NÚMERO Y PASARLO A ENTERO:
		double num;
		int squareRoot, intNum;
		
		num = 9.8;
		
		squareRoot = (int) Math.sqrt(num);
		
		intNum = (int) num;
		
		System.out.println("La raíz cuadrada de "+intNum+" es : "+squareRoot);
		
		
		// ELEVAR UN NÚMERO A SU POTENCIA:
		double base = 5, exponente = 2, resultado;
		
		resultado = Math.pow(base, exponente);
		
		System.out.println("La base de "+base+" elevado a su potencia "+exponente+" es igual a: "+resultado);
		
		
		// REDONDEAR UN NÚMERO PUNTO DECIMAL A ENTERO:
		// Tenemos estas 2 formmas de hacerlo:
		
		// Si es double lo tenemos que pasar a long, long es el número entero de más bytes:
		double numeroFlotanteDouble = 6.56;
		long resultadoEnteroLong = Math.round(numeroFlotanteDouble);
		
		// Si es float lo tenemos que pasar a int, int es el segundo número entero de más bytes:
		float numeroFlotanteFloat = 8.94F;
		int resultadoEnteroInt = Math.round(numeroFlotanteFloat);
		
		System.out.println("El redondeo de double a long es: "+resultadoEnteroLong);
		System.out.println("El redondeo de float a int es: "+resultadoEnteroInt);
		
		
		// CREAR UN NÚMERO PSEUDOALEATORIO:
		
		for (int i = 0; i < 150; i++) {
			double numPseudoaleatorio = Math.random();
			System.out.println("El número pseudoaleatorio que se ha creado es: "+numPseudoaleatorio);
		}
		
		

	}

}
