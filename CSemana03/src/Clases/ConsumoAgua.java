/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author ComsLab
 */
public class ConsumoAgua {
    
    private double consumo;

    public ConsumoAgua() {
    }

    public ConsumoAgua(double consumo) {
        this.consumo = consumo;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
    
    public double hallarConsumo(){
        double monto = 0;
        if(consumo < 100 ){
            monto = 0.15* consumo;
        }else if(consumo >=100 & consumo  <= 499){
            monto = 0.20*consumo;
        }else if(consumo >= 500 & consumo <= 1000){
            monto = 0.35*consumo;
        }else if(consumo > 1000){
            monto = 0.80*consumo;
        }
        return monto;
    }
    
    public double hallarImpuesto(){
        double impuesto = 0;
        if(hallarConsumo()>600){
            impuesto = 2.5/100 * hallarConsumo();
        }
        return impuesto;
    }
}
