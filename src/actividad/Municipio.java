package actividad;

public class Municipio {

	private String nombre;
	private double distanciaDesdeMedellinKm;
	private double temperaturaPromedio;
	private String zona;

	// Constructor explicito
	public Municipio(String nombre, double distanciaDesdeMedellinKm, double temperaturaPromedio, String zona) {
		this.nombre = nombre;
		this.distanciaDesdeMedellinKm = distanciaDesdeMedellinKm;
		this.temperaturaPromedio = temperaturaPromedio;
		this.zona = zona;
	}

	// Gets y Sets
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getDistanciaDesdeMedellinKm() {
		return distanciaDesdeMedellinKm;
	}

	public void setDistanciaDesdeMedellinKm(double distanciaDesdeMedellinKm) {
		this.distanciaDesdeMedellinKm = distanciaDesdeMedellinKm;
	}

	public double getTemperaturaPromedio() {
		return temperaturaPromedio;
	}

	public void setTemperaturaPromedio(double temperaturaPromedio) {
		this.temperaturaPromedio = temperaturaPromedio;
	}

	@Override
	public String toString() {
		return "\nNombre municipio=" + nombre + ", Distancia desde Medellin=" + distanciaDesdeMedellinKm + " Km" + ", Temperatura promedio=" + temperaturaPromedio + ", Zona=" + zona;
	}

}
