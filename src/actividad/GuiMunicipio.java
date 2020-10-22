package actividad;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GuiMunicipio extends JFrame {

	JButton registrarBoton, visualizaMunicipioBoton, distanciaPromedioBoton, cantidadMunicipiosRegistradosBoton;
	JTextField Nombre, KDM, TP;
	JComboBox zona;

	int cantidadDeMunicipios = 10;

	ControladorMunicipio municipiosLista = new ControladorMunicipio(cantidadDeMunicipios);

	public GuiMunicipio() {

		setLayout(new FlowLayout());

		add(new JLabel("Nombre:"));
		Nombre = new JTextField(18);
		add(Nombre);

		add(new JLabel("Kilometros desde Medellin: "));
		KDM = new JTextField(18);
		add(KDM);

		add(new JLabel("Temperatura Promedio: "));
		TP = new JTextField(18);
		add(TP);

		add(new JLabel("Zonas"));
		zona = new JComboBox();
		zona.addItem("Sin especificar");
		zona.addItem("Bajo Cauca");
		zona.addItem("Magdalena medio");
		zona.addItem("Nordeste");
		zona.addItem("Norte");
		zona.addItem("Occidente");
		zona.addItem("Oriente");
		zona.addItem("Suroeste");
		zona.addItem("Urabá");
		zona.addItem("Valle de Aburra");
		add(zona);

		// Crear, agrega y pone función al botón
		registrarBoton = new JButton("Registrar");
		add(registrarBoton);
		registrarBoton.addActionListener(new Registrar());

		// Crear, agrega y pone función al botón
		cantidadMunicipiosRegistradosBoton = new JButton("Cantidad de municipios registrados");
		add(cantidadMunicipiosRegistradosBoton);
		cantidadMunicipiosRegistradosBoton.addActionListener(new CantidadMunicipiosRegistrados());

		// Crear, agrega y pone función al botón
		visualizaMunicipioBoton = new JButton("Visualizar Municipios");
		add(visualizaMunicipioBoton);
		visualizaMunicipioBoton.addActionListener(new VisualizarMunicipio());

		// Crear, agrega y pone función al botón
		distanciaPromedioBoton = new JButton("Distancia promedio desde Medellín");
		add(distanciaPromedioBoton);
		distanciaPromedioBoton.addActionListener(new MostrarDistanciaPromedio());

		setSize(1000, 150);
		setLocationRelativeTo(null);

		setVisible(true);

		setTitle("Registro de municipios turísticos de Antioquia");

		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	// Función para validar que no se sobrepase el tamaño del Array, debe seleccionar una zona y resetea los campos al guardar
	class Registrar implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			if (municipiosLista.getCont() < cantidadDeMunicipios) {

				if (zona.getSelectedIndex() != 0) {
					municipiosLista.anadirMunicipio(Nombre.getText(), Double.parseDouble(KDM.getText()), Double.parseDouble(TP.getText()), zona.getSelectedItem().toString());
					Nombre.setText(null);
					KDM.setText(null);
					TP.setText(null);
					zona.setSelectedIndex(0);
					JOptionPane.showMessageDialog(null, "El municipio se almacenó satisfactoriamente");
				} else
					JOptionPane.showMessageDialog(null, "Debe seleccionar una zona");

			} else
				JOptionPane.showMessageDialog(null, "Se registró la cantidad máxima de municipio");
		}
	}

	class CantidadMunicipiosRegistrados implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			if (municipiosLista.getCont() == 1) {
				JOptionPane.showMessageDialog(null, "En total hay " + municipiosLista.getCont() + " municipio registrado");
			} else {
				JOptionPane.showMessageDialog(null, "En total hay " + municipiosLista.getCont() + " municipios registrados");
			}

		}
	}

	class VisualizarMunicipio implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			if (municipiosLista.getCont() > 0) {

				JOptionPane.showMessageDialog(null, municipiosLista.getMunicipio());
			} else
				JOptionPane.showMessageDialog(null, "No se han ingresado municipios");

		}
	}

	class MostrarDistanciaPromedio implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (municipiosLista.getCont() > 0) {

				JOptionPane.showMessageDialog(null, "La distancia promedio desde la ciudad de Medellín, de los municipios registrados es " + municipiosLista.distanciaPromedio());
			} else
				JOptionPane.showMessageDialog(null, "No se han ingresado municipios");

		}
	}

}
