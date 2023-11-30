package holanoseporquenofunciona;



public class Calculadora {
	private double dividendo;
	private double divisor;
	public Calculadora(int dividente, int divisor) {
		this.dividendo = dividente;
		this.divisor = divisor;
	}
	public double calcularDivisón() throws CalculadoraException {
		if (divisor==0) {
			throw new CalculadoraException(CalculadoraException.mennsaje);
		}
		else {
			double resultado=dividendo/divisor;
			
			return dividendo/divisor;
		}
		
	}
	
	
}
