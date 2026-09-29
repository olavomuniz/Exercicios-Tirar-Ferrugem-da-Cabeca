package com.mycompany.exercicios_ferrugem;

import java.util.Scanner;


public class Exercicio_6 {


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int [][] m = new int [3][3];
        int erroL=0, erroC=0, erroN=0, erroD1=0, erroD2=0;
        
        System.out.println("Escreva um numero de 1 a 9 para a matriz");
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite linha [" + i + "] coluna ["+ j +"]: ");
                m[i][j] = ler.nextInt();
            }
        }
        
        
        
        
        int somaR = 0;
        for (int j = 0; j < 3; j++) {
            somaR += m[0][j];
        }
        
        int erro = 0;
        
        for (int i = 0; i < 3; i++) {
            int somaL = 0;
            
            for (int j = 0; j < 3; j++) {
                somaL += m[i][j];
            }
            
            if (somaL != somaR) {
                erro = 1;
                erroL = 1;
            }
        }
        
        
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                for (int x = 0; x < 3; x++) {

                    for (int y = 0; y < 3; y++) {

                        if (i != x || j != y) {

                            if (m[i][j] == m[x][y]) {
                                erro = 1;
                                erroN = 1;
                            }

                        }

                    }

                }

            }

        }
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                if (m[i][j] < 1 || m[i][j] > 9) {
                    erro = 1;
                    erroN = 1;
                }
            }
        }

        
        for (int j = 0; j < 3; j++) {
            int somaC = 0;
            
            for (int i = 0; i < 3; i++) {
                somaC += m[i][j];
            }
            
            if (somaC != somaR) {
                erro = 1;
                erroC = 1;
            }
        }
        
        int somaD1 = 0;
        for (int i = 0; i < 3; i++) {
            somaD1 += m[i][i];
        }
        
        if (somaD1 != somaR) {
            erro = 1;
            erroD1 = 1;
        }
        
        int somaD2 = 0;
        for (int i = 0; i < 3; i++) {
            somaD2 += m[i][2-i];
        }
        
        if (somaD2 != somaR) {
            erro = 1;
            erroD2 = 1;
        }
        
        if (erro == 0) {
            System.out.println("\nE um quadrado magico!");
            System.out.println("\nMATRIZ DIGITADA!\n");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(m[i][j]  + "\t ");
                }
                System.out.println("");
            }
        } else {
            System.out.println("\nNAO e um quadrado magico!\n");
            System.out.println("Condicoes Nao Atendidas:\n");
            
            if (erroL == 1) {
                System.out.println("- As linhas nao possuem a mesma soma");
            }
            
            if (erroC == 1) {
                System.out.println("- As colunas nao possuem a mesma soma");
            }
            
            if (erroN == 1) {
                System.out.println("- Existe numeros repetidos ou invalidos na matriz");
            }
            
            if (erroD1 == 1) {
                System.out.println("- A diagonal principal nao possui a soma correta");
            }
            
            if (erroD2 == 1) {
                System.out.println("- A diagonal secundaria nao possui a soma correta");
            }
            
            System.out.println("\nMATRIZ DIGITADA!\n");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(m[i][j]  + "\t ");
                }
                System.out.println("");
            }
            
        }      
    }
}