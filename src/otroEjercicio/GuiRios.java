
package otroEjercicio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuiRios extends JFrame{
    
    JComboBox TemporadaLluvias;
    JButton Registrar, Municipio, MR, DP;
    JTextField Nombre, Codigo, KilometrosExtencion, CantidadAfluentes;
    
    public GuiRios() {
         add(new JLabel("Nombre:"));
        Nombre = new JTextField(18);
        add(Nombre);
        add(new JLabel("Codigo: "));
        Codigo = new JTextField(18);
        add(Codigo);
        add(new JLabel("Temperatura Promedio: "));
        KilometrosExtencion = new JTextField(18);
        add(KilometrosExtencion);
        add(new JLabel("Temperatura Promedio: "));
        CantidadAfluentes = new JTextField(18);
        add(CantidadAfluentes);
        
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
        //guardar.addActionListener(new boton2());
        MR= new JButton("Mostrar registro");
        add(MR);
        //guardar.addActionListener(new boton3());
        DP = new JButton("Distancia promedio");
        add(DP);
        //guardar.addActionListener(new boton4());

        

        setSize(1000, 1000);
        setVisible(true);
        setTitle("Rios");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        GuiRios ventana = new GuiRios();
    }
    
}
