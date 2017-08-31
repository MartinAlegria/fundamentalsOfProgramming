
import java.util.*;
import javax.swing.*;

public class arrays{

    public static void main(String []args){

	//Variables
	Scanner lectura = new Scanner(System.in);
	int tamaño;
	int cont = 0;
	int sum = 0;
	int posicion = 0;
	
	int[] arrayInt = new int[5]; //Arreglo de enteros tamaño 5
	
	//otra forma de declarar arreglos con contenido fijo
	int [] contenidoFijo = {20,30,40,50,10};

	//tercera forma de declarar arrays
	int[] otroNombre = new int[5];
	otroNombre[0] = 20;
	otroNombre[1] = 30;
	otroNombre[2] = 40;
	otroNombre[3] = 50;
	otroNombre[4] = 10;

	//Separar la declaracion y la creacion del array

	int[] listaNumerica;

	System.out.println("Dime cuanbtos numeros vamos a guardar");
	tamaño = lectura.nextInt();//Tamaño

	listaNumerica = new int[tamaño];

	//Llenar todo el array
	for(cont = 0; cont < tamaño; cont++){

	    System.out.println("Dame el dato para la pos: " + cont);
	    listaNumerica[cont] = lectura.nextInt(); //Nombre de la variable y la posicion donde se va a guardar
	    sum+=listaNumerica[cont];
	    
	}//fin For

	System.out.println("La suma de tus numeros es: " + sum);

	do{
	System.out.println("Dime la posicion que deseas imprimir: ");
	posicion = lectura.nextInt();
	}while(posicion>=tamaño || posicion<0);

	System.out.println(" ");

	//Imprimir el contenido de la posicion del array
	System.out.println("----> "+listaNumerica[posicion]);
        
	
    }//main
    
}//public class
