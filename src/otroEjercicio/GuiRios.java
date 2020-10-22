package otroEjercicio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuiRios extends JFrame {

    JComboBox TemporadaLluvias;
    JButton Registrar, Municipio, visulizarInformacionRios, mostrarCantidadRios, porcentajeRios;
    JTextField codigo, Nombre, kilometrosDeExtension, CantidadAfluentes;
    ControladorRios Controlador = new ControladorRios(10);

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

        add(new JLabel("Kilometros de extension: "));
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
        Registrar.addActionListener(new Boton1());

        mostrarCantidadRios = new JButton("Cantidad de Rios");
        add(mostrarCantidadRios);
        mostrarCantidadRios.addActionListener(new Boton2());

        visulizarInformacionRios = new JButton("Mostrar informacion de rios");
        add(visulizarInformacionRios);
        visulizarInformacionRios.addActionListener(new Boton3());

        porcentajeRios = new JButton("Porcentaje Rios ");
        add(porcentajeRios);
        porcentajeRios.addActionListener(new Boton4());

        setSize(300, 500);
        setVisible(true);
        setTitle("Rios");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        GuiRios ventana = new GuiRios();
    }

    class Boton1 implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            Controlador.anadirRio(codigo.getText(), Nombre.getText(), Double.parseDouble(kilometrosDeExtension.getText()), Integer.parseInt(CantidadAfluentes.getText()), TemporadaLluvias.getSelectedItem().toString());
            JOptionPane.showMessageDialog(null, "Se registro el rio correctamente");
        }

    }
    
    class Boton2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            if (Controlador.getCont() == 1) {
                JOptionPane.showMessageDialog(null, "En total hay " + Controlador.getCont() + " Rio(s) registrado");
            } else {
                JOptionPane.showMessageDialog(null, "En total hay " + Controlador.getCont() + " Rio(s) registrados");
            }

        }
    }

    class Boton3 implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            if (Controlador.getCont() > 0) {

                JOptionPane.showMessageDialog(null, Controlador.getRios());
            } else {
                JOptionPane.showMessageDialog(null, "No se han ingresado Rios");
            }

        }
    }
    
     
         
    class Boton4 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (Controlador.getCont() > 0) {

                JOptionPane.showMessageDialog(null, "El porcentaje de rios con mas de 10 afluentes es: " + Controlador.PorcentajeRios());
            } else {
                JOptionPane.showMessageDialog(null, "No se han ingresado rios afluentes");
            }

        }
    }
}
