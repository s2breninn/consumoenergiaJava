/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consumoenergia;

import javax.swing.JOptionPane;

/**
 *
 * @author scorpion777
 */
public class ConsumoEnergia {

    public static void main(String[] args) {
        String nome = "Breno subiu mais uma versão do código aqui";
        String e;
        
        e = JOptionPane.showInputDialog("Informar o kw/h: ");
        float kwh = Float.parseFloat(e);
        
        int b = 0;
        
        do{
            e = JOptionPane.showInputDialog("Informe a bandeira: \n1 - Azul\n2 - Amarela\n3 - Vermelha");
            b = Integer.parseInt(e);
        } while(b<1 || b>3);
        
        float vkwh, tb;
        
        // Azul
        if(b == 1){
            vkwh = 0.736f;
            tb = 0;
        } else if(b == 2){
            vkwh = 0.817f;
            tb = 4.78f;
        }
        else{       
            vkwh = 0.875f;
            tb = 7.53f;
        }
        
        // Consumo mensal
        float cm = kwh * vkwh;
        
        // Taxa de iluminação
        float ti = 31.75f + cm * 0.575f/100.0f;
        
        // Valor conta
        float vt = cm + tb + ti;
        
        // Exibir mensagem
        JOptionPane.showMessageDialog(null, 
            "Consumo mensal: " + String.format("%.2f", cm) +
            "\nTaxa bandeira: " + String.format("%.2f", tb)  +
            "\nTaxa iluminação: " + String.format("%.2f", ti)  +
            "\nValor total: " + String.format("%.2f", vt)
        );
    }
}
