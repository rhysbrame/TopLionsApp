package com.codeclan.toplionslist;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class LionsTest {

    Lion lion;

    @Before
    public void before() {
        lion = new Lion(1, "Jeremy Guscot", 1985);
    }

    @Test
    public void getPositionTest() {
        assertEquals((Integer)1, lion.getPlayerPosition());

    }

    @Test
    public void getNameTest() {
        assertEquals("Jeremy Guscot", lion.getName());

    }

    @Test
    public void getYearTest() {
        assertEquals((Integer)1985, lion.getYear());

    }
}