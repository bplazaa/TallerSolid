/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Adicionales.Crema;
import Adicionales.Frutilla;
import Postres.*;
import Procesos.*;
import Leche.*;
/**
 *
 * @author djurado
 */
public class Sistema {
    public static void main(String [ ] args){
        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        // y cambiar el tipo de leche por Leche Descremada
        // Finalmente mostrar el precio final de cada uno
        LecheDes leche = new LecheDescremada();
        ManejadorDeLeche mnj_leche = new ManejadorDeLeche();
        
        // Producir Helado
                Helado helado_vainilla = new Helado("Vainilla");
        
        
        helado_vainilla.anadirAderezoPostre(helado_vainilla, new Crema());
        helado_vainilla.anadirAderezoPostre(helado_vainilla, new Frutilla());
        System.out.println(helado_vainilla);
        mnj_leche.cambiarTipoLeche(leche, helado_vainilla);
        System.out.println(ManejadorDePrecio.showPrecioFinal(helado_vainilla.getPrecioParcial(), helado_vainilla.getAderezos() ));
        
        // Producir Pastel
        Pastel pastel_chocolate = new Pastel("Chocolate");
        pastel_chocolate.quitarAderezoPostre(pastel_chocolate, new Crema());
        pastel_chocolate.anadirAderezoPostre(pastel_chocolate, new Frutilla());
        System.out.println(pastel_chocolate);
        mnj_leche.cambiarTipoLeche(leche, pastel_chocolate);
        System.out.println(ManejadorDePrecio.showPrecioFinal(pastel_chocolate.getPrecioParcial(), pastel_chocolate.getAderezos()));
        
        
    }
}
