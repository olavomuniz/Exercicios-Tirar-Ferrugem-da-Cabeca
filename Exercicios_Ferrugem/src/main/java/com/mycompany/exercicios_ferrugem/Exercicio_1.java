
package com.mycompany.exercicios_ferrugem;
import java.util.Scanner;


public class Exercicio_1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double [] v = new double [10];
        double media = 0, soma = 0;
        int t = 0, m = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Escreva a nota do aluno " + (i+1) + ": ");
            v[i] = ler.nextDouble();
            soma += v[i];
        }
        
        double menor = v[0];
	double maior = v[0];
        media = soma / 10; 
        
        for (int i = 0; i < 10; i++) {
            
            
            if (v[i] > maior) {
                maior = v[i];
            }
            
            if (v[i] < menor) {
                menor = v[i];
            }
        }
        
        for (int i = 0; i < 10; i++) {
            
            if (v[i] >= 7) {
                t++;
            }
            
        }
        
        for (int i = 0; i < 10; i++) {
            
            if (v[i] < media) {
                m++;
            }
        }
        
        
        System.out.println("A media e: "+ media);
        System.out.println("A maior nota e: "+ maior);
        System.out.println("A menor nota e: "+ menor);
        System.out.println("A quantidade de alunos com a nota maior ou igual a 7 e: "+ t);
        System.out.println("A quantidade de aluno com a nota abaixo da media e: "+ m);
        
    }
}
