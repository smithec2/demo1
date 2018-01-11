package edu.ldsbc;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTest {
    @Test
    public void add() throws Exception {
        Calc calc = new Calc();
        assertEquals(2,calc.add(1,1));

    }

}