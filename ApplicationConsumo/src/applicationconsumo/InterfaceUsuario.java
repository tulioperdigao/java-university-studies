/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationconsumo;

import java.util.Scanner;

/**
 *
 * @author Tulio Castro
 */
public class InterfaceUsuario {
    private Scanner scan;
    
    public InterfaceUsuario(){
        scan = new Scanner(System.in);
    }
    
    public int lerQuilometros() {
        System.out.println("Digite a distância percorrida (Km):");
        return scan.nextInt();
    }
    
    public int lerLitros() {
        System.out.println("Digita a quantidade de combustível gasto (litros):");
        return scan.nextInt();
    }
    
    public void exibirResultado(Consumo consumo) {
        System.out.println(consumo.toString());
    }
}
