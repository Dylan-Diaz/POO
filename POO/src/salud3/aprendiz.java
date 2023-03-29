package salud3;

import java.util.Scanner;

public class aprendiz {
    //metodo constructor vacio//
    public void Aprendiz() {
        
    }

    //metodo constructor con parametros//
    public void Aprendiz(String nombre, int edad, String codigo) {
        
    }

    //atributos//
    private String nombre;
    private int edad;
    private String codigo;
    //metodos//
    public void registrarAprendiz() {
        Scanner recoger=new Scanner(System.in);
        System.out.println("Digite el nombre del aprendiz:");
        nombre=recoger.next();

        System.out.println("Digite la edad del aprendiz:");
        edad=recoger.nextInt();

        System.out.println("Digite el codigo del aprendiz:");
        codigo=recoger.next();
    }
    public void mostrarAprendiz() {
        System.out.println("El nombre del aprendiz es:_"+nombre+"_y su edad es:_"+edad);
        if (edad<18) {
            System.out.println("El aprendiz es menor de edad");
        }
        else if (edad>=18) {
            System.out.println("El aprendiz es mayor de edad");
        }
    }
    //metodo de retorno//
    public int calcularEdad(int añoNacimiento){
        int añoActual=2023;
        int edad1;
        edad1 =añoActual-añoNacimiento;

        System.out.println("Su edad es:_"+edad1);
        return edad1;
    }
}
