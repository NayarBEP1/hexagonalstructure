package com.hirex.infrastructure.databuilder;

import com.hirex.application.handler.command.CommandUser;
import com.hirex.domain.model.entity.User;

public class CommandUserDataBuilder {

    private String name;
    private String lastName;
    private String email;
    private String pass;

    public CommandUserDataBuilder() {
        this.name = "Brayan";
        this.lastName = "Estrada";
        this.email = "brayan.estrada@ceiba.com.co";
        this.pass = "password8characters";
    }

    public CommandUser createUser(){
        return new CommandUser(name, lastName, email, pass);
    }

    public CommandUser createUserWithoutName(){
        return new CommandUser(name, lastName, email, pass);
    }

    public CommandUser createUserWithoutLastName(){
        return new CommandUser(name, lastName, email, pass);
    }

    public CommandUser createUserWithoutEmail(){
        return new CommandUser(name, lastName, email, pass);
    }

    public CommandUser createUserWithoutPassword(){
        return new CommandUser(name, lastName, email, pass);
    }

    public CommandUser build(){
        return new CommandUser(this.name, this.lastName, this.email, this.pass);
    }


}
