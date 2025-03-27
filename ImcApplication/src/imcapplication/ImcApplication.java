/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imcapplication;

import java.util.Scanner;

/**
 *
 * @author Tulio Perdigão de Castro
 */
public class ImcApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declaração dos objetos de interesse
        CalculoImc calculoimc;
        
        // Interface com o usuário
        Scanner scan = new Scanner ( System.in );
        
        System.out.println("Digite o seu peso em quilos: ");
        int peso = scan.nextInt();
        System.out.println("Digite o sua altura em metros: ");
        float altura = scan.nextFloat();
        
        calculoimc = new CalculoImc(peso, altura);
        
        
        System.out.println(calculoimc.toString());
    }
    
}
