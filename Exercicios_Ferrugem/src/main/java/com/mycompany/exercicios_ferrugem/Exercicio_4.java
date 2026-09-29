package com.mycompany.exercicios_ferrugem;
import java.util.Scanner;

public class Exercicio_4 {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int [][] m = new int [5][5];
        int [][] m2 = new int [5][5];
        
        for (int i = 0; i < 5; i++) {
            
            for (int j = 0; j < 5; j++) {
                System.out.println("Escreva a linha["+ i +"] coluna ["+ j +"]: ");
                m[i][j] = ler.nextInt();
            }
        }
        
  
        for (int i = 0; i < 5; i++) {
            
            for (int j = 0; j < 5; j++) {
                m2[j][4-i] = m [i][j];
            }
        }
        
        System.out.println("Matriz!");
        
        for (int i = 0; i < 5; i++) {
            
            for (int j = 0; j < 5; j++) {
                System.out.print(m[i][j] + "\t ");
            }
            System.out.println();
        }
        
        System.out.println("\nMatriz rotacionada:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                System.out.print(m2[i][j] + "\t ");

            }

            System.out.println();
        }      
    } 
}