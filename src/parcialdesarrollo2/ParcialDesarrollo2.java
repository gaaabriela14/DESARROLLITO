/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialdesarrollo2;

import MODELO.CuentaBancaria;

/**
 *
 * @author HP GABY
 */
public class ParcialDesarrollo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double totalCuenta;

        // Creamos la cuenta
        CuentaBancaria Cuenta1;
        Cuenta1 = new CuentaBancaria(30000, 200.000);

        // Consultamos el saldo
        totalCuenta = Cuenta1.saldo();
        System.out.println("Total actual en la cuenta: " + totalCuenta + " $");

        // Hacemos un ingreso en la cuenta
        double ingreso = 35.000;
        System.out.println("Se ingresan en la cuenta: " + ingreso + " $");
        Cuenta1.depositar(ingreso);

        System.out.println("-------------------------------------------------");

        // Consultamos el saldo de nuevo
        totalCuenta = Cuenta1.saldo();
        System.out.println("Total actual en la cuenta: " + totalCuenta + " $");

    }
}
