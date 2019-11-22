package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void closedBracketStart() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]dsfasdf["));
    }
    @Test
    public void openBracketEnding() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[dsfasdf["));
    }
    @Test
    public void extraOpenBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[dsf[asdf]"));
    }
    @Test
    public void extraClosedBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[dsfas]df]"));
    }
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void onlyOpenBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }
    @Test
    public void onlyClosedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]"));
    }
    @Test
    public void multipleBracketPairs() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[aString]]"));
    }
    @Test
    public void bracketsInBetweenWords() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("a[String]"));
    }
    @Test
    public void oneClosedBracketOnString() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("a]String"));
    }
    @Test
    public void oneOpenBracketOnString() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("a[String"));
    }
    @Test
    public void bracketsBeforeAWord() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]aString"));
    }
}
