package model;

import java.util.ArrayList;

public class Automotora {
    //Atributos
    private ArrayList<Cliente> clientes;
    private ArrayList<Vehiculo> vehiculos;

    //Constructor
    public Automotora() {
        this.clientes = new ArrayList<Cliente>();
        this.vehiculos = new ArrayList<Vehiculo>();
    }

    //Métodos
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    public void agregarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }
    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    public void agregarVehiculo(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
    }

    //Métodos para Ventanas
    /*
    public boolean comprobarUsuario(String nombreUsuario, char[] contrasena){
        String contrasena2 = new String(contrasena);
        for(Usuario usuario : this.usuarios){
            if(usuario.getNombreUsuario().equals(nombreUsuario) && usuario.getContrasena().equals(contrasena2)){
                return true;
            }
        }
        return false;
    }
    public Usuario getUsuario(String nombreUsuario, char[] contrasena){
        String contrasena2 = new String(contrasena);
        for(Usuario usuario : this.usuarios){
            if(usuario.getNombreUsuario().equals(nombreUsuario) && usuario.getContrasena().equals(contrasena2)){
                return usuario;
            }
        }
        return null;
    }*/
}
