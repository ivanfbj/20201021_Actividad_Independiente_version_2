package otroEjercicio;

public class ControladorRios {

    Rios Rio[]; // se crea el vector de Rios.
    int cont;  // se crea un contador para recorrer el vector de Rios.

    public ControladorRios(int n) {
        Rio = new Rios[n];
        cont = 0;

    }

    public void anadirRio(String codigo, String Nombre, double kilometrosDeExtension, int cantidadDeAfluentes, String alertaMaxima) {
        if (cont < Rio.length) {
            Rio[cont] = new Rios(codigo, Nombre, kilometrosDeExtension, cantidadDeAfluentes, alertaMaxima);
            cont++;
        }
    }

    public Rios[] getRios() {
        return Rio;
    }

    public double PorcentajeRios() {
        double porcentajerios = 0;
        int RiosAfluentes = 0;
        for (int i = 0; i < cont; i++) {
            if (Rio[i].getCantidadDeAfluentes() > 10) {
                RiosAfluentes = RiosAfluentes + 1;
            }

        }

        porcentajerios = (RiosAfluentes*100)/cont;

        return porcentajerios;

    }

    public int getCont() {
        return cont;
    }

}
