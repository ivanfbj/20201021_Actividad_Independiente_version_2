package otroEjercicio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuiRios extends JFrame {

	JComboBox temporadaLluvias;
	JButton registrar, visulizarInformacionRios, mostrarCantidadRios, porcentajeRios;
	JTextField codigo, nombre, kilometrosDeExtension, cantidadAfluentes;
	ControladorRios controlador = new ControladorRios(10);

	public GuiRios() {
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

		add(new JLabel("Código:"));
		codigo = new JTextField(20);
		add(codigo);

		add(new JLabel("Nombre:"));
		nombre = new JTextField(20);
		add(nombre);

		add(new JLabel("Cantidad de afluentes: "));
		cantidadAfluentes = new JTextField(20);
		add(cantidadAfluentes);

		add(new JLabel("Kilometros de extensión: "));
		kilometrosDeExtension = new JTextField(20);
		add(kilometrosDeExtension);

		add(new JLabel("Alerta Máxima: "));
		temporadaLluvias = new JComboBox();
		temporadaLluvias.addItem("Amarilla");
		temporadaLluvias.addItem("Naranja");
		temporadaLluvias.addItem("Roja");
		add(temporadaLluvias);

		registrar = new JButton("registrar");
		add(registrar);
		registrar.addActionListener(new AccionRegistrar());

		mostrarCantidadRios = new JButton("Cantidad de Rios");
		add(mostrarCantidadRios);
		mostrarCantidadRios.addActionListener(new AccionMostrarCantidadRios());

		visulizarInformacionRios = new JButton("Mostrar informacion de rios");
		add(visulizarInformacionRios);
		visulizarInformacionRios.addActionListener(new AccionvisualizarInformacionRios());

		porcentajeRios = new JButton("Porcentaje Rios ");
		add(porcentajeRios);
		porcentajeRios.addActionListener(new AccionPorcetajeRios());

		setSize(300, 500);
		setVisible(true);
		setTitle("Rios");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		GuiRios ventana = new GuiRios();
	}

	class AccionRegistrar implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			controlador.anadirRio(codigo.getText(), nombre.getText(), Double.parseDouble(kilometrosDeExtension.getText()), Integer.parseInt(cantidadAfluentes.getText()),
					temporadaLluvias.getSelectedItem().toString());
			JOptionPane.showMessageDialog(null, "Se registro el rio correctamente");
			codigo.setText(null);
			nombre.setText(null);
			cantidadAfluentes.setText(null);
			kilometrosDeExtension.setText(null);

		}

	}

	class AccionMostrarCantidadRios implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (controlador.getCont() == 1) {
				JOptionPane.showMessageDialog(null, "En total hay " + controlador.getCont() + " Rio(s) registrado");
			} else {
				JOptionPane.showMessageDialog(null, "En total hay " + controlador.getCont() + " Rio(s) registrados");
			}

		}
	}

	class AccionvisualizarInformacionRios implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (controlador.getCont() > 0) {

				JOptionPane.showMessageDialog(null, controlador.getRios());
			} else {
				JOptionPane.showMessageDialog(null, "No se han ingresado Rios");
			}

		}
	}

	class AccionPorcetajeRios implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (controlador.getCont() > 0) {

				JOptionPane.showMessageDialog(null, "El porcentaje de rios con mas de 10 afluentes es: " + controlador.PorcentajeRios() + "%");
			} else {
				JOptionPane.showMessageDialog(null, "No se han ingresado rios afluentes");
			}

		}
	}
}
