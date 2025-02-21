package EjerciciosInterfaces;

public class Animal implements Comportamientos {

	//Atributos
	private String especie;
	private String tipoAlimentacion;

	//Getters & setters	
	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getTipoAlimentacion() {
		return tipoAlimentacion;
	}

	public void setTipoAlimentacion(String tipoAlimentacion) {
		this.tipoAlimentacion = tipoAlimentacion;
	}

	@Override
	public void respirar() {
		System.out.println(especie + " está respirando");
	}

	@Override
	public void dormir() {
		System.out.println(especie + " está durmiendo");
	}

	@Override
	public void comer() {
		if (tipoAlimentacion.equals("carnivoro")) {
			System.out.println("Los animales carnívoros son aquellos que se alimentan fundamentalmente de materia animal.");
		} else if (tipoAlimentacion.equals("hervivoro")) {
			System.out.println("Los animales herbívoros se alimentan fundamentalmente de materia vegetal.");
		} else if (tipoAlimentacion.equals("omnivoro")) {
			System.out.println("Los animales omnívoros son aquellos que se alimentan tanto de materia animal como de materia vegetal.");
		} else {
			System.out.println(especie + " está comiendo");
		}

	}

}
