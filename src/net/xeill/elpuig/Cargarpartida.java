package net.xeill.elpuig;
import java.io.*;
/**
 *
 * @author fran_
 */
// Debo guardar partida y cargarla en un archivo.


public class Cargarpartida {
    
    public static void main(String[] args){
        
        Leer_partida acceso = new Leer_partida();
        
        acceso.leer();
        
    }
    
}
class Leer_partida{
    public void leer(){
        
        try{
            FileReader partidaguardada = new FileReader("src\\guardar.txt");
                    //no se si la localizacion es correcta, ni si la forma es correcta
            
                    int c =partidaguardada.read();
                    
                    while(c!=-1){
                        
                        c=partidaguardada.read();
                        
                        char letra=(char)c;
                        
                        System.out.print(letra);

                    }
                    partidaguardada.close();
        } catch(IOException e){
            
            System.out.println("No se ha encontrado partida guardada");
        }
    }
}