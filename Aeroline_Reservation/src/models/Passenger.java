/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Edwin Molina
 */
public class Passenger {
    private int passportNumber;
    private String Name;
    private String lastName;

    public Passenger() {
    }

    public Passenger(int passportNumber, String Name, String lastName) {
        this.passportNumber = passportNumber;
        this.Name = Name;
        this.lastName = lastName;
    }
   
    public int getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Passenger{" + "passportNumber=" + passportNumber + ", Name=" + Name + ", lastName=" + lastName + '}';
    }
    
    
}
