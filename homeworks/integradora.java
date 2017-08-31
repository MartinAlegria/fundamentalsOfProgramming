

/**
 Martin Alegría
A01022216
Programa que ...
 */

import javax.swing.*;
import java.util.*;

public class integradora {

    //VARIABLES
    static final int meses = 12;
    static int[][] autos  = new int[meses][2];
    static String[] months  = {"Enero","Febrero","Marzo","Abril","Mayo","Junio",
			     "Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    static Scanner lectura = new Scanner(System.in);
     
    public static void main(String[]args) {

	CapturaDatos();
	ImpBajas();
	VentAltas();
	ImpArray();
	Bonus();
        
	
    }//MAIN

    public static void CapturaDatos(){

	int cont = 0;
	int cont2 = 0;

	System.out.println("INGRESE LOS DATOS DE IMPORTACION Y VENTAS");
	System.out.println("");

	for(cont = 0; cont<meses; cont++){
	    System.out.println("// "+ months[cont] + " //"); //IMPRIME EL MES BASADO EN EL ARRAY DE MESES

	    for(cont2 = 0; cont2<2; cont2++){

		//PONE CADA VALOR EN SU RESPECTIVA CLASIFICACION (IMPORTACION O VENTA)
	        if(cont2 == 0){

		    System.out.println("Importación: ");//IMPORTACION
		    autos[cont][cont2] = lectura.nextInt(); 
		    
		}//if
		else{

		    System.out.println("Venta:");//VENTA
		    autos[cont][cont2] = lectura.nextInt();
		}//else
		
	    }//for
	    System.out.println();

	}//for
    }//Captura de Datos

    public static void ImpBajas(){

	int min = autos[0][0];//INICIALIZAMOS UNA VARIABLE QUE SEA IGUAL AL PRIMER VALOR DEL ARREGLO AUTOS
	int cont = 0;
	int mes = 0;

	for(cont = 0; cont<meses; cont++){//EL LOOP VA A PASAR LOS 12 MESES DE LA CATEGORIA DE IMPORTACIONES

	  
	    if(autos[cont][0] <  min){ //SI ENCUENTRA QUE EL VALOR PARA ESE MES ES MENOR QUE EL VALOR ANTERIOR, LO IGUALA A MIN
		
		min = autos[cont][0]; 
		mes = cont; //IGUALAMOS A CONT CON MES PARA USARLO COMO INDEX DEL ARRAY DE MESES
	    }

	    
	}//for

	//AQUI USAMOS EL ARRAY DE MESES CON LA VAR MES PARA DAR EL MES EN EL QUE FUE LA IMPORTACION Y USAMOS MIN PARA INDICAR DE CUANTO FUE
	System.out.println(months[mes] + " fue el més con las importaciones más bajas con " + min);

    }//Imp Bajas

    
    public static void VentAltas(){

	int cont = 0;
	int max = autos[0][0];
	int mes = 0;

	for(cont = 0; cont<meses; cont++){ //AQUI ES EXACTAMENTE LO MISMO QUE EN EL METODO PASADO, PERO EN LA CATEGORIA DE VENTAS Y BUSCAMOS LA VENTA MAS GRANDE

	    if (autos[cont][1] > max){ //AQUI ES IGUAL QUE EL METODO PASADO, PERO AHORA BUSCAMOS QUE EL NUMERO SEA MAYOR AL ANTERIOR

		max = autos[cont][1];
		mes = cont;

	    }//if

	}//for

	System.out.println(months[mes] + " fue el mes con las ventas más altas con " + max);
	
    }// Ventas Altas


    public static void ImpArray(){

	int cont = 0;
	int cont2 = 0;

	System.out.println();
	System.out.println();
	System.out.println("IMPORTACION Y VENTAS DE AUTOS");
	System.out.println();
	
	for(cont = 0; cont<meses; cont++){ //AQUI IMPRIMIMOS EL ARRAY DE AUTOS CON DOS FOR LOOPS, UNO PARA LOS 12 MESES Y OTRO PARA LAS 2 CATEGORIAS

	    System.out.println("// "+ months[cont] + " //");

	    for(cont2= 0; cont2<2; cont2++){

		if(cont2 == 0){

		    System.out.println("Importaciones: " + autos[cont][cont2]);
		}//if
		else{
		    System.out.println("Ventas: " + autos[cont][cont2]);

		}//else

	    }//for

	    //HACEMOS QUE EL PROGAMA ESPERE 1.5 SEGUNDOS PARA IMPRIMIR LA PROXIMA LINEA, SOLO PARA USO ESTETICO

	    System.out.println();
	    try{
		Thread.sleep(1500);
	    }//try
	    catch(InterruptedException ex){}//catch
	    
	}//for

    }//Impresión del Arreglo

    public static void Bonus(){

	int cont = 0;
	int cont2 = 0;
	int imp = 0;
	int vent = 0;
	boolean bonus = false;
	ArrayList<Integer> deficit = new ArrayList<Integer>(); //CREAMOS UN ARRAY LIST PORQUE NO SABEMOS CUANTOS MESES HABRÁ CON DEFICIT

	for(cont = 0; cont<meses; cont++){ //PASAMOS POR LOS 12 MESES

	    for(cont2 = 0; cont2<2; cont2++){

		if(cont2 == 0){

		    imp = autos[cont][cont2]; //IGUALAMOS A IMP CON EL VALOR DE AUTOS EN EL MES CONT CON EL VALOR CONT2 EN IMPORTACIONES

		}//if
		else{

		    vent = autos[cont][cont2]; //IGUALAMOS VENT CON EL VALOR DE AUTOS EN EL MES CONT CON EL VALOR CONT2 EN VENTAS

		}//else
		
	    }//for

	    //AQUI AÑADIMOS EL CONTADOR DONDE HAY DEFICIT AL ARRAYLIST PARA USARLO DE INDEX EN EL ARRAY DE MESES
	    if(imp > vent){

		deficit.add(cont);
		bonus = true; //IGUALAMOS BONUS A TRUE PARA SABER QUE SI HAY DEFICIT EN EL ARREGLO DE AUTOS

	    }//if
	    
	}//for

	int[] mesesDeficit = new int[deficit.size()]; //CREAMOS UN NUEVO ARREGLO CON EL MISMO TAMAÑO QUE EL ARRAYLIST
        for(cont = 0; cont<deficit.size(); cont++){
	    mesesDeficit[cont] = deficit.get(cont); //PASAMOS TODOS LOS NUMEROS DEL ARRAYLIST AL ARREGLO PARA USARLOS DE INDEX EN EL ARREGLO DE MESES
	}

	System.out.println();
	System.out.println("BONUS");

	if(bonus == true){
	
	for(cont = 0; cont<mesesDeficit.length; cont++){

	    //AQUI ES DONDE USAMOS LOS INDEX DEL ARREGLO mesesDeficit PARA IMPRIMIR LOS MESES EN LOS QUE HUBO DEFICIT

	    System.out.print(months[mesesDeficit[cont]] + ", ");

	}//for

	System.out.print("fueron los meses con déficit");
	
	}
	else{

	    System.out.println("No hubo deficit en el año");
	}//else
	
    }//Bonus

    
}
