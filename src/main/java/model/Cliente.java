package model;

public class Cliente {
    //Atributos
    private String nombreCliente;
    private String direccion;
    private int numeroTelefonico;
    private String correoElectronico;
    private String rut;


    //Constructor
    public Cliente(String nombreCliente, String contrasena, int numeroTelefonico, String correoElectronico, String rut) {
        this.nombreCliente = nombreCliente;
        this.direccion = direccion;
        this.numeroTelefonico = numeroTelefonico;
        this.correoElectronico = correoElectronico;
        this.rut = rut;
    }
    //Métodos
    public String getNombreUsuario() {
        return this.nombreCliente;
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreCliente = nombreUsuario;
    }
    public String getDireccion() {
        return this.direccion;
    }
    public void setDireccion(String contrasena) {
        this.direccion = contrasena;
    }


    public String toString(){
        return nombreCliente+", "+direccion;
    }
}
