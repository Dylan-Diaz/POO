package Principal;

import Salud.Persona;

public class Inicio {
    public static void main(String[] args) {
        Persona registro=new Persona();
        
        registro.pedirDatos();
        registro.calcularImc();
        registro.mostrarPersona();
    }
}
