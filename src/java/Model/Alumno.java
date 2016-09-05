/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author lalap
 */
public class Alumno implements Serializable{
    
    private String code;
    private String firstName;
    private String lastName;
    private String email;
    
  public Alumno() {
        firstName = "";
        lastName = "";
        email = "";
        code = "";
    }
public Alumno(String firstName, String lastName, String email, String code) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.code = code;
    }
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
