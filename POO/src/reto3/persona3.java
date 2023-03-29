package reto3;
import java.util.*;

public class persona3 {
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

    public persona3() {
    }
    
    public persona3(String tipoDoc,int documento,String nombre,String apellido,int peso,int estatura,int edad,
    String sexo){
        
    }
    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc){
        this.tipoDoc=tipoDoc;
    }
    public int getDocumento(){
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public int getEstatura() {
        return estatura;
    }
    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
public void calcularImc() {
    esta2=estatura*estatura;
    resultado=esta2/peso;
}
public void mostrarImc(){
    System.out.println("Su Imc fue: "+resultado);
    if (resultado<20) {
        System.out.println("Usted esta por debajo del peso ideal");
    }
    else if (resultado>20 && resultado<25) {
        System.out.println("Su peso es ideal");
    }
    else if (resultado>25) {
        System.out.println("Usted esta por encima del peso ideal");
    }
}
public void registrarEdad() {
    Scanner recoger=new Scanner(System.in);
    System.out.println("por favor ingrese su edad");
    edad=recoger.nextInt();
}
public void mostrarEdad() {
    System.out.println("Su edad es: "+edad);
    if (edad>=18) {
        System.out.println("usted es mayor de edad");
    }
    else{
        System.out.println("usted es menor de edad");
    }
}
public void registrarPersona() {
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
}

public void mostrarPersona(String tipoDoc,int documento,String nombre,String apellido,int peso,int estatura,
int edad,String sexo) {
    System.out.println("Su nombre es:_"+nombre);
    System.out.println("Su apellido es:_"+apellido);
    System.out.println("Su documento es:_"+documento);
    System.out.println("Su tipo de documento es:_"+tipoDoc);
    System.out.println("Su edad es:_"+edad);
    System.out.println("Su sexo es:_"+sexo);
    System.out.println("Su peso es:_"+peso);
    System.out.println("Su estatura es:_"+estatura);
} 

    
}


