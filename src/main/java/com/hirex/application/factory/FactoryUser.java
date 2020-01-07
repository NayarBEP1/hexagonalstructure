package com.hirex.application.factory;

import com.hirex.application.handler.command.CommandUser;
import com.hirex.domain.model.entity.User;
import org.springframework.stereotype.Component;

@Component
public class FactoryUser {

    public User createUser( CommandUser commandUser){
        return new User(commandUser.getName(), commandUser.getLastName(), commandUser.getEmail(), commandUser.getPass());
    }

}
