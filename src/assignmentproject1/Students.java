/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentproject1;

/**
 *
 * @author mario
 */
public class Students {
     private String name;

    private String surname;

    private String dateOfBirth;

    private int tuitionFees;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getTuitionFees() {
        return tuitionFees;
    }

    public void setTuitionFees(int tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    public String getName() {
        return name;
    }

    public Students(String name, String surname, String dateOfBirth, int tuitionFees) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.tuitionFees = tuitionFees;
    }

    @Override
    public String toString() {
        return "Students{" + "name=" + name + ", surname=" + surname + ", dateOfBirth=" + dateOfBirth + ", tuitionFees=" + tuitionFees + '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
    
    
    
    
}
