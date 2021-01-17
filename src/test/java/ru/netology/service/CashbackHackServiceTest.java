package ru.netology.service;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void shouldReturn1000for0() {
        assertEquals(1000, service.remain(0));
    }

    @org.junit.Test
    public void shouldReturn100for900() {
        assertEquals(900, service.remain(100));
    }

    @org.junit.Test
    public void shouldReturn50for950() {

        assertEquals(950, service.remain(50));
    }

    @org.junit.Test
    public void shouldReturn0For1000() {

        assertEquals(0, service.remain(1000));
    }

    @org.junit.Test
    public void shouldReturn995For5() {

        assertEquals(995, service.remain(5));
    }
}