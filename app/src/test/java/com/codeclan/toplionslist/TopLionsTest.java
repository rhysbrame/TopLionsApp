package com.codeclan.toplionslist;

import org.junit.Test;
import static org.junit.Assert.*;


public class TopLionsTest {

    @Test
    public void getListTest() {
        TopLions topLions = new TopLions();
        assertEquals(20, topLions.getList().size());
    }
}