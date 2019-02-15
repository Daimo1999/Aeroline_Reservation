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
       
    }
    public void addReservation(int decision) {
        if (decision == 1) {
            for (int i = 0; i < economicClass.length; i++) {
                for (int j = 0; j < economicClass.length; j++) {
                     
                }
            }
        }
    }
    public String stringMatrix() {
        int[] numbArray = new int[40];
        for (int i = 0; i < numbArray.length; i++) {
           numbArray[i] = i+1;
        }
        String[] code = new String[]{"A ","B ","C ","D ","E ", "F ", "G ", "H ", "I ", "J ", "K ", "L ","M ","N ", "Ñ ", "O ", "P ", "Q ", "R ", "S ", "T ", "U ", "V ", "W ", "X ", "Y ", "Z "};
         for (int i = 0; i < ejecutiveClass.length; i++) {
            for (int j = 0; j < ejecutiveClass.length; j++) {
               stringMatrix = ejecutiveClass[i][j] + "";
               stringMatrix += " "; 
               
            }
            stringMatrix += "/n";
        }
        for (int i = 0; i < economicClass.length; i++) {
            for (int j = 0; j < economicClass.length; j++) {
               stringMatrix += economicClass[i][j];
               stringMatrix += " ";
                
            }
            stringMatrix += "/n";
        }
        return stringMatrix;
    }
    
    public void ModifyReservation(Passenger[][] matrixChange) {
        
    
    }
    public void deleteReservation() {
    
    
    }
    
    

    }
