
package com.mycompany.exercicios_ferrugem;

import java.util.Scanner;


public class Exercicio_7 {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int [][] tab = new int [8][8];
        int [][] tiros = new int [8][8];
        
        int erro = 0, navios = 0, disparos = 0, repetidos = 0, acertos = 0;
        
        while (navios < 5) {
            int li = 0, co = 0;
            
            System.out.println("\nDigite a linha do navio (0 a 7): ");
            li = ler.nextInt();
            
            System.out.println("Digite a coluna do navio (0 a 7): ");
            co = ler.nextInt();
            
            if (li < 0 || li > 7 || co < 0 || co > 7) {
                System.out.println("\nPosicao fora do tabuleiro!\n");
            }
            
            else if (tab[li][co] == 1) {
                System.out.println("\nJa existe um navio nessa posicao!\n");
            }
            
            else {
                tab[li][co] = 1;
                navios++;
                System.out.println("\n===============================");
                System.out.println("NAVIO COLOCADO COM SUCESSO");
                System.out.println("===============================");
            }
        }
        
        System.out.println("\nTodos os navios foram colocados em suas posicoes");
        System.out.println("COMECE A BATALHA!");
        
        
        while (disparos < 15 && acertos < 5) {
            int li = 0, co = 0;
            
            System.out.println("Digite a linha do disparo (0 a 7): ");
            li = ler.nextInt();
            
            System.out.println("Digite a coluna do disparo (0 a 7): ");
            co = ler.nextInt();
            
            if (li < 0 || li > 7 || co < 0 || co > 7) {
                System.out.println("\nDisparo feito fora do tabuleiro\n");
                continue;
            }
            
            disparos++;
            
            if (tiros[li][co] == 1) {
                repetidos++;
                System.out.println("\nDisparo repetido!\n");
            } else {
                
                tiros[li][co] = 1;
                
                if (tab[li][co] == 1) {
                    acertos++;
                    System.out.println("\nACERTOU\n");
                } else {
                    erro++;
                    System.out.println("\nERROU\n");
                }
            } 
        }
        
        System.out.println("\n===== FIM DA PARTIDA =====");
        System.out.println("Acertos: " + acertos);
        System.out.println("Erros: " + erro);
        System.out.println("Disparos repetidos: " + repetidos);
        
    }
    
}
