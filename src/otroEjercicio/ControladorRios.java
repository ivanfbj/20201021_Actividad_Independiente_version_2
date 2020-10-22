package otroEjercicio;

public class ControladorRios {

	 Rios Rio[]; // se crea el vector de Rios.
	int cont;  // se crea un contador para recorrer el vector de Rios.

	public ControladorRios(int n) {
		Rio = new Rios[n];
		cont = 0;

	}

	public void anadirRio(String codigo, double kilometrosDeExtension, int cantidadDeAfluentes, String alertaMaxima) {
		if (cont < Rio.length) {
			Rio[cont] = new Rios(codigo, kilometrosDeExtension, cantidadDeAfluentes, alertaMaxima);
			cont++;
		}
	}

	public Rios[] getRios() {
		return Rio;
	}

	public double distanciaPromedio() {
		double distanciaPromedio = 0;

		for (int i = 0; i < cont; i++) {
			distanciaPromedio += Rio[i].getKilometrosDeExtension();
		}

		distanciaPromedio /= cont;

		return distanciaPromedio;

	}

	public int getCont() {
		return cont;
	}

}
