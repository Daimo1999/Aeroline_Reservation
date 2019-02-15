/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicInterface;

/**
 *
 * @author Victor
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GraphicInterface g1 = new GraphicInterface();
        
        g1.showWelcomeView();
        g1.showFlightTypeView();
        g1.showSizeEconomicView();
        g1.showSizeExecutiveView();
        g1.PrintDesignAereo();
    }
    
}
