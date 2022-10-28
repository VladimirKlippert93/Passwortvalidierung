package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PasswortvalidierungTest {
    @Test
    void password_Check_Test(){
        //given
        String passwordTest = "sDFd235643feg";
        boolean passwordCheck = false;
        boolean expected=true;
        //when
        passwordCheck= Passwortvalidierung.password_Check(passwordTest);
        //then
        assertEquals(expected,passwordCheck);
    }
}