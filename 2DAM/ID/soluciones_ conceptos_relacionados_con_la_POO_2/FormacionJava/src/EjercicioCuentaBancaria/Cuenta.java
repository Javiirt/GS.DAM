package EjercicioCuentaBancaria;

import ClasesObjetos.Persona;

public class Cuenta {

	// Atributos
	private String titularCta;
	private String numeroCta;
	private double saldoCta;

	// Constructor vacío
	public Cuenta() {
	}

	// Constructor de copia
	public Cuenta(Cuenta cta) {
		this.titularCta = cta.titularCta;
		this.numeroCta = cta.numeroCta;
		this.saldoCta = cta.saldoCta;
	}

	// Constructor de parámetros
	public Cuenta(String nombre, String numCta, double saldo) {
		this.titularCta = nombre;
		this.numeroCta = numCta;
		this.saldoCta = saldo;
	}

	public String getTitularCta() {
		return titularCta;
	}

	public void setTitularCta(String titularCta) {
		this.titularCta = titularCta;
	}

	public String getNumeroCta() {
		return numeroCta;
	}

	public void setNumeroCta(String numeroCta) {
		this.numeroCta = numeroCta;
	}

	public double getSaldoCta() {
		return saldoCta;
	}

	public void setSaldoCta(double saldoCta) {
		this.saldoCta = saldoCta;
	}

	@Override
	public String toString() {
		return "Datos de la cuenta \nNombre del titular: " + titularCta + "\nNúmero de cuenta: " + numeroCta
				+ "\nSaldo: " + saldoCta;
	}

	// Métodos de la clase
	/**
	 * Este método consiste en aumentar el saldo de la cuenta con la cantidad que se pase. 
	 * Debemos comprobar que la cantidad no puede ser negativa, si la cantidad introducida es negativa, no se hará nada. 
	 * Este método recibe un parámetro de entrada con la cantidad a ingresar y retorna true si se ha realizado la operación o false si no se ha realizado.
	 * 
	 * @param cantidad - cantidad a incrementar en el atributo del saldo de la cuenta
	 * @return true o false - true si se ha podido realizar la operacion, y false en caso contrario
	 */
	public boolean ingreso(double cantidad) {
		boolean realizado = false;

		if (cantidad > 0) {
			this.saldoCta += cantidad; // Esto es lo mismo que poner this.saldoCta = this.saldoCta + cantidad
			realizado = true;
		}
		
		return realizado;
	}

	/**
	 * Este método consiste en retirar una cantidad a la cuenta, es decir, debemos disminuir el saldo de la cuenta. 
	 * Debemos comprobar que la cantidad no sea negativa y además que hay saldo suficiente para hacer el reintegro, 
	 * si la cantidad es negativa o si no hay saldo suficiente, no se hará nada. 
	 * Este método recibe un parámetro de entrada con la cantidad a ingresar y retorna true si se ha realizado la operación o false si no se ha realizado.
	 * 
	 * @param cantidad - cantidad a descontar en el atributo del saldo de la cuenta
	 * @return true o false - true si se ha podido realizar la operacion, y false en caso contrario
	 */
	public boolean reintegro(double cantidad) {
		boolean realizado = false;

		if (cantidad > 0 && this.saldoCta >= cantidad) {
			this.saldoCta -= cantidad; // Esto es lo mismo que poner this.saldoCta = this.saldoCta - cantidad
			realizado = true;
		}

		return realizado;
	}

	/**
	 * Este método nos debe permitir pasar dinero de una cuenta a otra siempre que en la cuenta de origen haya saldo suficiente. 
	 * Este método recibe dos parámetros, uno con una instancia de tipo Cuenta, que será la cuenta destino del importe, 
	 * y un segundo parámetro con la cantidad a transferir, de tal forma, que disminuimos el saldo de la cuenta y se lo incrementamos a la otra cuenta. 
	 * Debe retorna true si se ha realizado la operación o false si no se ha realizado. 
	 * 
	 * @param ctaDestino - Instancia u objeto de tipo Cuenta donde vamos a ingresar el dinero
	 * @param importe - cantidad a descontar en el atributo del saldo de la cuenta y a incrementar en el atributo del saldo de la cuenta destino pasada como parametro
	 * @return true o false - true si se ha podido realizar la operacion, y false en caso contrario
	 */
	public boolean transferencia(Cuenta ctaDestino, double cantidad) {
		boolean realizado = false;

		//Reutilizamos los métodos creados anteriormente
		if (this.reintegro(cantidad)) {
			if (ctaDestino.ingreso(cantidad)) {
				realizado = true;
			}
		}

		return realizado;

	}

	public void mostrarTipoCuenta() {
		System.out.println("Es una cuenta bancaria");
	}
}
