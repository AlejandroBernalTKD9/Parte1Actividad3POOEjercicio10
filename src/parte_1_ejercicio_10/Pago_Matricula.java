/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte_1_ejercicio_10;

/**
 *
 * @author Alejandro Bernal
 */
public class Pago_Matricula {
    int estrato;
    double patrimonio;
    public Pago_Matricula(int estrato, double patrimonio) {
        this.estrato = estrato;
        this.patrimonio = patrimonio;
    }
    double pago_matricula_valor() {
        
        if((patrimonio>2000000)&&(estrato>3)){ 
            return 50000 + (0.03*patrimonio);
        }
        else {
            return 50000;
        }
        
    }   
    
}
