package calculaoragit;

public class principal {
	public static void main(String[] args) {
		calculadora miCalc = new calculadora();
		System.out.println(miCalc.sumar(5,3));
		System.out.println(miCalc.restar(5,3));
		System.out.println(miCalc.multiplicar(5,3));
		System.out.println(miCalc.dividir(5,3));
		}
}
