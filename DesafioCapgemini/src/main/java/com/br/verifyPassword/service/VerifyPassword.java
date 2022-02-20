package com.br.verifyPassword.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifyPassword {
    public Integer score = 0;

    /**
     * The method checks if the string meets all the criteria to be a strong password
     * @param password is the string to be verified
     * @return the number of characters needed for the password to be considered strong
     */
    public Integer verifyPassword(String password) {

        if (password.length() < 6) {
            score = 6 - password.length();
        } else {
            score = verifyDigit(password, score);
            score = verifyLowerCase(password, score);
            score = verifyUpperCase(password, score);
            score = verifySpecialCharacter(password, score);
        }

        return score;
    }

    /**
     * The method checks if the Digit criterion was accepted
     * @param password is the string to be verified
     * @param score is the number of criteria that were not met
     * @return the score, if the criterion was not met, increments another 1
     */
    private Integer verifyDigit(String password, int score) {
        boolean isDigit = password.chars().anyMatch(Character::isDigit);
        if (!isDigit) {
            score++;
        }
        return score;
    }

    /**
     * The method checks if the LowerCase criterion was accepted
     * @param password is the string to be verified
     * @param score is the number of criteria that were not met
     * @return the score, if the criterion was not met, increments another 1
     */
    private Integer verifyLowerCase(String password, int score) {
        boolean isLowerCase = password.chars().anyMatch(Character::isLowerCase);
        if (!isLowerCase) {
            score++;
        }
        return score;
    }

    /**
     * The method checks if the UpperCase criterion was accepted
     * @param password is the string to be verified
     * @param score is the number of criteria that were not met
     * @return the score, if the criterion was not met, increments another 1
     */
    private Integer verifyUpperCase(String password, int score) {
        boolean isUpperCase = password.chars().anyMatch(Character::isUpperCase);
        if (!isUpperCase) {
            score++;
        }
        return score;
    }

    /**
     * The method checks if the Special Character criterion was accepted
     * Special Character: !@#$%^&*()-+
     * @param password is the string to be verified
     * @param score is the number of criteria that were not met
     * @return the score, if the criterion was not met, increments another 1
     */
    private Integer verifySpecialCharacter(String password, int score) {
        Pattern pattern = Pattern.compile("[!@#$%^&*()-+]");
        Matcher matcher = pattern.matcher(password);
        boolean isSpecialCharacter = matcher.find();
        if(!isSpecialCharacter) {
            score++;
        }
        return score;
    }
}