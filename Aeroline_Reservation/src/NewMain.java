
import Logic.Reservation;
import java.util.Arrays;
import javax.swing.JOptionPane;
import models.Passenger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Edwin
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Passenger passenger1 = new Passenger(702700150, "Edwin", "Molina");
         Passenger passenger2 = new Passenger(702700150, "Ed", "Molina");
        Reservation reservation = new Reservation(4, 3);
       reservation.addReservation();
        System.out.println(reservation.print());
    }
    
}
