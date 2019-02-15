/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphicInterface;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Edwin
 */
public class GraphicInterface {
    
   public void showWelcomeView() {
        JOptionPane.showMessageDialog(null, "Bienvenido \n\n Aerolinea AroundTheWorld \n\n Autor : \n\n Emanuel Arias y Edwin Molina "); 
    }
    public void showErrorMessage (String message){
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE, null);
    }
    
   public  void showFlightTypeView (){
        int f1 = 0;
        int c1 = 0;
        boolean validType = false;
          while (!validType) {            
            try{
                f1 =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de filas del avion"));
                c1 =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de columnas del avion"));
                validType = true;
            } catch (Exception e ){
              this.showErrorMessage("Debe elegir uno de los 2 tipos");
            }
          }      
                
    }
   public int [][] showSizeEconomicView (){
        int f1 = 0;
        int c1 = 0;
        boolean validType = false;
          while (!validType) {            
            try{
                f1 =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de filas del avion"));
                if (f1 < 2) {
                    this.showErrorMessage("la cantidad de filas debe ser mayor que 2");
                }
                c1 =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de columnas del avion"));
                validType = true;
            } catch (Exception e ){
              this.showErrorMessage("Debe elegir uno de los 2 tipos");
            }
          }
          int matrix [][] = new int[f1][c1];
          for (int i = 0; i < matrix.length; i++) {
              for (int j = 0; j < matrix.length; j++) {
                  matrix [i][j] = Integer.parseInt("▯");
                  
              }
           
           
       }
       return matrix;
   }
   public int[][] showSizeExecutiveView (){
        int f1 = 0;
        int c1 = 0;
        boolean validType = false;
          while (!validType) {            
            try{
                f1 =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de filas del avion"));
                if (f1 < 2 && f1 > 4) {
                    this.showErrorMessage("la cantidad de filas debe ser mayor que 2");
                }
                c1 =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de columnas del avion"));
                validType = true;
            } catch (Exception e ){
              this.showErrorMessage("Debe elegir uno de los 2 tipos");
            }
          }
          int matrix [][] = new int[f1][c1];
          for (int i = 0; i < matrix.length; i++) {
              for (int j = 0; j < matrix.length; j++) {
                  matrix [i][j] = Integer.parseInt("▯");
                  
              }
           
           
       }
       return matrix;
   }
   public void PrintDesignAereo (){
       JOptionPane.showConfirmDialog(null, this.showSizeEconomicView());
       JOptionPane.showConfirmDialog(null, this.showSizeExecutiveView());
   }
}
