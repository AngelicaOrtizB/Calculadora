package holanoseporquenofunciona;

public class CalculadoraException extends Exception {
	
	public static final String mennsaje= "No puede dividir por cero";

	public CalculadoraException(String mennsaje) {
		mennsaje = mennsaje;
	}

	public String getMennsaje() {
		return mennsaje;
	}
	

}
