package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void stringsHaveBalancedBrackets() {
        String msg = "balancedBrackets() returns true when given string inside balanced brackets";
        boolean condition = BalancedBrackets.hasBalancedBrackets("[LaunchCode]");
        assertTrue(condition, msg);
    }

    @Test
    public void stringBracketString() {
        String msg = "balancedBrackets() returns true when given string with balanced brackets";
        boolean condition = BalancedBrackets.hasBalancedBrackets("Launch[Code]");
        assertTrue(condition, msg);
    }

    @Test
    public void bracketsFirst() {
        String msg = "balancedBrackets() returns true when balanced brackets are first in string";
        boolean condition = BalancedBrackets.hasBalancedBrackets("[]LaunchCode");
        assertTrue(condition, msg);
    }

    @Test
    public void noBrackets() {
        String msg = "balancedBrackets() returns true when given empty string";
        boolean condition = BalancedBrackets.hasBalancedBrackets("");
        assertTrue(condition, msg);
    }

    @Test
    public void onlyBrackets() {
        String msg = "balancedBrackets() returns true when given brackets only";
        boolean condition = BalancedBrackets.hasBalancedBrackets("[]");
        assertTrue(condition, msg);
    }

    @Test
    public void openBracketOnly() {
        String msg = "balancedBrackets() returns false when given one open bracket";
        boolean condition = BalancedBrackets.hasBalancedBrackets("[LaunchCode");
        assertFalse(condition, msg);
    }
    @Test
    public void reverseBracketString() {
        String msg = "balancedBrackets() return false because brackets are opposite";
        boolean condition = BalancedBrackets.hasBalancedBrackets("Launch]Code[");
        assertFalse(condition, msg);
    }
    @Test
    public void oneOpenBracketString() {
        String msg = "balancedBrackets() return false because there is only one open bracket";
        boolean condition = BalancedBrackets.hasBalancedBrackets( "[");
        assertFalse(condition, msg);
    }
    @Test
    public void bracketsReversedOnly() {
        String msg = "balancedBrackets() return false because brackets are opposite";
        boolean condition = BalancedBrackets.hasBalancedBrackets("][");
        assertFalse(condition, msg);
    }
    @Test
    public void oddNumberedBracketString() {
        String msg = "balancedBrackets() return false because brackets are odd numbered";
        boolean condition = BalancedBrackets.hasBalancedBrackets("[]][[]");
        assertFalse(condition, msg);
    }
}