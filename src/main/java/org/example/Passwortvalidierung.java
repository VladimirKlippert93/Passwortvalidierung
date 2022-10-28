package org.example;

public class Passwortvalidierung {
    public static void main(String[] args) {
        String password = "DDFdf312346322442";
        password_Check(password);
        System.out.println(password);
    }

    public static Boolean password_Check(String passwordGiven) {
        boolean isSafe = false;
        boolean methodChecker = false;
        String informationLow = "Dein Passwort sollte Kleinschreibung berücksichtigen.";
        String informationUp = "Dein Passwort sollte Großschreibung berücksichtigen.";
        boolean lowFlag = false;
        boolean upFlag = false;
        char[] passwordChars = passwordGiven.toCharArray();

        //Check for Upper & Lower Case
        for (int i = 0; i < passwordChars.length; i++) {
            if (Character.isUpperCase(passwordChars[i])) {
                upFlag=true;
            }if (Character.isLowerCase(passwordChars[i])) {
                lowFlag=true;
            }
        }
        //Output information for Cases
        if (upFlag==false)
            System.out.println(informationUp);
        if(lowFlag==false)
            System.out.println(informationLow);

        //Check for length
        if (passwordGiven.length() < 8) {
            isSafe = false;
            System.out.println("Password ist zu kurz, bitte verwenden Sie ein längeres Password");
        } else {
            //Check for numbers in the password
            for (int i = 0; i < passwordChars.length; i++) {
                if (Character.isDigit(passwordChars[i])) {
                    methodChecker = true;
                }
            }
            //Check for letters in the password
            if (methodChecker == true) {
                for (int i = 0; i < passwordChars.length; i++) {
                    if (Character.isLetter(passwordChars[i])) {
                        isSafe = true;
                    }
                }
            }
        }
        System.out.println(isSafe);
        if (isSafe == false)
            System.out.println("Ihr Passwort entspircht nicht dem Sicherheitsstandard. Es müssen Zahlen und Buchstaben vorhanden sein! Ihr Password lautet: " + passwordGiven);
        return isSafe;
    }
}