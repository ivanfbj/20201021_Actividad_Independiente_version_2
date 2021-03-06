package otroEjercicio;

public class Rios {

	private String codigo;
	private String Nombre;
	private double kilometrosDeExtension;
	private int cantidadDeAfluentes;
	private String alertaMaxima;

	// Constructor explicito
	public Rios(String codigo, String Nombre, double kilometrosDeExtension, int cantidadDeAfluentes, String alertaMaxima) {
		this.codigo = codigo;
		this.Nombre = Nombre;
		this.kilometrosDeExtension = kilometrosDeExtension;
		this.cantidadDeAfluentes = cantidadDeAfluentes;
		this.alertaMaxima = alertaMaxima;
	}

	// Gets y Sets
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getKilometrosDeExtension() {
		return kilometrosDeExtension;
	}

	public void setKilometrosDeExtension(double kilometrosDeExtension) {
		this.kilometrosDeExtension = kilometrosDeExtension;
	}

	public int getCantidadDeAfluentes() {
		return cantidadDeAfluentes;
	}

	public void setCantidadDeAfluentes(int cantidadDeAfluentes) {
		this.cantidadDeAfluentes = cantidadDeAfluentes;
	}

	public String getAlertaMaxima() {
		return alertaMaxima;
	}

	public void setAlertaMaxima(String alertaMaxima) {
		this.alertaMaxima = alertaMaxima;
	}

	@Override
	public String toString() {
		return "Codigo: " + codigo + ", El nombre de rio es: " + Nombre + ", Kilometros de extensio: " + kilometrosDeExtension + ", Cantidad de afluentes: " + cantidadDeAfluentes + ", Alerta maxima: "
				+ alertaMaxima;
	}

}
