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
public class Consumo {
    private int quilometros;
    private float litros;
    
    // Construtor
    public Consumo(int km, float litros){
        this.quilometros = km;
        this.litros = litros;
    } 

    public int getQuilometros() {
        return quilometros;
    }

    public void setQuilometros(int quilometros) {
        this.quilometros = quilometros;
    }

    public float getLitros() {
        return litros;
    }

    public void setLitros(float litros) {
        this.litros = litros;
    }
    
    public float calcularConsumo() {
        return quilometros /litros;
    }
    
    // Método de exibição padrão
    @Override
    public String toString() {
        return "\nCálculo do consumo de um veículo:\n" +
           "Distância: " + quilometros + " km\n" +
           "Combustível: " + litros + " L\n" +
           "Consumo médio: " + calcularConsumo() + " km/L\n";
    };
}
