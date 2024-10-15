/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

/**
 *
 * @author josca
 */
public class MisCuentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta miCuenta1 = new Cuenta(); 
        Cuenta miCuenta2 = new Cuenta(6000);
        System.out.println("Limite de cuenta 1 (normal): ");
        System.out.println(miCuenta1.getLimiteCredito());
        System.out.println("Limite de cuenta 2 (vip): ");
        System.out.println(miCuenta2.getLimiteCredito());
    }
    
}
