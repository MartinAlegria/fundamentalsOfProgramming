
/*
 Martin Alegría
A01022216
20 OOCT 2016
Programa que crea un areglo del tamaño y contendio seleccionado por el usuario y que es modificable
 */

import java.util.*;
import javax.swing.*;

public class arreglos_practica {

    public static void main (String []args) {

	//Variables
	Scanner lectura = new Scanner (System.in);
	int[] arrayUser;
	int tamaño = 0;
	int cont = 0;
	int sum = 0;
	int pos = 0;
	double prom = 0.0;
	int multi = 1;
	String dec = " ";

	//Tamaño del Array
	System.out.println("Dame cuantos numeros vas a ingresar:");
	tamaño = lectura.nextInt();
	arrayUser = new int[tamaño];

	//Contenido del array
	for(cont = 0; cont<tamaño; cont++){

	    System.out.println("Dame el dato para la posición " + cont);
	    arrayUser[cont] = lectura.nextInt();
	    
	    
	}//cierra for

	//Imprimir contenido del array

	System.out.println("Este es el contenido de tu arreglo:");

	for(cont = 0; cont<tamaño; cont++){

	    System.out.print(" -Posicion " + cont + ": ");
	    System.out.print(arrayUser[cont]);
	    
	}//cierra for

	System.out.println(" ");
	System.out.println("Deseas modificar algun contenido del arreglo ? [Y/N] ");
	dec = lectura.next();

	if(dec.equalsIgnoreCase("y")){

	    
	    do{
	    System.out.println("Que posición deseas modificar ? ");
	    pos = lectura.nextInt();
	    }while(pos >= tamaño || pos < 0);
	    
	    System.out.println("Cuál es el nuevo valor de la pos: " + pos );
	    System.out.println("Antiguo valor de pos "+ pos + " ---> " + arrayUser[pos]);
	    arrayUser[pos] = lectura.nextInt();
	   
	    
	    
	}//cierra if

	for(cont = 0; cont<tamaño; cont++){

	    sum+=arrayUser[cont];
	    multi = multi * arrayUser[cont];
	}//cierra for

	System.out.println("La suma de tu arreglo es: " + sum);
	prom = (double) sum/tamaño;
	System.out.println("El promedio de tu arreglo es: " + prom);
	System.out.println("La multiplicatoria de tu arreglo es " + multi);
	
	
    }//main

}//class
