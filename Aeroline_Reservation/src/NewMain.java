
import Logic.Reservation;
import java.util.Arrays;

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
        Reservation reservation = new Reservation(4, 3);
        System.out.println(reservation.stringMatrix());
    }
    
}
