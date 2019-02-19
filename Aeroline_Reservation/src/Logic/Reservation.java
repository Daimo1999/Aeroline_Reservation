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
    private Passenger[] passengerList;


    public Reservation(int rows, int columns) {
        ejecutiveClass = new Passenger[rows][2];
        if(columns>=2 && columns <=4){

             economicClass = new Passenger[rows][columns*2];
        }else{
            JOptionPane.showMessageDialog(null, "la cantidad de columnas del avion debe de ser de entre 2 y 4", "Error", JOptionPane.ERROR_MESSAGE);
        }
       
    }
    public void addReservation() {
        int counter = 0;
        int question = 0;
        String code = "";
        do {
       
            int decision = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de reservacion \n1 = Clase economica \n2 = Clase ejecutiva"));
            int row = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fila"));
            int column = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la columna"));
            if (decision == 1 && economicClass[row][column] == null) {
                Passenger passenger = new Passenger();
                economicClass[row][column] = passenger;
                economicClass[row][column].setName(JOptionPane.showInputDialog("Ingrese el nombre del pasajero"));
                economicClass[row][column].setLastName(JOptionPane.showInputDialog("Ingrese el apellido del pasajero"));
                economicClass[row][column].setPassportNumber(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de pasaporte del pasajero")));
                question = JOptionPane.showConfirmDialog(null, "Desea agregar otro pasajero");
                System.out.println(question);

            }else if(decision == 2 && ejecutiveClass[row][column] == null) {
                Passenger passenger = new Passenger();            
                ejecutiveClass[row][column] = passenger;
                ejecutiveClass[row][column].setName(JOptionPane.showInputDialog("Ingrese el nombre del pasajero"));
                ejecutiveClass[row][column].setLastName(JOptionPane.showInputDialog("Ingrese el apellido del pasajero"));
                ejecutiveClass[row][column].setPassportNumber(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de pasaporte del pasajero")));
                 question = JOptionPane.showConfirmDialog(null, "Desea agregar otro pasajero");    
        
            }else{
                System.out.println("Este lugar ya posee una reservación");
            }
             counter += 1;
        } while (counter != 5 && question != 1);
    }
    public String print() {
        String print = "";
        for (int i = 0; i < economicClass.length; i++) {
            for (int j = 0; j < economicClass[i].length; j++) {
               print += economicClass[i][j];
                
            }
            
        }
        return print;
    } 
  
    public void ModifyReservation() {
        
    
    }
    public void deleteReservation() {
    
    
    }
    
    

    }
