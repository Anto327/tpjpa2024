package jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Utilisateur {

    @Id
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String phone;
    private String dateOfBirth;

    public Utilisateur() {
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
