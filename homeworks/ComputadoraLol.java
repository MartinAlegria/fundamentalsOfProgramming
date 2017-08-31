/*
 Martin Alegría 
A01022216
Clase Computadora
 */

import java.util.*;

public class ComputadoraLol {

    private int ramCompu;
    private String grafCompu;
    private String cpuCompu;
    private int hdCompu;
    
    
    ComputadoraLol(){
    
        this(16,"NVIDIA GTX 1080","Intel i7 7700k", 1024);
    }
    
    //CONSTRUCTOR POR OMISION
    ComputadoraLol(int ramCompu, String grafCompu, String cpuCompu, int hdCompu){
    
        setRamCompu(ramCompu);
        setGrafCompu(grafCompu);
        setCPUCompu(cpuCompu);
        setHDCompu(hdCompu);
        
    }
    
    //GET
    private void setRamCompu(int ramCompu){
        this.ramCompu = ramCompu;
    }
    
    private void setGrafCompu(String grafCompu){
        this.grafCompu = grafCompu;
    }
    
    private void setCPUCompu(String cpuCompu){
        this.cpuCompu = cpuCompu;
    }
    
    private void setHDCompu(int hdCompu){
        this.hdCompu = hdCompu;
    }
    
    //SET
    
    public int getRamCompu(){
        return(ramCompu);
    }
    
    public String getGrafCompu(){
        return(grafCompu);
    }
    
    public String getCPUCompu(){
        return(cpuCompu);
    }
    
    public int getHDCompu(){
        return(hdCompu);
    }
    
    //Prender Compu
    
    public void prenderCompu(){
    
        System.out.println("PRRRRRRRRRRRRRRRRRR");
      
        
        for(int y = 0; y<3; y++){
        for(int x = 0; x<3; x++){
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ex){}
        System.out.print(".");
    }//for
        System.out.println("");
    }//for
try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ex){}
        System.out.println("Computadora Prendida");
    }//PRENDER COMPU
    
    //ImprimirSpecs
    public void imprimirSpecs(){
    
        System.out.println("-----------------------------------------");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
        }
        System.out.println("SPECS");
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ex){}
        System.out.println("RAM: " + getRamCompu() + "GB");
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ex){}
        System.out.println("Tarjeta Grafica: " + getGrafCompu());
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ex){}
        System.out.println("CPU: " + getCPUCompu());
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ex){}
        System.out.println("HardDrive: " + getHDCompu() + "GB");
        
    }//Imprimir Specs

    public String imprimir(){

	String temp;
	temp = "SPECS";
	temp += "\n";
	temp += "RAM: ";
	temp += getRamCompu();
	temp+= "\n";
	temp += "Tarjeta Grafica: ";
	temp += getGrafCompu();
	temp += "\n";
	temp += "CPU: ";
	temp += getCPUCompu();
	temp += "\n";
	temp += "HardDrive:" ;
	temp += getHDCompu();
	return(temp);
	

    }
    
}
