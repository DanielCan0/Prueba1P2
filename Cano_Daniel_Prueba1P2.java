/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package laboratoriodos;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dany8
 */



public class Cano_Daniel_Prueba1P2 {
     public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
         String palabras[ ] = { "radar", "level", "world", "civic", "java", "deified", "python", "rotor", "language", "madam", "refer", "stats", "noon", "hello",
         "moon", "wow", "racecar", "kayak", "apple", "deed" };

        // --------------------------------------------------------------------//
        
        System.out.println("Lista");
        for (int FilaN = 0; FilaN < palabras.length; FilaN++) {
            System.out.println("["+ FilaN +"]: " + palabras[FilaN]);
        }
        
        
        System.out.println("Ingresar el tamano de los arreglos: ");
        int tamano = lea.nextInt();
        String[] arregloA = new String[tamano];
        String[] arregloB = new String[tamano];
        
        
       
        System.out.println("Lista Palabras Palindroma arreglo A: ");
             for (int numerito = 0; numerito < tamano; numerito++) {
                 System.out.print("[" + numerito + "]: ");
                 arregloA[numerito] = lea.next();
             }
            
        System.out.println("Lista Palabras Palindromas arreglo B: ");
            for (int numerito2 = 0; numerito2 < tamano; numerito2++) {
                System.out.print("[" + numerito2 + "]: ");
                arregloB[numerito2] =lea.next();
            }
                  
                
                
                ArrayList<String> noEnB = new ArrayList<>();
                   for (String palabraA : arregloA) {
                   boolean encontrado = false;
                   for (String palabraB : arregloB) {
                if (palabraA.equals(palabraB)) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                noEnB.add(palabraA);
          }  
            
                   }
            
             System.out.print("Palabras del Arreglo A no estan en el Arreglo B son:");
             for (int numerito3 = 0; numerito3 < noEnB.size(); numerito3++) {
             System.out.println("[" + numerito3 + "]: " + noEnB.get(numerito3));
        }
             
        
            
            
            
                
          
  }
     
}
