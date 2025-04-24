/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationconsumo;

/**
 *
 * @author Tulio Castro
 */
public class ApplicationConsumo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Programa para calcular o consumo de um veículo
        
        // Declaração do objeto de Interface com o Usuário
        InterfaceUsuario UserInterface = new InterfaceUsuario();
        
        // Dados de Entrada
        int km = UserInterface.lerQuilometros();
        float litros = UserInterface.lerLitros();
        
        // Declaração do objeto de interesse
        Consumo consumo = new Consumo(km, litros);
        
        // Impressão do resultado na tela
        UserInterface.exibirResultado(consumo);
        
    }
    
}
