
/**
Martin Alegría
A01022216
 */

import java.util.*;
import javax.swing.*;
import java.lang.*;

 public class entrega_2 {

     //Variables
    static JOptionPane ventana = new JOptionPane();
     static String[] botones = {"Editar Balance","Ver Balance","Resumen de Balance", "Salir"}; 
    static String[] usuarios = new String[10];
    static String[] passwd = new String[10];
     static int[] balance = new int[10];
    static int indx = 0;
     static int num_user = 0;
    static int input_menu = -1;
    static Boolean log_in = false;
     static Boolean regreso_menu = true;
    static Boolean regreso = true;
    static String input_pass;
     static String input_usuario;
     static String editar_balance;


public static void main(String[]args) {

    //Array de Usuarios
    usuarios[0] = "Martin";
    usuarios[1] = "Diego";
    usuarios[2] = "Gerardo";
    usuarios[3] = "Andrea";
    usuarios[4] = "Alejandro";
    usuarios[5] = "Gary";
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
    passwd[5] = "gry";
    passwd[6] = "cml";
    passwd[7] = "jssc";
    passwd[8] = "sf";
    passwd[9] = "jrg";

    //Array Balances
    balance[0] = 0;
    balance[1] = 0;
    balance[2] = 0;
    balance[3] = 0;
    balance[4] = 0;
    balance[5] = 0;
    balance[6] = 0;
    balance[7] = 0;
    balance[8] = 0;
    balance[9] = 0;


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

    for (indx = 0; indx < usuarios.length; indx++){ //Checa todos los indexes de los dos arrays

	if(input_pass.equals(passwd[indx]) && input_usuario.equals(usuarios[indx])){ //Usuario y Contraseña correctas

	  ventana.showMessageDialog(null, "Bienvenid@ " + input_usuario + "!", "Acceso Concedido",JOptionPane.INFORMATION_MESSAGE);
	    log_in = true; //Para salir del loop
	    num_user = indx;
        
	}//fin if

    }//fin for
    
    indx = 0;
    //Reiniciar el contador
	 
     }//cierra password

     public static void menu(){

	 input_menu =  ventana.showOptionDialog(null, "Escoge tu opcion " + input_usuario + ":", "Banco NEOMEX" ,0, JOptionPane.QUESTION_MESSAGE,null,botones,botones[0]);

	regreso_menu = true;

	 switch(input_menu){

	 case 0:

	     editar_balance = ventana.showInputDialog(null,"Ingresa el nuevo balance:", "Edición de Balance", JOptionPane.INFORMATION_MESSAGE);
	     balance[num_user] = Integer.parseInt(editar_balance);
	     break;

	 case 1:
	     ventana.showMessageDialog(null, "$" + balance[num_user],"Tu balance, " + input_usuario +":",JOptionPane.INFORMATION_MESSAGE );
	     break;

	 case 2:
	     break;

	 case 3:

	     ventana.showMessageDialog(null, "Gracias por usar este servicio, " + input_usuario + "!","Banco NEOMEX",JOptionPane.INFORMATION_MESSAGE);
	     regreso_menu = false;
	     
	     break;

	 default:

	     
	     break;

	 }//cierra switch
        
	 
	 
	 
     }//cierra menu

}
