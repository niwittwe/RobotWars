package com.btc.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BattlefieldTest {

    @Test
    void isValidField() {
        Battlefield battlefield = new Battlefield(15, 10);
        assertTrue(battlefield.isValidField(1, 1));
        assertTrue(battlefield.isValidField(1, 10));
        assertTrue(battlefield.isValidField(15, 10));
        assertTrue(battlefield.isValidField(15, 1));

        assertFalse(battlefield.isValidField(0, 1));
        assertFalse(battlefield.isValidField(0, 10));
        assertFalse(battlefield.isValidField(1, 0));
        assertFalse(battlefield.isValidField(15, 0));
    }

    @Test
    public void canSetAndGetFields() {
        Battlefield battlefield = new Battlefield(15, 10);

        battlefield.setField(1, 1, 'x');
        assertEquals('x', battlefield.getField(1, 1));

        battlefield.setField(15, 10, 'x');
        assertEquals('x', battlefield.getField(15, 10));
    }
}