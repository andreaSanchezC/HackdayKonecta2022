/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancooo;

import java.util.ArrayList;

/**
 *
 * @author estudiantelis
 */
public class TarjetaCredito {
    ArrayList<TarjetaCredito> tarjetasdecredito;

    private String user;
    private double deuda;
    private double cupo;
    private String idTC;

    public boolean retirar(double montoTC) {
        if (montoTC < cupo && montoTC + deuda < cupo && montoTC > 0) {
            deuda = deuda + montoTC;
            return true;
        } else {
            return false;
        }

    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    public double getCupo() {
        return cupo;
    }

    public void setCupo(double cupo) {
        this.cupo = cupo;
    }

    public String getIdTC() {
        return idTC;
    }

    public void setIdTC(String idTC) {
        this.idTC = idTC;
    }

    public TarjetaCredito() {
        this.user = "";
        this.deuda = 0.0;
        this.cupo = 500.000;
        this.idTC = "";
    }
    

    public TarjetaCredito(String user, double deuda, double cupo, String idTC) {
        this.user = user;
        this.deuda = deuda;
        this.cupo = cupo;
        this.idTC = idTC;
    }

    @Override
    public String toString() {
        return "TarjetaCredito " + " user= " + user + " deuda= " + deuda + " cupo= " + cupo + " idTC= " + idTC ;
    }
    
    

}
