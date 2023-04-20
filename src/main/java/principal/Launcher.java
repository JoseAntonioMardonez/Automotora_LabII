package principal;

import model.*;
import data.*;
import vista.*;

public class Launcher {
    public static void  main(String Args[]){
        inicializar();

    }
    public static void inicializar(){
        Automotora automotora = new Automotora();
        new VentanaPrincipal(automotora);


    }
}
