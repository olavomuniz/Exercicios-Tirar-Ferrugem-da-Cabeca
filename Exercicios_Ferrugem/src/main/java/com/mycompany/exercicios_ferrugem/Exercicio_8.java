package com.mycompany.exercicios_ferrugem;

import java.util.Scanner;


public class Exercicio_8 {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int [][] m = new int [10][12];
        
        System.out.println("ASSENTOS DO CINEMA!");
        
        int menu = 0;
        
        while (menu != 6) {
            System.out.println("==== MENU ====\n");
            
            System.out.println("1 - Reservar um assento\n"
                    + "2 - Cancelar uma reserva\n"
                    + "3 - Exibir o mapa dos assentos\n"
                    + "4 - Mostrar a quantidade de assentos livres e ocupados\n"
                    + "5 - Encontrar uma sequencia de assentos livres\n"
                    + "6 - Encerrar\n");
            System.out.println("Digite  um numero: ");
            menu = ler.nextInt();
            
            int fileira=0, assento=0;
            int fileiraC, assentoC;
            
            if (menu == 1) {
                System.out.println("Escolha a fileira do seu assento (1 a 10): ");
                fileira = ler.nextInt();
                
                System.out.println("Escolha o seu assento (1 a 12): ");
                assento = ler.nextInt();
                
                if (fileira >= 1 && fileira <= 10 &&
                    assento >= 1 && assento <= 12) {

                    if (m[fileira - 1][assento - 1] == 0) {

                        m[fileira - 1][assento - 1] = 1;

                        System.out.println("Assento reservado com sucesso!");

                    } else {

                        System.out.println("Esse assento ja esta ocupado!");
                    }
                } else {
                    System.out.println("Fileira ou assento inválido!");
                }
            }
                
                
            else if (menu == 2) {
                System.out.println("Escolha a fileira que deseja cancelar: ");
                fileiraC = ler.nextInt();
                    
                System.out.println("Escolha o assento que deseja cancelar: ");
                assentoC = ler.nextInt();
                    
                if (fileiraC >= 1 && fileiraC <= 10 && assentoC >= 1 && assentoC <= 12) {
                        
                    if (m[fileiraC - 1][assentoC - 1] == 1) {
                        
                        m[fileiraC - 1][assentoC - 1] = 0;
                        System.out.println("Assento cancelado!");
                            
                    } else { 
                        System.out.println("Esse assento ja esta livre");
                    }
                        
                } else {
                    System.out.println("Fileira ou assento invalido!");
                } 
            }
                
            else if (menu == 3) {
                System.out.println("ASSENTOS!\n");
                for (int i = 0; i < 10; i++) {
                        
                    for (int j = 0; j < 12; j++) {
                        System.out.print(m[i][j]  + " \t");
                    }
                    System.out.println();
                }
            }
                
            else if (menu == 4) {
                int li = 0, ocu = 0;
                    
                for (int i = 0; i < 10; i++) {
                        
                    for (int j = 0; j < 12; j++) {
                            
                        if (m[i][j] == 0) {
                            li++;
                        } else {
                        ocu++;
                        }
                    }
                }
                
                System.out.println("Assentos Livres: "+ li);
                System.out.println("Assentos Ocupados: "+ ocu);
            }
            
            
            else if (menu == 5) {
                int pessoas;
                
                System.out.println("Digite a quantidade de pessoas precisam sentar juntas: ");
                pessoas = ler.nextInt();
                
                int enc = 0;
                for (int i = 0; i < 10; i++) {
                    
                    int contador = 0;
                    
                    for (int j = 0; j < 12; j++) {
                        
                        if (m[i][j] == 0) {
                            contador++;
                        } else {
                            contador = 0;
                        }
                        if (contador == pessoas && enc == 0) {
                            System.out.println("Sequencia encontrada!");
                            System.out.println("Fileira: "+ (i + 1));
                            System.out.println("Assentos: ");
                            
                            for (int k = j - pessoas + 1; k <= j; k++) {
                                System.out.print((k + 1) + " ");
                            }
                            System.out.println();
                            enc = 1;
                        }
                    }
                }
                if (enc == 0) {
                    System.out.println("Nao foi encontrada uma sequencia de "
                            + pessoas + " assentos livres.");
                } 
            }
            else if (menu == 6) {
                System.out.println("PROGRAMA ENCERRADO!");
            } else {
                System.out.println("Opcao invalida!");
            }
        }    
    }
}