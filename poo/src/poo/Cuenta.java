/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author josca
 */
public class Cuenta {
    private double saldo;
    private double limiteCredito;
    private static final double LIMITE = 500;
    
    public Cuenta() {
    this.saldo = 0;
    this.limiteCredito = LIMITE;}
    
    public Cuenta(double limiteCredito){
        this.saldo = 0; 
        this.limiteCredito = limiteCredito;
    
    
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }
    
    
    
}
