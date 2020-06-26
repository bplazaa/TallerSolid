/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import Adicionales.Aderezo;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Postre {
    protected String sabor;
    protected double precioParcial;
    protected ArrayList<Aderezo> aderezos;

    public Postre(String sabor, double precio){
        this.aderezos= new ArrayList<Aderezo>();
        this.sabor= sabor;
        this.precioParcial= precio;     
    }
    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPrecioParcial() {
        return precioParcial;
    }

    public void setPrecioParcial(double precioParcial) {
        this.precioParcial = precioParcial;
    }

    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }

    public void setAderezos(ArrayList<Aderezo> aderezos) {
        this.aderezos = aderezos;
    }
    public void anadirAderezoPostre(Aderezo aderezo){
        aderezos.add(aderezo);
    }
    
    public void quitarAderezoPostre(Aderezo aderezo){
        aderezos.remove(aderezo);
    }
}
