package otroEjercicio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuiRios extends JFrame {

    JComboBox TemporadaLluvias;
    JButton Registrar, Municipio, MR, DP;
    JTextField Nombre, Codigo, KilometrosExtencion, CantidadAfluentes;

    public GuiRios() {
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        add(new JLabel("Nombre:"));
        Nombre = new JTextField(20);
        add(Nombre);
        add(new JLabel("Codigo: "));
        Codigo = new JTextField(20);
        add(Codigo);
        add(new JLabel("Temperatura Promedio: "));
        KilometrosExtencion = new JTextField(20);
        add(KilometrosExtencion);
        add(new JLabel("Temperatura Promedio: "));
        CantidadAfluentes = new JTextField(20);
        add(CantidadAfluentes);

        add(new JLabel("Alerta Maxima: "));
        TemporadaLluvias = new JComboBox();
        TemporadaLluvias.addItem("Amarilla");
        TemporadaLluvias.addItem("Naranja");
        TemporadaLluvias.addItem("Roja");
        add(TemporadaLluvias);
        Registrar = new JButton("Registrar");
        add(Registrar);
        //guardar.addActionListener(new boton1());
        Municipio = new JButton("Municipios");
        add(Municipio);

        setSize(300, 400);
        setVisible(true);
        setTitle("Rios");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        GuiRios ventana = new GuiRios();
    }

}
