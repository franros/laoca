package net.xeill.elpuig;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
            FileReader partidaguardada = new FileReader("partidaguardar.txt");
                    //no se si la localización es correcta, ni si la forma es correcta
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
