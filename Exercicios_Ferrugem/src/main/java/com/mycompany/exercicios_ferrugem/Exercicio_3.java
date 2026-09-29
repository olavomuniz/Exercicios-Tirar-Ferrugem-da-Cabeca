package com.mycompany.exercicios_ferrugem;
import java.util.Scanner;

public class Exercicio_3 {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int [] v = new int [15];
        int [] v2 = new int [15];
        int verd = 0;
        
        for (int i = 0; i < 15; i++) {
            System.out.println("Escreva o numero: ");
            v[i] = ler.nextInt();
        }
        
        for (int i = 0; i < 15; i++) {
            int repe = 0;
            for (int j = 0; j < verd; j++) {
                if (v[i] == v2[j]){
                    repe = 1;
                }
            }
            if (repe == 0) {
                v2[verd] = v[i];
                verd++;
            }
        }
        
        for (int i = 0; i < verd; i++) {
            
            System.out.print(v2[i] + " ");
        }
        
        System.out.println("");
        System.out.println("Quantidade de numeros diferentes: "+ verd);
        
    }
    
}