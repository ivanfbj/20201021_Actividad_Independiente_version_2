package actividad;

public class ControladorMunicipio {

	Municipio muni[];
	int cont;

	public ControladorMunicipio(int n) {
		muni = new Municipio[n];
		cont = 0;

	}

	public void anadirMunicipio(String nombre, double distanciaDesdeMedellinKm, double temperaturaPromedio, String zona) {
		if (cont < muni.length) {
			muni[cont] = new Municipio(nombre, distanciaDesdeMedellinKm, temperaturaPromedio, zona);
			cont++;
		}
	}

	public Municipio[] getMunicipio() {
		return muni;
	}

	public double distanciaPromedio() {
		double distanciaPromedio = 0;

		for (int i = 0; i < cont; i++) {
			distanciaPromedio += muni[i].getDistanciaDesdeMedellinKm();
		}

		distanciaPromedio /= cont;

		return distanciaPromedio;

	}

	public int getCont() {
		return cont;
	}

}
