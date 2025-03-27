/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avaliacaodenotas;

import java.util.Scanner;

/**
 *
 * @author
 * Gabriel Gustavo Cavalcante Prevedel | RA: 00355045;
 * Marcela Costa dos Santos | RA: 00354653;
 * Matheus Abrahão Massoni | RA: 00353435;
 * Pedro Gabriel Selan Lacerda | RA: 00354527;
 * Rayza Gomes Batista | RA: 00354677;
 * Ryan Silva de Oliveira | RA: 00355025;
 * Tulio Perdigão de Castro | RA: 00353465;
 * 
 */
public class AvaliacaoDeNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner ( System.in );
         
       
        
        System.out.println("Digite a primeira nota do aluno: ");
        float n1 = Float.parseFloat(scan.next().replace(",", "."));

        System.out.println("Digite a segunda nota do aluno: ");
        float n2 = Float.parseFloat(scan.next().replace(",", "."));

        System.out.println("Digite a terceira nota do aluno: ");
        float n3 = Float.parseFloat(scan.next().replace(",", "."));

        System.out.println("Digite a quarta nota do aluno: ");
        float n4 = Float.parseFloat(scan.next().replace(",", "."));
        
       Notas a1;
       a1 = new Notas(n1,n2,n3,n4);
       
       System.out.println(a1.toString());
  
    }
    
}
