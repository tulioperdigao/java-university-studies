/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avaliacaodenotas;

public class Notas {
    
    // Declarando as variáveis
    public float n1,n2,n3,n4;

    public Notas(float n1, float n2, float n3, float n4) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
    }
    
    // Verifica qual das notas é a menor
    public float menorNota(){
        float men = n1;  
        if (n2 < men) {
        men = n2;     
        } if (n3 < men) {
          men = n3;     
        }if (n4 < men) {
          men = n4;    
        }
        return men;    
    }
  
    // Calcula a média descartando a menor nota
    public float calculaMedia(){
        float menor = n1;  
        if (n2 < menor) {
        menor = (n1 + n3 + n4)/3;     
        } if (n3 < menor) {
          menor = (n1 + n2 + n4)/3;     
        }if (n4 < menor) {
          menor= (n1 + n3 + n2)/3;     
        }else{
         menor = (n2 + n3 + n4)/3;
        }
        return menor;       
    }
    
    public String resultadoFinal() {
        String notaFinal = "";
        if (calculaMedia() >= 7.0f) {
            notaFinal = "Aprovado";
            return notaFinal;
        } else {
            notaFinal = "Reprovado";
            return notaFinal;
        }
    }

    @Override
    public String toString() {
        return "Notas Obtidas: " + n1 + " - " + n2 + " - " + n3 + " - " + n4 
                + "\nNota descartada: " + menorNota() + "\nMedia do aluno: " + calculaMedia() + 
                "\nSituacao: " + resultadoFinal();
    }
    

   
    
    

   

 
    
    
}
