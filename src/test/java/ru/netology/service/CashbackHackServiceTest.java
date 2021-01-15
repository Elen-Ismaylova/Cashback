package ru.netology.service;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void shouldReturn1000for0() {
        assertEquals(service.remain (0),1000);
    }

    @org.junit.Test
    public void shouldReturn100for900() {
        assertEquals(service.remain(100),900);
    }

    @org.junit.Test
    public void shouldReturn50for950() {
        assertEquals(service.remain(50),950);
    }

    @org.junit.Test
    public void shouldReturn0For1000() {
        assertEquals(service.remain(1000), 0);
    }

    @org.junit.Test
    public void shouldReturn995For5() {
        assertEquals(service.remain(5), 995);
    }
}