package Principal2;

import Salud2.persona2;

import java.util.Scanner;;
public class inicio2 {
    public static void main(String[] args) {
        int peso;
        int estatura;

        persona2 registro=new persona2();
        Scanner recoger=new Scanner(System.in);

        registro.pedirDatos();

        System.out.println("Digite su peso");
        peso=recoger.nextInt();

        System.out.println("Digite su estatura");
        estatura=recoger.nextInt();

        registro.calcularImc(peso,estatura);

        System.out.println("Su peso es:_"+peso);
        System.out.println("Su estatura es:_"+estatura);

        registro.mostrarPersona();
  }
}
