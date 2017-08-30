
/**
Martin Alegría
A01022216
 */

import java.util.*;
import javax.swing.*;
import java.lang.*;

 public class entrega_final {

     //Variables
    static JOptionPane ventana = new JOptionPane();
     static String[] botones = {"Editar Balance Mensual","Ver Balance Mensual","Resumen de Balance", "Salir"}; 
    static String[] usuarios = new String[10];
    static String[] passwd = new String[10];
     //Balances de cada usuario en 12 meses
    public  static long[] b_user_1 = new long[12];
     static long[] b_user_2 = new long[12];
     static long[] b_user_3 = new long[12];
     static long[] b_user_4 = new long[12];
     static long[] b_user_5 = new long[12];
     static long[] b_user_6 = new long[12];
     static long[] b_user_7 = new long[12];
     static long[] b_user_8 = new long[12];
     static long[] b_user_9 = new long[12];
     static long[] b_user_10 = new long[12];
     //:v
    static int indx = 0;
     static int num_user = 0;
    static int input_menu = -1;
    static Boolean log_in = false;
     static Boolean regreso_menu = true;
    static Boolean regreso = true;
    static String input_pass;
     static String input_usuario;
     static String editar_balance;
     static String editar_balance_mensual;
     static String ver_mensual;
     static int edit_balance = 0;
     static int ver_balance = 0;
     static Boolean error;
     static Boolean  quieres_editar = true;
     static Boolean quieres_ver = true;
     static final int meses_grafica = 12;
     static int cont_meses = 0;
     static int cont_balance = 0;
     static int balance_grafica = 0;
     


public static void main(String[]args) {

    //Array de Usuarios
    usuarios[0] = "Martin";
    usuarios[1] = "Diego";
    usuarios[2] = "Gerardo";
    usuarios[3] = "Andrea";
    usuarios[4] = "Alejandro";
    usuarios[5] = "Moe";
    usuarios[6] = "Camila";
    usuarios[7] = "Jessica";
    usuarios[8] = "Sofia";
    usuarios[9] = "Jorge";

    //Array de Passwords
    passwd[0] = "mrtn";
    passwd[1] = "dg";
    passwd[2] = "grrd";
    passwd[3] = "andr";
    passwd[4] = "aljndr";
    passwd[5] = "moe";
    passwd[6] = "cml";
    passwd[7] = "jssc";
    passwd[8] = "sf";
    passwd[9] = "jrg";

    //Balances de usuarios
    
    b_user_1[0] = 1001;
    b_user_1[1] = 2002;
    b_user_1[2] = 1003;
    b_user_1[3] = 4004;
    b_user_1[4] = 1005;
    b_user_1[5] = 6006;
    b_user_1[6] = 7007;
    b_user_1[7] = 2008;
    b_user_1[8] = 1009;
    b_user_1[9] = 9000;
    b_user_1[10] = 4011;
    b_user_1[11] = 5012;
    
    
    b_user_2[0] = 2001;
    b_user_2[1] = 2002;
    b_user_2[2] = 2003;
    b_user_2[3] = 2004;
    b_user_2[4] = 2005;
    b_user_2[5] = 2006;
    b_user_2[6] = 2007;
    b_user_2[7] = 2008;
    b_user_2[8] = 2009;
    b_user_2[9] = 2010;
    b_user_2[10] = 2011;
    b_user_2[11] = 2012;
    
   
    b_user_3[0] = 3001;
    b_user_3[1] = 3002;
    b_user_3[2] = 3003;
    b_user_3[3] = 3004;
    b_user_3[4] = 3005;
    b_user_3[5] = 3006;
    b_user_3[6] = 3007;
    b_user_3[7] = 3008;
    b_user_3[8] = 3009;
    b_user_3[9] = 3010;
    b_user_3[10] = 3011;
    b_user_3[11] = 3012;
    
    
    b_user_4[0]= 5001;
    b_user_4[1]= 8002;
    b_user_4[2]= 2003;
    b_user_4[3]= 5004;
    b_user_4[4]= 1125;
    b_user_4[5]= 2001;
    b_user_4[6]= 8007;
    b_user_4[7]= 3008;
    b_user_4[8]= 6009;
    b_user_4[9]= 7010;
    b_user_4[10]= 3011;
    b_user_4[11]= 4012;
    
    
    b_user_5[0] = 1001;
    b_user_5[1] = 3002;
    b_user_5[2] = 5403;
    b_user_5[3] = 7004;
    b_user_5[4] = 8005;
    b_user_5[5] = 9006;
    b_user_5[6] = 3008;
    b_user_5[7] = 5088;
    b_user_5[8] = 7089;
    b_user_5[9] = 2010;
    b_user_5[10] = 6011;
    b_user_5[11] = 5012;
    
    
    b_user_6[0] = 2001;
    b_user_6[1] = 4002;
    b_user_6[2] = 6003;
    b_user_6[3] = 8004;
    b_user_6[4] = 1005;
    b_user_6[5] = 4006;
    b_user_6[6] = 2007;
    b_user_6[7] = 9004;
    b_user_6[8] = 3009;
    b_user_6[9] = 7010;
    b_user_6[10] = 2011;
    b_user_6[11] = 1012;
    
   
    b_user_7[0] = 1001;
    b_user_7[1] = 3002;
    b_user_7[2] = 4003;
    b_user_7[3] = 6004;
    b_user_7[4] = 7005;
    b_user_7[5] = 2006;
    b_user_7[6] = 3007;
    b_user_7[7] = 5008;
    b_user_7[8] = 7009;
    b_user_7[9] = 9010;
    b_user_7[10] = 2011;
    b_user_7[11] = 2012;
    
    
    b_user_8[0] = 9001;
    b_user_8[1] = 5002;
    b_user_8[2] = 2002;
    b_user_8[3] = 3004;
    b_user_8[4] = 1005;
    b_user_8[5] = 5006;
    b_user_8[6] = 6007;
    b_user_8[7] = 1008;
    b_user_8[8] = 2009;
    b_user_8[9] = 4010;
    b_user_8[10] = 1011;
    b_user_8[11] = 1012;
    
    
    b_user_9[0] = 3001;
    b_user_9[1] = 4002;
    b_user_9[2] = 6003;
    b_user_9[3] = 7004;
    b_user_9[4] = 9005;
    b_user_9[5] = 2006;
    b_user_9[6] = 2007;
    b_user_9[7] = 4008;
    b_user_9[8] = 1009;
    b_user_9[9] = 3010;
    b_user_9[10] = 7001;
    b_user_9[11] = 6012;
    
    
    b_user_10[0] = 2010;
    b_user_10[1] = 4002;
    b_user_10[2] = 6003;
    b_user_10[3] = 8004;
    b_user_10[4] = 2005;
    b_user_10[5] = 6006;
    b_user_10[6] = 7007;
    b_user_10[7] = 1008;
    b_user_10[8] = 2009;
    b_user_10[9] = 2010;
    b_user_10[10] = 3011;
    b_user_10[11] = 5012;


    do{
        
	indx = 0;

     
        user();

	if(input_usuario == null){

	    log_in= true;
	    regreso_menu = false;
	    regreso = false;
	    
	}

	
	    while (log_in ==false){
		password();	
	    }

	log_in = false;

	if(input_usuario == null){

	    regreso_menu= false;
	}

	else{

	    regreso_menu = true;
	}



       
        while(regreso_menu == true){

	    menu();
	    
	}

    }while(regreso ==true);
  
    
}//cierra main

     public static void user(){

	 input_usuario = (String) ventana.showInputDialog(null, "Escoge el usuario: ","Usuarios", JOptionPane.QUESTION_MESSAGE, null, usuarios, usuarios[0]);
	 
     }
    

     

     public static void password(){
	 

	 input_pass = (String) ventana.showInputDialog(null, "Ingresa la contraseña: ", "Password", JOptionPane.QUESTION_MESSAGE);
	 indx = 0;
    for (indx = 0; indx < usuarios.length; indx++){ //Checa todos los indexes de los dos arrays

	if(input_pass.equals(passwd[indx]) && input_usuario.equals(usuarios[indx])){ //Usuario y Contraseña correctas

	  ventana.showMessageDialog(null, "Bienvenid@ " + input_usuario + "!", "Acceso Concedido",JOptionPane.INFORMATION_MESSAGE);
	    log_in = true; //Para salir del loop
	    num_user = indx;
	}//fin if

    }//fin for
    
    //Reiniciar el contador
	 
     }//cierra password

     public static void menu(){
	 input_menu =  ventana.showOptionDialog(null, "Escoge tu opcion " + input_usuario + ":", "Banco NEOMEX" ,0, JOptionPane.QUESTION_MESSAGE,null,botones,botones[0]);

	regreso_menu = true;

	 switch(input_menu){

	     //EDICION DE BALANCE -------------------------------------------------
	 case 0:
	     error = true;
	     quieres_editar  = true;
	     while(error == true){
	     editar_balance = ventana.showInputDialog(null, "Ingresa el número del mes que deseas editar [1-12]: ", "Edición de balance mensual",JOptionPane.QUESTION_MESSAGE);
	     
	     if(editar_balance == null){

		 quieres_editar = false;
	     }
	     else{
	     edit_balance = Integer.parseInt(editar_balance);
	     System.out.println(num_user);
	     }

	     if(edit_balance >12 || edit_balance < 0 ){

		 ventana.showMessageDialog(null,"Numero de mes no existe, ingresa uno correcto [1-12]:", "ERROR 404 - Mes no encontrado",JOptionPane.ERROR_MESSAGE);
	     }//cierra if
		 else {
		     error = false;
		     
		 }//cierra else
        
	     
	     }//cierra while

	     while(quieres_editar == true){

	     switch(num_user){
		 
	     case 0:
		 editar_balance_mensual  = ventana.showInputDialog(null, "Ingresa el nuevo balance para el mes " + edit_balance +":", "Edicion de balance mensual",JOptionPane.INFORMATION_MESSAGE);
		 if(editar_balance_mensual == null){quieres_editar = false;}
		 else{ b_user_1[edit_balance-1] = Integer.parseInt(editar_balance_mensual);}
		 quieres_editar = false;
		 break;

	     case 1:
		 editar_balance_mensual  = ventana.showInputDialog(null, "Ingresa el nuevo balance para el mes " + edit_balance +":", "Edicion de balance mensual",JOptionPane.INFORMATION_MESSAGE);
		 b_user_2[edit_balance-1] = Integer.parseInt(editar_balance_mensual);
		 quieres_editar = false;
		 break;

	     case 2:
		 editar_balance_mensual  = ventana.showInputDialog(null, "Ingresa el nuevo balance para el mes " + edit_balance +":", "Edicion de balance mensual",JOptionPane.INFORMATION_MESSAGE);
		 b_user_3[edit_balance-1] = Integer.parseInt(editar_balance_mensual);
		 quieres_editar = false;
		 break;

	     case 3:
		 editar_balance_mensual  = ventana.showInputDialog(null, "Ingresa el nuevo balance para el mes " + edit_balance +":", "Edicion de balance mensual",JOptionPane.INFORMATION_MESSAGE);
		 b_user_4[edit_balance-1] = Integer.parseInt(editar_balance_mensual);
		 quieres_editar = false;
		 break;

	     case 4:
		 editar_balance_mensual  = ventana.showInputDialog(null, "Ingresa el nuevo balance para el mes " + edit_balance +":", "Edicion de balance mensual",JOptionPane.INFORMATION_MESSAGE);
		 b_user_5[edit_balance-1] = Integer.parseInt(editar_balance_mensual);
		 quieres_editar = false;
		 break;

	     case 5:
		 editar_balance_mensual  = ventana.showInputDialog(null, "Ingresa el nuevo balance para el mes " + edit_balance +":", "Edicion de balance mensual",JOptionPane.INFORMATION_MESSAGE);
		 b_user_6[edit_balance-1] = Integer.parseInt(editar_balance_mensual);
		 quieres_editar = false;
		 break;

	     case 6:
		 editar_balance_mensual  = ventana.showInputDialog(null, "Ingresa el nuevo balance para el mes " + edit_balance +":", "Edicion de balance mensual",JOptionPane.INFORMATION_MESSAGE);
		 b_user_7[edit_balance-1] = Integer.parseInt(editar_balance_mensual);
		 quieres_editar = false;
		 break;
		 
	     case 7:
		 editar_balance_mensual  = ventana.showInputDialog(null, "Ingresa el nuevo balance para el mes " + edit_balance +":", "Edicion de balance mensual",JOptionPane.INFORMATION_MESSAGE);
		 b_user_8[edit_balance-1] = Integer.parseInt(editar_balance_mensual);
		 quieres_editar = false;
		 break;

	     case 8:
		 editar_balance_mensual  = ventana.showInputDialog(null, "Ingresa el nuevo balance para el mes " + edit_balance +":", "Edicion de balance mensual",JOptionPane.INFORMATION_MESSAGE);
		 b_user_9[edit_balance-1] = Integer.parseInt(editar_balance_mensual);
		 quieres_editar = false;
		 break;

	     case 9:
		 editar_balance_mensual  = ventana.showInputDialog(null, "Ingresa el nuevo balance para el mes " + edit_balance +":", "Edicion de balance mensual",JOptionPane.INFORMATION_MESSAGE);
		 b_user_10[edit_balance-1] = Integer.parseInt(editar_balance_mensual);
		 quieres_editar = false;
		 break;
	     };

	     }
	
	     break;

	     //VISUALIZACION DE BALANCE --------------------------------------------------------------------
	 case 1:
	     error = true;
	     quieres_ver = true;
	     while(error == true){
	     ver_mensual = ventana.showInputDialog(null, "Ingresa el numero del mes del cual quieres ver el balance [1-12]: ", "Ver balance mensual",JOptionPane.QUESTION_MESSAGE);

	     if(ver_mensual == null){
		 quieres_ver = false;
	     }
	     else{
		 ver_balance = Integer.parseInt(ver_mensual);
	     }

	     if(ver_balance >12 || ver_balance < 0){

		 ventana.showMessageDialog(null,"Numero de mes no existe, ingresa uno correcto [1-12]:", "ERROR 404 - Mes no encontrado",JOptionPane.ERROR_MESSAGE);
	     }//cierra if
		 else {
		     error = false;
		     
		 }//cierra else

	     
	     }//cierra while

	     while(quieres_ver == true){

	     switch(num_user){

	     case 0:
		 ventana.showMessageDialog(null, "$" + b_user_1[ver_balance-1], "Balance del mes " + ver_mensual, JOptionPane.INFORMATION_MESSAGE);
		 quieres_ver = false;
		 break;

	     case 1:
		 ventana.showMessageDialog(null, "$" + b_user_2[ver_balance-1], "Balance del mes " + ver_mensual, JOptionPane.INFORMATION_MESSAGE);
		  quieres_ver = false;
		 break;

	     case 2:
		 ventana.showMessageDialog(null, "$" + b_user_3[ver_balance-1], "Balance del mes " + ver_mensual, JOptionPane.INFORMATION_MESSAGE);
		  quieres_ver = false;
		 break;

	     case 3:
		 ventana.showMessageDialog(null, "$" + b_user_4[ver_balance-1], "Balance del mes " + ver_mensual, JOptionPane.INFORMATION_MESSAGE);
		  quieres_ver = false;
		 break;

	     case 4:
		 ventana.showMessageDialog(null, "$" + b_user_5[ver_balance-1], "Balance del mes " + ver_mensual, JOptionPane.INFORMATION_MESSAGE);
		  quieres_ver = false;
		 break;

	     case 5:
		 ventana.showMessageDialog(null, "$" + b_user_6[ver_balance-1], "Balance del mes " + ver_mensual, JOptionPane.INFORMATION_MESSAGE);
		  quieres_ver = false;
		 break;

	     case 6:
		 ventana.showMessageDialog(null, "$" + b_user_7[ver_balance-1], "Balance del mes " + ver_mensual, JOptionPane.INFORMATION_MESSAGE);
		  quieres_ver = false;
		 break;

	     case 7:
		 ventana.showMessageDialog(null, "$" + b_user_8[ver_balance-1], "Balance del mes " + ver_mensual, JOptionPane.INFORMATION_MESSAGE);
		  quieres_ver = false;
		 break;

	     case 8:
		 ventana.showMessageDialog(null, "$" + b_user_9[ver_balance-1], "Balance del mes " + ver_mensual, JOptionPane.INFORMATION_MESSAGE);
		  quieres_ver = false;
		 break;

	     case 9:
		 ventana.showMessageDialog(null, "$" + b_user_10[ver_balance-1], "Balance del mes " + ver_mensual, JOptionPane.INFORMATION_MESSAGE);
		  quieres_ver = false;
		 break;


	     };
	     }//cierra while


	     break;

	     //RESUMEN/GRAFICA DE BALANCE -----------------------------------------------------------------
	 case 2:

	     switch (num_user){

	     case 0:

		 //Grafica usuario 1

		 ventana.showMessageDialog(null,"Tu grafica de balance estará en la consola. Cada ► son $1,000 y los numeros representan los meses.","Resumen de Balance",JOptionPane.INFORMATION_MESSAGE);

		 for(cont_meses = 1; cont_meses <= meses_grafica; cont_meses++){

        

		     System.out.print(cont_meses);
		     balance_grafica =(int) ((b_user_1[cont_meses - 1]) / 1000);
		 
		   
		     
		     if(cont_meses < 10){ System.out.print("  ");}
		     else{System.out.print(" ");}
		     
		     for(cont_balance = 0; cont_balance < balance_grafica; cont_balance++){
	      
			     System.out.print("►");

		     }//Balances
		     System.out.println(" ");

		 }//meses
		 
		 System.out.println(" ");
		  System.out.println(" ");
		 
		 break;

	     case 1:
		 	 
		 ventana.showMessageDialog(null,"Tu grafica de balance estará en la consola. Cada ► son $1,000 y los numeros representan los meses.","Resumen de Balance",JOptionPane.INFORMATION_MESSAGE);

		 for(cont_meses = 1; cont_meses <= meses_grafica; cont_meses++){

        

		     System.out.print(cont_meses);
		     balance_grafica =(int) ((b_user_2[cont_meses - 1]) / 1000);
		 
		   
		     
		     if(cont_meses < 10){ System.out.print("  ");}
		     else{System.out.print(" ");}
		     
		     for(cont_balance = 0; cont_balance < balance_grafica; cont_balance++){
	      
			     System.out.print("►");

		     }//Balances
		     System.out.println(" ");

		 }//meses
		 System.out.println(" ");
		  System.out.println(" ");
		 
		 
		 break;

	     case 2:

		 
		 ventana.showMessageDialog(null,"Tu grafica de balance estará en la consola. Cada ► son $1,000 y los numeros representan los meses.","Resumen de Balance",JOptionPane.INFORMATION_MESSAGE);

		 for(cont_meses = 1; cont_meses <= meses_grafica; cont_meses++){

        

		     System.out.print(cont_meses);
		     balance_grafica =(int) ((b_user_3[cont_meses - 1]) / 1000);
		 
		   
		     
		     if(cont_meses < 10){ System.out.print("  ");}
		     else{System.out.print(" ");}
		     
		     for(cont_balance = 0; cont_balance < balance_grafica; cont_balance++){
	      
			     System.out.print("►");

		     }//Balances
		     System.out.println(" ");

		 }//meses
		 System.out.println(" ");
		  System.out.println(" ");
		 
		 break;

	     case 3:
		 
		 ventana.showMessageDialog(null,"Tu grafica de balance estará en la consola. Cada ► son $1,000 y los numeros representan los meses.","Resumen de Balance",JOptionPane.INFORMATION_MESSAGE);

		 for(cont_meses = 1; cont_meses <= meses_grafica; cont_meses++){

        

		     System.out.print(cont_meses);
		     balance_grafica =(int) ((b_user_4[cont_meses - 1]) / 1000);
		 
		   
		     
		     if(cont_meses < 10){ System.out.print("  ");}
		     else{System.out.print(" ");}
		     
		     for(cont_balance = 0; cont_balance < balance_grafica; cont_balance++){
	      
			     System.out.print("►");

		     }//Balances
		     System.out.println(" ");

		 }//meses
		 
		 System.out.println(" ");
		  System.out.println(" ");
		 break;

	     case 4:

		 
		 ventana.showMessageDialog(null,"Tu grafica de balance estará en la consola. Cada ► son $1,000 y los numeros representan los meses.","Resumen de Balance",JOptionPane.INFORMATION_MESSAGE);

		 for(cont_meses = 1; cont_meses <= meses_grafica; cont_meses++){

        

		     System.out.print(cont_meses);
		     balance_grafica =(int) ((b_user_5[cont_meses - 1]) / 1000);
		 
		   
		     
		     if(cont_meses < 10){ System.out.print("  ");}
		     else{System.out.print(" ");}
		     
		     for(cont_balance = 0; cont_balance < balance_grafica; cont_balance++){
	      
			     System.out.print("►");

		     }//Balances
		     System.out.println(" ");

		 }//meses
		 System.out.println(" ");
		  System.out.println(" ");
		 
		 break;

	     case 5:
		 
		 ventana.showMessageDialog(null,"Tu grafica de balance estará en la consola. Cada ► son $1,000 y los numeros representan los meses.","Resumen de Balance",JOptionPane.INFORMATION_MESSAGE);

		 for(cont_meses = 1; cont_meses <= meses_grafica; cont_meses++){

        

		     System.out.print(cont_meses);
		     balance_grafica =(int) ((b_user_6[cont_meses - 1]) / 1000);
		 
		   
		     
		     if(cont_meses < 10){ System.out.print("  ");}
		     else{System.out.print(" ");}
		     
		     for(cont_balance = 0; cont_balance < balance_grafica; cont_balance++){
	      
			     System.out.print("►");

		     }//Balances
		     System.out.println(" ");

		 }//meses
		 
		 System.out.println(" ");
		  System.out.println(" ");
		 break;

	     case 6:
		 
		 ventana.showMessageDialog(null,"Tu grafica de balance estará en la consola. Cada ► son $1,000 y los numeros representan los meses.","Resumen de Balance",JOptionPane.INFORMATION_MESSAGE);

		 for(cont_meses = 1; cont_meses <= meses_grafica; cont_meses++){

        

		     System.out.print(cont_meses);
		     balance_grafica =(int) ((b_user_7[cont_meses - 1]) / 1000);
		 
		   
		     
		     if(cont_meses < 10){ System.out.print("  ");}
		     else{System.out.print(" ");}
		     
		     for(cont_balance = 0; cont_balance < balance_grafica; cont_balance++){
	      
			     System.out.print("►");

		     }//Balances
		     System.out.println(" ");

		 }//meses
		 System.out.println(" ");
		  System.out.println(" ");
		 
		 break;

	     case 7:
		 
		 ventana.showMessageDialog(null,"Tu grafica de balance estará en la consola. Cada ► son $1,000 y los numeros representan los meses.","Resumen de Balance",JOptionPane.INFORMATION_MESSAGE);

		 for(cont_meses = 1; cont_meses <= meses_grafica; cont_meses++){

        

		     System.out.print(cont_meses);
		     balance_grafica =(int) ((b_user_8[cont_meses - 1]) / 1000);
		 
		   
		     
		     if(cont_meses < 10){ System.out.print("  ");}
		     else{System.out.print(" ");}
		     
		     for(cont_balance = 0; cont_balance < balance_grafica; cont_balance++){
	      
			     System.out.print("►");

		     }//Balances
		     System.out.println(" ");

		 }//meses
		 

		 System.out.println(" ");
		  System.out.println(" ");
		 break;

	     case 8:
		 
		 ventana.showMessageDialog(null,"Tu grafica de balance estará en la consola. Cada ► son $1,000 y los numeros representan los meses.","Resumen de Balance",JOptionPane.INFORMATION_MESSAGE);

		 for(cont_meses = 1; cont_meses <= meses_grafica; cont_meses++){

        

		     System.out.print(cont_meses);
		     balance_grafica =(int) ((b_user_9[cont_meses - 1]) / 1000);
		 
		   
		     
		     if(cont_meses < 10){ System.out.print("  ");}
		     else{System.out.print(" ");}
		     
		     for(cont_balance = 0; cont_balance < balance_grafica; cont_balance++){
	      
			     System.out.print("►");

		     }//Balances
		     System.out.println(" ");

		 }//meses

		 System.out.println(" ");
		  System.out.println(" ");
		 
		 break;
		 
	     case 9:
		 
		 ventana.showMessageDialog(null,"Tu grafica de balance estará en la consola. Cada ► son $1,000 y los numeros representan los meses.","Resumen de Balance",JOptionPane.INFORMATION_MESSAGE);

		 for(cont_meses = 1; cont_meses <= meses_grafica; cont_meses++){

        

		     System.out.print(cont_meses);
		     balance_grafica =(int) ((b_user_10[cont_meses - 1]) / 1000);
		 
		   
		     
		     if(cont_meses < 10){ System.out.print("  ");}
		     else{System.out.print(" ");}
		     
		     for(cont_balance = 0; cont_balance < balance_grafica; cont_balance++){
	      
			     System.out.print("►");

		     }//Balances
		     System.out.println(" ");

		 }//meses

		 System.out.println(" ");
		  System.out.println(" ");
		 
		 break;
		 

	     }//Cierra switch de usuarios para grafica
	     

	     
	     break;

	     //SALIDAAAAA ----------------------------------------------------------------------------------
	 case 3:

	     ventana.showMessageDialog(null, "Gracias por usar este servicio, " + input_usuario + "!","Banco NEOMEX",JOptionPane.INFORMATION_MESSAGE);
	     regreso_menu = false;
	     
	     break;

	 default:

	     
	     break;

	 }//cierra switch
        
	 
	 
	 
     }//cierra menu

}
