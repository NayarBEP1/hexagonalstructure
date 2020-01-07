package com.hirex.domain.model.model;

import com.hirex.domain.databuilder.UserDataBuilder;
import com.hirex.domain.model.entity.User;
import com.hirex.domain.exceptions.ExceptionGeneral;
import org.junit.jupiter.api.Test;

import static com.hirex.domain.model.utils.EntityUserUtils.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestEntityUser {
    private UserDataBuilder dataBuilder = new UserDataBuilder();

    @Test
    public void createUser(){
        User user = dataBuilder.build();
        assertEquals("Brayan", user.getName());
        assertEquals("Estrada", user.getLastName());
        assertEquals("brayan.estrada@ceiba.com.co", user.getEmail());
        assertEquals("password8characters", user.getPass());
    }

    @Test
    public void createUserWithoutName() {
        assertThrows(ExceptionGeneral.class, () -> dataBuilder.userWithName(null).build(), ERROR_NAME_IS_MANDATORY);
    }

    @Test
    public void createUserWithoutLastName() {
        assertThrows(ExceptionGeneral.class, () -> dataBuilder.userWithName(null).build(), ERROR_LAST_NAME_IS_MANDATORY);
    }

    @Test
    public void createUserWithoutEmail() {
        assertThrows(ExceptionGeneral.class, () -> dataBuilder.userWithName(null).build(), ERROR_EMAIL_IS_MANDATORY);
    }

    @Test
    public void createUserWithoutPass() {
        assertThrows(ExceptionGeneral.class, () -> dataBuilder.userWithName(null).build(), ERROR_PASS_IS_MANDATORY);
    }
}
