package reto4;

import java.util.Scanner;

import reto4.rectangulo;
import reto4.circulo;
import reto4.triangulo;

public class ejecucion {
    public static void main(String[] args) {
        float base;
        float altura;
        double radio;
        double pi=3.1416;

        Scanner recoger=new Scanner(System.in);
        System.out.println("Digite el valor de la base");
        base=recoger.nextFloat();

        System.out.println("Digite el valor de la altura");
        altura=recoger.nextFloat();

        rectangulo figura=new rectangulo(base,altura);

        figura.calcularArea();

        triangulo figura2=new triangulo(base,altura);

        System.out.println("Digite el valor de la base del triangulo");
        base=recoger.nextFloat();

        System.out.println("Digite el valor de la altura del triangulo");
        altura=recoger.nextFloat();

        figura2.calcularArea();


    
        System.out.println("Digite el valor del radio del circulo");
        radio=recoger.nextDouble();
        circulo figura3=new circulo(radio,pi);


        figura3.calcularArea();

        recoger.close();
    }
}
