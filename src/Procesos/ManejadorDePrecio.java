/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Adicionales.Aderezo;
import java.util.ArrayList;

/**
 *
 * @author maca-
 */


public class ManejadorDePrecio {
  public static double calcularPrecioFinal(double precioParcial, ArrayList<Aderezo> aderezos){
        double precioFinal;
        precioFinal=(precioParcial+(precioParcial*0.12))+(aderezos.size()*0.50);
        return precioFinal;
    }  
  public static String showPrecioFinal(double precioParcial, ArrayList<Aderezo> aderezos){
        return "Precio Final: $ " + calcularPrecioFinal(precioParcial, aderezos);
    }
}
