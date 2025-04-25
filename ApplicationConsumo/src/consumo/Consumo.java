/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumo;

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
        return "Consumo = " + calcularConsumo()+ " Km/L";
    };
}
