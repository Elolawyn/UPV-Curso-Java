package ejercicioComplejo;

class Complejo {
	private double real;
	private double imaginario;

	public Complejo(double real, double imaginario) {
		this.real= real; 
		this.imaginario= imaginario;
	}

	public double getReal() {
		return real;
	}

	public double getImaginario() {
		return imaginario;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public void setImaginario(double imaginario) {
		this.imaginario = imaginario;
	}

	/** Transcribe el complejo a String.
	 * @returnun string con la parte entera y la imaginaria
	 */
	public String toString() {
		return real + "+"+ imaginario + "i";
	}

	/** Suma al complejo de este objeto otro complejo.
	 * @param v  el complejo que sumamos
	 */
	public void suma(Complejo v) {
		real = real + v.real;
		imaginario = imaginario + v.imaginario;
	}
}
