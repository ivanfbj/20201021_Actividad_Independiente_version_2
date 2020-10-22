package otroEjercicio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuiRios extends JFrame {

	JComboBox TemporadaLluvias;
	JButton Registrar, Municipio, visulizarInformacionRios, mostrarCantidadRios,porcentajeRios;
	JTextField codigo, Nombre, kilometrosDeExtension, CantidadAfluentes;

	public GuiRios() {
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

		add(new JLabel("Codigo:"));
		codigo = new JTextField(20);
		add(codigo);

		add(new JLabel("Nombre:"));
		Nombre = new JTextField(20);
		add(Nombre);
		
		add(new JLabel("Cantidad de afluentes: "));
		CantidadAfluentes = new JTextField(20);
		add(CantidadAfluentes);

		add(new JLabel("Kilometros de extensión: "));
		kilometrosDeExtension = new JTextField(20);
		add(kilometrosDeExtension);

		add(new JLabel("Alerta Maxima: "));
		TemporadaLluvias = new JComboBox();
		TemporadaLluvias.addItem("Amarilla");
		TemporadaLluvias.addItem("Naranja");
		TemporadaLluvias.addItem("Roja");
		add(TemporadaLluvias);

		Registrar = new JButton("Registrar");
		add(Registrar);
		// guardar.addActionListener(new boton1());

		mostrarCantidadRios = new JButton("Cantidad de Rios");
		add(mostrarCantidadRios);
		// guardar.addActionListener(new boton2());

		visulizarInformacionRios = new JButton("Mostrar informacion de rios");
		add(visulizarInformacionRios);
		// guardar.addActionListener(new boton3());

		porcentajeRios = new JButton("Porcentaje Rios con más ");
		add(porcentajeRios);
		// guardar.addActionListener(new boton4());

		setSize(300, 500);
		setVisible(true); 
		setTitle("Rios");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		GuiRios ventana = new GuiRios();
	}

}
