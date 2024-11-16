/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stringhe_j;
import java.util.Scanner;
/**
 *
 * @author utente
 */
public class lettera {

    /**
     *
     */
   
     int contatore = 0;
    
    public void inizializzazione(){
        Scanner scanner =  new Scanner(System.in);

   //stampo "inserisci una frase"
   System.out.println("inserire una frase e premere invio");
   //utilizzo scanner
   String phrase = scanner.nextLine();

   


   // ciclo utilizzato per il conteggio delle a
   for(int i=0; i< phrase.length(); i++){

   // uso if per verificare quante volte esce la lettera a 
   if(phrase.charAt(i)=='a' || phrase.charAt(i)== 'A'){

     contatore++;

   }
   }

   //stampo "il numero di lettere A è:" ed uso il metodo length che conta il numero di lettere in una frase/parola 
   System.out.print("la lettera a compare " + contatore);
  System.out.println(" volte nella frase inserita");

   System.out.println("stampa delle lettera a presenti nella frase ma in maiuscolo :");

   for (int l= 0; l< contatore;l++){

   System.out.println("A");

    }

}
}
