package vista;

import data.*;
import model.Automotora;
import principal.*;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends Ventana{

    private JLabel textoMenu;
    private JLabel textoUsuario;
    private JLabel textoContrasena;
    private JTextField entradaTextoUsuario;
    private JPasswordField entradaTextoContrasena;
    private JButton botonIngresar;
    private JButton botonSalida;
    private Automotora automotora;

    public VentanaPrincipal(Automotora automotora) {
        super("Automotora",500,500);
        this.automotora = automotora;
        generarElementosVentana();
    }

    private void generarElementosVentana(){
        generarMensajeMenu();
        generarTextoUsuario();
        generarEntradaDeTextoNombre();
        generarTextoContrasena();
        generarEntradaDeTextoContrasena();
        generarBotonIngresar();
        generarBotonSalir();
    }
    private void generarMensajeMenu() {
        String textoBienvenida = "Menu Principal";
        super.generarJLabelEncabezado(this.textoMenu, textoBienvenida, 150, 30, 500, 30);
    }
    private void generarTextoUsuario() {
        String textoUsuario = "Usuario:";
        super.generarJLabel(this.textoUsuario, textoUsuario, 150, 90, 500, 30);
    }
    private void generarEntradaDeTextoNombre() {

        this.entradaTextoUsuario = super.generarJTextField(150,120,200,20);
        this.add(this.entradaTextoUsuario);
        this.entradaTextoUsuario.addActionListener(this);

    }
    private void generarTextoContrasena() {
        String textoContrasena = "Contraseña:";
        super.generarJLabel(this.textoContrasena, textoContrasena, 150, 160, 500, 30);
    }
    private void generarEntradaDeTextoContrasena() {

        this.entradaTextoContrasena = super.generarJPaswordField(150,190,200,20);
        this.add(this.entradaTextoContrasena);
        this.entradaTextoContrasena.addActionListener(this);

    }

    private void generarBotonIngresar() {
        String textoBoton = "Ingresar";
        this.botonIngresar = super.generarBoton(textoBoton, 175, 240, 150, 40);
        this.add(this.botonIngresar);
        this.botonIngresar.addActionListener(this);
    }
    private void generarBotonSalir() {
        String textoBoton = "Salir";
        this.botonSalida = super.generarBoton(textoBoton, 175, 380, 150, 40);
        this.add(this.botonSalida);
        this.botonSalida.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botonIngresar) {
            String nombreUsuario = entradaTextoUsuario.getText();
            char[] contrasena = entradaTextoContrasena.getPassword();
            boolean comprobarUsuario = tienda.comprobarUsuario(nombreUsuario,contrasena);
            if(comprobarUsuario == true){
                Usuario usuario = tienda.getUsuario(nombreUsuario,contrasena);
                String TipoUsuario = usuario.getTipo();
                switch(TipoUsuario) {
                    case "Administrador":
                        new VentanaAdministrador(tienda);
                        break;
                    case "Vendedor":
                        new VentanaVendedor(tienda);
                        break;
                }
            }else{
                JOptionPane.showMessageDialog(this,"Usuario o Contraseña Incorrecta","Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);
            }
            //Cierra la ventana actual
            this.dispose();
        }
        if(e.getSource() == this.botonSalida){
            GestorDatos.registrarDatos(tienda.getUsuarios(),"C:\\Users\\josem\\IdeaProjects\\Tienda\\src\\main\\java\\Archivos\\Usuarios");
            GestorDatos.registrarDatos(tienda.getProductos(),"C:\\Users\\josem\\IdeaProjects\\Tienda\\src\\main\\java\\Archivos\\Productos");
            GestorDatos.registrarDatos(tienda.getClientes(),"C:\\Users\\josem\\IdeaProjects\\Tienda\\src\\main\\java\\Archivos\\Clientes");
            GestorDatos.registrarDatos(tienda.getVentas(),"C:\\Users\\josem\\IdeaProjects\\Tienda\\src\\main\\java\\Archivos\\Ventas");
            this.dispose();
            System.exit(0);
        }
    }

}
