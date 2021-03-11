package com.insignia.SpringFormTag.entities;

import javax.validation.constraints.*;

public class Form {

    @NotNull(message ="First Name cannot be empty")
    @Size(min = 1,message ="First Name cannot be empty")
    private String firstName;

    @NotNull(message ="Last Name cannot be empty")
    @Size(min = 1,message ="Last Name cannot be empty")
    private String lastName;

    // for integer field, to make this required we should use Integer instead of int as then it won't get a default value of 0
    @NotNull
    @Min(value = 1,message = "free passes value cannot be less than 1")
    @Max(value = 5,message = "free passes value cannot be more than 5")
    private int freePasses;


    @NotNull(message = "please enter valid postal code")
    @Pattern(regexp="^[0-9]{6}",message="please enter valid postal code")
    private String postalCode;

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

    public int getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
