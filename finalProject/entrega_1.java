/*
Martin Alegria
A01022216
27-OCT-2016
Primera Entrega de Proyecto
 */

import javax.swing.*;
import java.lang.*;
import java.util.*;

public class entrega_1 {

public static void main (String[] args) {

    //Variables
    JOptionPane ventana = new JOptionPane();
    String[] botones = {"Salir "}; 
    String[] usuarios = new String[10];
    String[] passwd = new String[10];
    int indx = 0;
    int input = -1;
    Boolean log_in = false;
    Boolean regreso = false;

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

    do{

    //Drop-down menu de usuarios
    String input_usuario = (String) ventana.showInputDialog(null, "Escoge el usuario: ","Usuarios", JOptionPane.QUESTION_MESSAGE, null, usuarios, usuarios[0]);
 
    //Loop de contraseña correcta/incorrecta incorrecta
    do{

    String input_pass = (String) ventana.showInputDialog(null, "Ingresa la contraseña: ", "Password", JOptionPane.QUESTION_MESSAGE);

    for (indx = 0; indx < usuarios.length; indx++){ //Checa todos los indexes de los dos arrays

	if(input_pass.equals(passwd[indx]) && input_usuario.equals(usuarios[indx])){ //Usuario y Contraseña correctas

	   input = ventana.showOptionDialog(null, "Bienvenid@ " + input_usuario + "!", "Acceso Concedido",0,JOptionPane.QUESTION_MESSAGE,null, botones,botones[0]);
	    log_in = true; //Para salir del loop
        
	}//fin if

    }//fin for
    
    indx = 0; //Reiniciar el contador
    
    }while(log_in == false); //Regresa a input de contraseña

    log_in = false; /*En el caso de correr el programa por primera vez y tener la contraseña correcta, este statement hace que el do-while vuelva a correr, ya que al correr el programa y tener contraseña correcta la variable log_in queda como 'true' para la segunda corrida del programa */
    
    switch(input){

    case 0:
	regreso = true; //Para salir del loop que lleva de regreso al login.
	break;

    default:
	break;
    }
    

    }while(regreso == true);//regresa a Login

  
}//main
}
