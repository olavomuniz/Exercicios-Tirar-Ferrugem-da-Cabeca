package com.mycompany.exercicios_ferrugem;

import java.util.Scanner;


public class Exercicio_5 {


    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int[] vetor = new int[20];
        int[] ori = new int[20];

        
        System.out.println("Digite 20 numeros: ");

        for (int i = 0; i < 20; i++) {
            vetor[i] = ler.nextInt();
            ori[i] = vetor[i];
        }

        int com = 0;
        int trocas = 0;

        
        for (int i = 0; i < 19; i++) {

            for (int j = 0; j < 19 - i; j++) {

                
                com++;

                
                if (vetor[j] > vetor[j + 1]) {

                    int temp = vetor[j];

                    vetor[j] = vetor[j + 1];

                    vetor[j + 1] = temp;

                    
                    trocas++;
                }
            }
        }

        
        double mediana = (vetor[9] + vetor[10]) / 2.0;

        
        System.out.println("\nVetor original:");

        for (int i = 0; i < 20; i++) {
            System.out.print(ori[i] + " ");
        }

        
        System.out.println("\n\nVetor ordenado:");

        for (int i = 0; i < 20; i++) {
            System.out.print(vetor[i] + " ");
        }

        
        System.out.println("\n\nQuantidade de trocas: " + trocas);
        System.out.println("Quantidade de comparacoes: " + com);
        System.out.println("Mediana: " + mediana);

        
    }
}