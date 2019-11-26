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
public class Trainers {
  private String firstName;
private String lastName;
private String subject;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Trainers{" + "firstName=" + firstName + ", lastName=" + lastName + ", subject=" + subject + '}';
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Trainers(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

}
