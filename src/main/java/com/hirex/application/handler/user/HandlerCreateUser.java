package com.hirex.application.handler.user;

import com.hirex.application.factory.FactoryUser;
import com.hirex.application.handler.command.CommandUser;
import com.hirex.domain.model.entity.User;
import com.hirex.domain.service.user.ServiceCreateUser;
import org.springframework.stereotype.Component;

@Component
public class HandlerCreateUser {

    private final ServiceCreateUser serviceCreateUser;
    private final FactoryUser factoryUser;

    public HandlerCreateUser(ServiceCreateUser serviceCreateUser, FactoryUser factoryUser) {
        this.serviceCreateUser = serviceCreateUser;
        this.factoryUser = factoryUser;
    }

    public User run(CommandUser commandUser){
        return this.serviceCreateUser.run(this.factoryUser.createUser(commandUser));
    }
}
