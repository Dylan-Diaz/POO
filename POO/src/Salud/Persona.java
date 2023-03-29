package Salud;
import java.util.*;

public class Persona {
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
        nombre=recoger.next(); 

        System.out.println("Digite su peso");
        peso=recoger.nextInt();

        System.out.println("Digite su estatura");
        estatura=recoger.nextInt();

        recoger.close();

}
public void calcularImc() {
    esta2=estatura*estatura;
    resultado=esta2/peso;
}
public void mostrarPersona() {
    System.out.println("Su nombre es:_"+nombre);
    System.out.println("Su apellido es:_"+apellido);
    System.out.println("Su documento es:_"+documento);
    System.out.println("Su tipo de documento es:_"+tipoDoc);
    System.out.println("Su edad es:_"+edad);
    System.out.println("Su sexo es:_"+sexo);
    System.out.println("Su peso es:_"+peso);
    System.out.println("Su estatura es:_"+estatura);

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
