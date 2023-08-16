import tp02.ejercicio1.*;
import java.util.Scanner;
public class TestListaDeEnterosEnlazada {
    public static void main(String[] args) {
        //Creo la lista estatica
        ListaDeEnterosEnlazada L = new ListaDeEnterosEnlazada();
        
        //Llamo a la consola para ller desde teclado
        Scanner consola = new Scanner(System.in);   
                
        //Cargo los numeros en la objeto
        System.out.println("Ingrese un numero: ");
        int numero = consola.nextInt();
        while(numero != -1){
            L.agregarFinal(numero);
            System.out.println("Ingrese un numero: ");
            numero = consola.nextInt();
        }
        //Imprimo la lista
        L.comenzar();
        while(!L.fin()){
            System.out.println(L.proximo());
        }
        consola.close();
    }
}

/* 1.4 No hay diferencia */
