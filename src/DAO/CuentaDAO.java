/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODELO.CuentaBancaria;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP GABY
 */
public class CuentaDAO {

    private Connection con;
    private Statement stm;
    private ResultSet rs;

    public void conectar() {
        try {

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            //            System.out.println("Registro exitoso");

            String database = "desarrollo";
            String usuario = "root";
            String clave = "ROOT";
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost/" + database + "?"
                    + "user=" + usuario + "&password=" + clave);

        } catch (Exception e) {

            System.out.println(e.toString());

        }

    }

    public boolean agregarCuenta(CuentaBancaria c) {
        boolean ban = false;
        try {

            String sql = "INSERT INTO cuentaBancaria VALUES('"
                    + c.getNumeroCuenta() + "','"
                    + c.getSaldo() + "')";
            stm = con.createStatement();
            ban = stm.execute(sql);

        } catch (SQLException ex) {
            Logger.getLogger(CuentaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return ban;
    }

    public ArrayList<CuentaBancaria> obtenerCuenta() {
        ArrayList<CuentaBancaria> usuarios = new ArrayList<CuentaBancaria>();
        try {

            String sql = "SELECT * FROM cuentaBancaria";
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {

                int numeroCuenta = rs.getInt("numero de cuenta");
                double saldo = rs.getDouble("saldo");
                CuentaBancaria cb = new CuentaBancaria(numeroCuenta, saldo);
                usuarios.add(cb);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CuentaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuarios;
    }

    public void desconectar() {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CuentaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
