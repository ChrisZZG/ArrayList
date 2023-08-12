/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arraylist2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EQUIPO
 */
public class ArrayList2 {

    public static void main(String[] args) {
        
        //Instancio Perro
        List<Perro> lista = new ArrayList<Perro> ();
        
        //Asignacion de Elements
        lista.add(new Perro(1, "Homero", 5.4));
        lista.add(new Perro(2, "Lola", 10.5));
        lista.add(new Perro(3, "Firulais", 7.6));
        
        //Recorrer con For Normal
        for(int i=0; i<lista.size(); i++){
            System.out.println("Nombre: " + lista.get(i).getNombre());
            System.out.println("-----------------");
        }
        
        //Recorrer con for-each
        for(Perro perris:lista){
            System.out.println("Nombre: " + perris.getNombre());
            System.out.println("Peso: " + perris.getPeso());
            System.out.println("------------");
        }
    }
}
