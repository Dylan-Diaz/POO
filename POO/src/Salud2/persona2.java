package Salud2;

import java.util.*;
public class persona2 {
    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private int peso;
    private int estatura;
    private int edad;
    private String sexo;

    int esta2;
    int resultado;

    public void pedirDatos() {
        Scanner recoger=new Scanner(System.in);


        System.out.println("Digite su nombre");
        nombre=recoger.next();

        System.out.println("Digite su apellido");
        apellido=recoger.next();

        System.out.println("Digite su documento");
        documento=recoger.nextInt();

        System.out.println("Digite su tipo de documento");
        tipoDoc=recoger.next();

        System.out.println("Digite su edad");
        edad=recoger.nextInt();

        System.out.println("Digite su sexo");
        sexo=recoger.next(); 

}
public int calcularImc(int peso, int estatura) {
    esta2=estatura*estatura;
    resultado=esta2/peso; 

    return resultado;
}
public void mostrarPersona() {
    System.out.println("Su nombre es:_"+nombre);
    System.out.println("Su apellido es:_"+apellido);
    System.out.println("Su documento es:_"+documento);
    System.out.println("Su tipo de documento es:_"+tipoDoc);
    System.out.println("Su edad es:_"+edad);
    System.out.println("Su sexo es:_"+sexo);

    if (resultado<20) {
        System.out.println("Su peso esta por debajo de lo ideal");
    }
    else if (resultado>20 && resultado<25) {
        System.out.println("Su es ideal");
    }
    else if (resultado>25) {
        System.out.println("Su peso esta por encima de lo ideal");
    }
}
}
