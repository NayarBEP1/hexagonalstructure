package com.hirex.domain.model.entity;

import static com.hirex.domain.model.entity.DataValidator.*;

public class User {

    private static final String ERROR_NAME_IS_MANDATORY = "Name is mandatory";
    private static final String ERROR_LAST_NAME_IS_MANDATORY = "Last name is mandatory";
    private static final String ERROR_EMAIL_IS_MANDATORY = "Email is mandatory";
    private static final String ERROR_PASS_IS_MANDATORY = "Password is mandatory";

    private long id;
    private String name;
    private String lastName;
    private String email;
    private String pass;

    public User(long id, String name, String lastName, String email, String pass){
        dataValidator(name, lastName, email, pass);
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.pass = pass;
    }

    public User(String name, String lastName, String email, String pass){
        dataValidator(name, lastName, email, pass);
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.pass = pass;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPass() {
        return pass;
    }

    private void dataValidator(String name, String lastName, String email, String pass){
        isMandatory(name, ERROR_NAME_IS_MANDATORY);
        isMandatory(lastName, ERROR_LAST_NAME_IS_MANDATORY);
        isMandatory(email, ERROR_EMAIL_IS_MANDATORY);
        isMandatory(pass, ERROR_PASS_IS_MANDATORY);
    }
}
