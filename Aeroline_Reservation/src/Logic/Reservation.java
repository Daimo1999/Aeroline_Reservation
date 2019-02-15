/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import javax.swing.JOptionPane;
import models.Passenger;

/**
 *
 * @author Edwin
 */
public class Reservation {
    private Passenger[][] economicClass;
    private Passenger[][] ejecutiveClass;


    public Reservation(int rows, int columns) {
        ejecutiveClass = new Passenger[rows][2];
        if(columns>=2 && columns <=4){

             economicClass = new Passenger[rows][columns*2];
        }else{
            JOptionPane.showMessageDialog(null, "la cantidad de filas debe de ser de entre 2 y 4", "Error", JOptionPane.ERROR_MESSAGE);
        }
       
    }
    public void addReservation(int decision,int row, int column, Passenger passenger) {
        if (decision == 1) {
            for (int i = 0; i < economicClass.length; i++) {
                for (int j = 0; j < economicClass[i].length; j++) {
                    economicClass[row][column] = passenger; 
                }
            }
        }else if(decision == 2) {
            for (int i = 0; i < ejecutiveClass.length; i++) {
                for (int j = 0; j < ejecutiveClass.length; j++) {
                    ejecutiveClass[row][column] = passenger; 
                }
            } 
        }
    }
    public String stringMatrix() {
        String stringMatrix = "";
        int[] numbArray = new int[40];
        for (int i = 0; i < numbArray.length; i++) {
           numbArray[i] = i+1;
        }
        String[] code = new String[]{"A ","B ","C ","D ","E ", "F ", "G ", "H "};
         for (int i = 0; i < ejecutiveClass.length; i++) {
            for (int j = 0; j < ejecutiveClass[i].length; j++) {
                stringMatrix += numbArray[i] + "";
                stringMatrix +=  "" + code[j];
                stringMatrix += " "; 
               
            }
            
            stringMatrix += "\n";
        }
        for (int i = 0; i < economicClass.length; i++) {
            for (int j = 0; j < economicClass[i].length; j++) {
               stringMatrix += numbArray[i] + "";
               stringMatrix += "" + code[j];
               stringMatrix += " ";
               
            }
            
            stringMatrix += "\n";
        }
        
        return stringMatrix;
    }
    
    public void ModifyReservation() {
        
    
    }
    public void deleteReservation() {
    
    
    }
    
    

    }
