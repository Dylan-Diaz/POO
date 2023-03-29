package PrincipalEjemplo;

import salud3.aprendiz;
import java.util.Scanner;;

public class inicio {
    public static void main(String[] args) {
        int añoNacimiento;

        Scanner recoger=new Scanner(System.in);
        System.out.println("Digite su año de nacimiento");
        añoNacimiento=recoger.nextInt();


        aprendiz apre=new aprendiz();
        apre.calcularEdad(añoNacimiento);
    }
}
