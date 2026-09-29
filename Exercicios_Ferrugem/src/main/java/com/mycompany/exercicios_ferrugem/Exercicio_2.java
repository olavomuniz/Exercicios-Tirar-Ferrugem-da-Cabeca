package com.mycompany.exercicios_ferrugem;
import java.util.Scanner;


public class Exercicio_2 {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        int [][] matriz = new int [4][4];
        int soma = 0, soma2 = 0;
        
        for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 4; j++) {
                System.out.print("Escreva a linha ["+ i +"] coluna ["+ j +"]: \n");
                matriz[i][j] = ler.nextInt();
            }
        }
        
        System.out.println("Diagonal principal");
        
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][i] + " ");
            
            soma += matriz[i][i];
        }
        
        System.out.println("\nDiagonal Secundaria");
        
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][3-i] + " ");
            
            soma2 += matriz[i][3-i];
        }
        
        System.out.println("\nSoma da diagonal principal: "+ soma);
        System.out.println("Soma da diagonal secundaria: "+ soma2);
        
        
        if (soma > soma2) {
            System.out.println("A diagonal principal possui a maior soma");
        }
        else if (soma2 > soma) {
            System.out.println("A diagonal secundaria possui a maior soma");
        } else {
            System.out.println("A soma das duas diagonais sao iguais");
        }
        
    }
    
}