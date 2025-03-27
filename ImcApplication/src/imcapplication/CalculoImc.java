/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imcapplication;

/**
 *
 * @author 00353465
 */
public class CalculoImc {
    int peso;
    float altura;
    
    
    //Construtor
    public CalculoImc(int peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    };
    
    //Métodos de saída
    public float imc() {
        return peso /(altura * altura);
    };
    
    public String analiseImc() {
        String resultadoImc = "";
        if (imc() < 18.5) {
            resultadoImc = "Abaixo do peso.";
            return resultadoImc;
        }else if (imc() < 24.9 ){
            resultadoImc = "Peso normal.";
            return resultadoImc;
        }else if (imc() < 29.9 ){
            resultadoImc = "Sobrepeso.";
            return resultadoImc;
        }else if (imc() < 34.9 ){
            resultadoImc = "Obesidade grau I.";
            return resultadoImc;
        }else if (imc() < 39.9 ){
            resultadoImc = "Obesidade grau II.";
            return resultadoImc;
        }else {
            resultadoImc = "Obesidade mórbida.";
            return resultadoImc;
        }
    };
    
    
    // Método de exibição padrão
    @Override
    public String toString() {
        String saida = "\nCálculo do ìndica de massa corporal\n";
        saida += "Peso em quilos (Kg): " + this.peso;
        saida += "\nAltura em metros (m)" + this.altura;
        saida += "\nÍndice de Massa Corpórea (IMC): " + imc();
        saida += "\nResultado: " + analiseImc();
        return saida;
    };
}
