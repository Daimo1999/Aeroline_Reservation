/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import models.Passenger;

/**
 *
 * @author Edwin
 */
public class Reservation {
    private Passenger[][] economicClass;
    private Passenger[][] ejecutiveClass;
    private String stringMatrix;

    public Reservation(int rows, int columns) {
        ejecutiveClass = new Passenger[rows][2];
        if(columns>=2 && columns <=4){
             economicClass = new Passenger[rows][columns*2];
        }else{
            System.out.println("La cantidad de columnas debe estar entre 2 y 4");
        }
        for (int i = 0; i < ejecutiveClass.length; i++) {
            for (int j = 0; j < ejecutiveClass.length; j++) {
               stringMatrix = ejecutiveClass[i][i] + "";
               stringMatrix += " "; 
               
            }
            stringMatrix += "/n";
        }
        for (int i = 0; i < economicClass.length; i++) {
            for (int j = 0; j < economicClass.length; j++) {
               stringMatrix += economicClass[i][i];
               stringMatrix += " ";
                
            }
            stringMatrix += "/n";
        }

    }
    public void addReservation(int decision, int repeat) {
        if (decision == 1) {
            for (int i = 0; i < economicClass.length; i++) {
                for (int j = 0; j < economicClass.length; j++) {
                    
                    
                }
        }
            
        }
    
    }
    
    public void ModifyReservation() {
    
    
    }
    public void deleteReservation() {
    
    
    }
    
    

    }
