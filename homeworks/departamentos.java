
/**
Martin Alegría A01022216
7 Febrero 2017
 */

import java.util.*;
import javax.swing.*;

public class departamentos {


    static int[][] departamentos = new int[3][12];
    

    public static void main(String[] args ){

	generarDatos();
	impresionDatos();
	mayorElectronicos();
	promedioAnual();
	maymenSoftware();
	menorProduccion();

	
    }//MAIN

    public static void generarDatos(){

	int cont = 0;
	int cont2 = 0;
	Random randomGen = new Random();

	for(cont = 0; cont<3; cont++){

	    for(cont2 = 0; cont2<12; cont2++){

		departamentos[cont][cont2] = randomGen.nextInt(100);
	    }

	}//For

    }//GenrarDatos

    public static void impresionDatos(){

	int cont=0;
	int cont2 = 0;
	String mes = "";
	
	for(cont = 0; cont<3; cont++){

	    System.out.println("");

	    switch(cont){

	    case 0: System.out.println("ELECTRONICOS");
		break;

	    case 1: System.out.println("COMPUTO");
		break;

	    case 2: System.out.println("SOFTWARE");
		break;

	    }

	    for(cont2 = 0; cont2<12; cont2++){

		switch(cont2){

		case 0: mes = "Enero"; break;
		case 1: mes = "Febrero"; break;
		case 2: mes = "Marzo"; break;
		case 3: mes = "Abril"; break;
		case 4: mes = "Mayo"; break;
		case 5: mes = "Junio"; break;
		case 6: mes = "Julio"; break;
	        case 7: mes = "Agosto"; break;
		case 8: mes = "Septiembre"; break;
		case 9: mes = "Octubre"; break;
		case 10: mes = "Noviembre"; break;
		case 11: mes = "Diciembre"; break;

		}

		
		System.out.println(mes + ": "+"$"+ departamentos[cont][cont2]);
	    }

	}//For


    }//DATOS


   public static void mayorElectronicos(){

       int max = departamentos[0][11];
       int cont = 0;
       String mes = "";
       int month = 0;

       for(cont = 0; cont<12; cont++){

	

	   if(departamentos[0][cont] > max){

	             switch(cont){

		case 0: mes = "Enero"; break;
		case 1: mes = "Febrero"; break;
		case 2: mes = "Marzo"; break;
		case 3: mes = "Abril"; break;
		case 4: mes = "Mayo"; break;
		case 5: mes = "Junio"; break;
		case 6: mes = "Julio"; break;
	        case 7: mes = "Agosto"; break;
		case 8: mes = "Septiembre"; break;
		case 9: mes = "Octubre"; break;
		case 10: mes = "Noviembre"; break;
		case 11: mes = "Diciembre"; break;

		}
	       max = departamentos[0][cont];
	       
	      
	   }

	   
       }//for

   
       System.out.println();
       System.out.println("El mes en el que se regsitro el mayor costo de produccion para electronicos fue en " + mes + " con $" +max);


   }//ELECTRONICOS
    

    public static void promedioAnual(){

	int cont = 0;
	double anual = 0;
	double promedio = 0;

	for(cont = 0; cont < 12; cont++){

	    anual = anual + departamentos[1][cont];  

	}

	promedio = anual/12;

	System.out.println("");
	System.out.println("El promedio anual de los costos de produccion de COMPUTO fue: $" + promedio);


    }//PROM ANUAL

     public static void maymenSoftware(){

       int max = departamentos[2][0];
       int min = departamentos [2][0];
       int cont = 0;
       int cont2 = 0;
       String mes = "";
       String mes2 = "";
       int month2 = 0;
       int month = 0;

       for(cont = 0; cont<12; cont++){

	

	   if(departamentos[2][cont] > max){

	             switch(cont){

		case 0: mes = "Enero"; break;
		case 1: mes = "Febrero"; break;
		case 2: mes = "Marzo"; break;
		case 3: mes = "Abril"; break;
		case 4: mes = "Mayo"; break;
		case 5: mes = "Junio"; break;
		case 6: mes = "Julio"; break;
	        case 7: mes = "Agosto"; break;
		case 8: mes = "Septiembre"; break;
		case 9: mes = "Octubre"; break;
		case 10: mes = "Noviembre"; break;
		case 11: mes = "Diciembre"; break;

		}
		     
	       max = departamentos[2][cont];
	       
	      
	   }

	   
       }//for

   
       System.out.println();
       System.out.println("El mes en el que se regsitro el mayor costo de produccion para SOFTWARE fue en " + mes + " con $" +max);

        for(cont2 = 0; cont2<12; cont2++){

	

	   if(departamentos[2][cont2] < min){

	             switch(cont2){

		case 0: mes2 = "Enero"; break;
		case 1: mes2 = "Febrero"; break;
		case 2: mes2 = "Marzo"; break;
		case 3: mes2 = "Abril"; break;
		case 4: mes2 = "Mayo"; break;
		case 5: mes2 = "Junio"; break;
		case 6: mes2 = "Julio"; break;
	        case 7: mes2 = "Agosto"; break;
		case 8: mes2 = "Septiembre"; break;
		case 9: mes2 = "Octubre"; break;
		case 10: mes2 = "Noviembre"; break;
		case 11: mes2 = "Diciembre"; break;

		}
		     
	       min = departamentos[2][cont2];
	       
	      
	   }

	   
       }//for

	 System.out.println();
       System.out.println("El mes en el que se regsitro el menor costo de produccion para SOFTWARE fue en " + mes2 + " con $" +min);


   }//SOFT

    public static void menorProduccion(){

	int cont = 0;
	int minProd = departamentos[0][11];
	String rubro = "";

	for(cont = 0; cont<3; cont++){

	    if(departamentos[cont][11]< minProd){

		minProd = departamentos[cont][11];

			switch(cont){

		 case 0: rubro = "ELECTRONICOS";
		break;

		 case 1: rubro = "COMPUTO";
		break;

		 case 2: rubro = "SOFTWARE";
		break;

	    }
      
	    }//if
	    
	}//for

	System.out.println();
	System.out.println("El rubro que tuvo menor produccion en Diciembre fue " + rubro + " con $"+ minProd);

    }//PROD
}
