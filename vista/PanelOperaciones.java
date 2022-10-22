package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;

public class PanelOperaciones extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JButton btOperadorMovil;
    private JButton btCalcularTotalPagar;
    private JButton btSalir;

    //----------------------
    // Metodos
    //----------------------

    //Constructor
    public PanelOperaciones()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar boton OperadorMovil
        btOperadorMovil = new JButton("operador movil");
        btOperadorMovil.setBounds(10,20,170,20);
        btOperadorMovil.setActionCommand("OperadorMovil");
        this.add(btOperadorMovil);


        //Crear y agregar boton CalcularTotalPagar
        btCalcularTotalPagar = new JButton("Calcular Total Pagar");
        btCalcularTotalPagar.setBounds(10,80,170,20);
        btCalcularTotalPagar.setActionCommand("CalcularTotalPagar");
        this.add(btCalcularTotalPagar);


        //Crear y agregar boton Salir
        btSalir = new JButton("Salir");
        btSalir.setBounds(190,50,170,20); 
        btSalir.setActionCommand("salir");
        this.add(btSalir);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    public void agregarOyentesBotones(ActionListener pAL)
    {
        btOperadorMovil.addActionListener(pAL);
        btCalcularTotalPagar.addActionListener(pAL);
        btSalir.addActionListener(pAL);
    }


}

