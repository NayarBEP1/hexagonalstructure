package com.hirex.infrastructure.controller.user;

import com.hirex.application.handler.command.CommandUser;
import com.hirex.application.handler.user.HandlerCreateUser;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class ControllerCreateUser {

    private HandlerCreateUser handlerCreateUser;

    public ControllerCreateUser(HandlerCreateUser handlerCreateUser) {
        this.handlerCreateUser = handlerCreateUser;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void run(@RequestBody CommandUser commandUser){
        this.handlerCreateUser.run(commandUser);
    }
}
