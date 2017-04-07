/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLADOR;

import DAO.CuentaDAO;
import MODELO.CuentaBancaria;
import java.util.ArrayList;

/**
 *
 * @author HP GABY
 */
public class ControladorCuenta {
    
     ArrayList<CuentaBancaria> cuentas;
    private CuentaDAO dao;

    public ControladorCuenta() {
        cuentas = new ArrayList<>();
        dao = new CuentaDAO();

    }



    public boolean RegistrarUsuario(CuentaBancaria cu) {

        dao.conectar();
        boolean ban = dao.agregarCuenta(cu);
        dao.desconectar();
        return ban;
    }


    public ArrayList<CuentaBancaria> obtenerCuentas() {
        dao.conectar();
        ArrayList<CuentaBancaria> us = dao.obtenerCuenta();
        dao.desconectar();
        return us;
    }
}
