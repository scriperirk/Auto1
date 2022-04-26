package ru.netology.unit;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void dontGetToTheDiscount() {
        int actual = service.remain(750);
        int expect = 250;

        assertEquals(expect, actual);
    }

    @Test
    public void withoutDiscount() {
        int actual = service.remain(1000);
        int expect = 0;

        assertEquals(expect, actual);
    }

    @Test
    public void higherDiscount() {
        int actual = service.remain(7700);
        int expect = 300;

        assertEquals(expect, actual);
    }

    @Test
    public void zeroDiscount() {
        int actual = service.remain(0);
        int expect = 0;

        assertEquals(expect, actual);
    }

}