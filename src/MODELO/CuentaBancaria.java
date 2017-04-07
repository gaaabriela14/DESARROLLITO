/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

/**
 *
 * @author HP GABY
 */
public class CuentaBancaria {

    private int numeroCuenta;
    private double saldo;

    public CuentaBancaria(int cuenta, double inicial) {
        numeroCuenta = cuenta;
        saldo = inicial;
    } // Fin del constructor cuenta

    public void depositar(double cantidad) {
        saldo = saldo + cantidad;
    } // Fin del método depositar

    public void retirar(double cantidad) {
        saldo = saldo - cantidad;
    } // Fin del método retirar

    public double saldo() {
        return saldo;
    } // Fin del método saldo    

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
