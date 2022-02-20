package com.br.verifyPassword.unittests;

import com.br.verifyPassword.service.VerifyPassword;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VerifyPasswordTest {
    /**
     * the test checks if the password is less than 6 characters
     */
    @Test
    void shouldVerifyPasswordReturnThree() {
        VerifyPassword verify = new VerifyPassword();
        Assertions.assertEquals(3, verify.verifyPassword("Ya3"));
    }

    /**
     * The test checks when it is at least 6 characters long but does not meet the other criteria
     */
    @Test
    void shouldVerifyPasswordReturnScoreFour() {
        VerifyPassword verify = new VerifyPassword();
        Assertions.assertEquals(4, verify.verifyPassword("======"));
    }

    /**
     * The test checks when it is at least 6 characters long and meets 1 of the criteria
     */
    @Test
    void shouldVerifyPasswordReturnScoreThree() {
        VerifyPassword verify = new VerifyPassword();
        Assertions.assertEquals(3, verify.verifyPassword("aaaaaa"));
    }

    /**
     * The test checks when it is at least 6 characters long and meets 2 of the criteria
     */
    @Test
    void shouldVerifyPasswordReturnScoreTwo() {
        VerifyPassword verify = new VerifyPassword();
        Assertions.assertEquals(2, verify.verifyPassword("Yaaaaa"));
    }

    /**
     * The test checks when it is at least 6 characters long and meets 3 of the criteria
     */
    @Test
    void shouldVerifyPasswordReturnScoreOne() {
        VerifyPassword verify = new VerifyPassword();
        Assertions.assertEquals(1, verify.verifyPassword("Ya3aaa"));
    }

    /**
     * Test checks when it is at least 6 characters long and meets all criteria
     */
    @Test
    void shouldVerifyPasswordReturnScoreZero() {
        VerifyPassword verify = new VerifyPassword();
        Assertions.assertEquals(0, verify.verifyPassword("Ya3&ab"));
    }
}
