package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    @Test
    public void onlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void openingBracketsOnlyReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void doubleOpeningBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }

    @Test
    public void closingBracketsOnlyReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void doubleClosingBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]"));
    }
    @Test
    public void stringsMayContainNonBracketCharacters(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void reversedBracketsReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void doubleOpeningAndOneClosingBracketReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }

    @Test
    public void doubleClosingAndOneOpeningBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }

    @Test
    public void bracketsWithTextReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void reversedBracketWithTextReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]LaunchCode["));
    }

    @Test
    public void middleBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch]Code["));
    }
}
