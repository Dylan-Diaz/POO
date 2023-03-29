package reto5;

import java.util.*;

import reto5.juego.Juego;

public class Jugar implements Juego {
    private String nombre;
    private int apuesta;
    private int dinero;
    private int resultado;
    private int maquina;

    Scanner recoger=new Scanner(System.in);

    public void iniciar() {

        System.out.println("ingrese su nombre:");
        nombre=recoger.next();

        System.out.println("Ingrese la cantidad de dinero que desea apostar:");
        dinero=recoger.nextInt();
    }

    public void jugar() {
        Random aleatorio=new Random();
        if (dinero>10000) {
            System.out.println("Elija una opcion:\n1_Piedra\n2_Papel\n3_Tijera");
            apuesta=recoger.nextInt();
            maquina=aleatorio.nextInt();
        } 
        else{
            System.out.println("El dinero apostado es muy poco");
        }
        
    }

    public void finalizar() {
        maquina=(int)(Math.random()*3+1);
        
        if ((maquina==3)&&(apuesta==1)) {
            resultado=dinero+10000;
            System.out.println("resultado:"+maquina);
            System.out.println("Nombre:"+nombre);
            System.out.println("!Felicidades usted Gano¡");
            System.out.println("Dinero ganado:"+resultado);
        }
        else if ((maquina==2)&&(apuesta==3)) {
            resultado=dinero+10000;
            System.out.println("resultado:"+maquina);
            System.out.println("Nombre:"+nombre);
            System.out.println("!Felicidades usted Gano¡");
            System.out.println("Dinero ganado:"+resultado);
        }
        else if ((maquina==1)&&(apuesta==2)) {
            resultado=dinero+10000;
            System.out.println("resultado:"+maquina);
            System.out.println("Nombre:"+nombre);
            System.out.println("!Felicidades usted Gano¡");
            System.out.println("Dinero ganado:"+resultado);
        }
        else if((maquina==1)&&(apuesta==3)){
            System.out.println("resultado:"+maquina);
            resultado=dinero-10000;
            System.out.println("Nombre:"+nombre);
            System.out.println("!Mala suerte, usted perdio¡");
            System.out.println("Dinero perdido:"+resultado);
        }
        else if((maquina==2)&&(apuesta==1)){
            System.out.println("resultado:"+maquina);
            resultado=dinero-10000;
            System.out.println("Nombre:"+nombre);
            System.out.println("!Mala suerte, usted perdio¡");
            System.out.println("Dinero perdido:"+resultado);
        }
        else if((maquina==3)&&(apuesta==2)){
            System.out.println("resultado:"+maquina);
            resultado=dinero-10000;
            System.out.println("Nombre:"+nombre);
            System.out.println("!Mala suerte, usted perdio¡");
            System.out.println("Dinero perdido:"+resultado);
        }
        else if((maquina==1)&&(apuesta==1)){
            resultado=dinero;
            System.out.println("resultado:"+maquina);
            System.out.println("Nombre:"+nombre);
            System.out.println("!Ha sido un empate¡");
            System.out.println("Dinero:"+resultado);
        }
        else if((maquina==2)&&(apuesta==2)){
            resultado=dinero;
            System.out.println("resultado:"+maquina);
            System.out.println("Nombre:"+nombre);
            System.out.println("!Ha sido un empate¡");
            System.out.println("Dinero:"+resultado);
        }
        else if((maquina==3)&&(apuesta==3)){
            resultado=dinero;
            System.out.println("resultado:"+maquina);
            System.out.println("Nombre:"+nombre);
            System.out.println("!Ha sido un empate¡");
            System.out.println("Dinero:"+resultado);
        }
    }
    
}
