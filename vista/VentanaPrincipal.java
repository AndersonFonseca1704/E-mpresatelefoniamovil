package vista;

import java.awt.Component;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    //----------------------
    // Atributos
    //----------------------
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;
    
    
    //----------------------
    // Metodos
    //----------------------

    //Constructor
    public VentanaPrincipal()
    {
        //Definición del layout de la ventana
        this.setLayout(null);

        //Creación y adición del PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,380,190);
        this.add(miPanelEntradaDatos);

        //Creación y adición del PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,220,380,120);
        this.add(miPanelOperaciones);

        //Creación y adición del PanelResultados
        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(10,350,380,190);
        this.add(miPanelResultados);

        //Caracteristicas de la ventana
        this.setTitle("Empresa telefonia");
        this.setSize(400,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }


    private void add(PanelEntradaDatos miPanelEntradaDatos2) {
    }


    private void add(PanelOperaciones miPanelOperaciones2) {
    }


    private void add(PanelResultados miPanelResultados2) {
    }

}