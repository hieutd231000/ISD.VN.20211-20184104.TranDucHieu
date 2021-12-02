package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Main placeOrder_UnitTest;
    @BeforeEach
    void setUp() {
        placeOrder_UnitTest = new Main();
    }

    @Test
    void validateName() {
        assertEquals(false, placeOrder_UnitTest.validateName("1az"));
        assertEquals(false, placeOrder_UnitTest.validateName(""));
        assertEquals(true, placeOrder_UnitTest.validateName("Camp-Bel"));
        assertEquals(false, placeOrder_UnitTest.validateName("Camp--Bel"));
        assertEquals(true, placeOrder_UnitTest.validateName("Tran Duc Hieu"));
    }

    @Test
    void validatePhoneNumber() {
        assertEquals(false, placeOrder_UnitTest.validatePhoneNumber("1234567890"));
        assertEquals(false, placeOrder_UnitTest.validatePhoneNumber("012345678"));
        assertEquals(true,placeOrder_UnitTest.validatePhoneNumber("0123456789"));
    }

    @Test
    void validateAddress() {
        assertEquals(true, placeOrder_UnitTest.validateAddress("Mao Khe"));
        assertEquals(false, placeOrder_UnitTest.validateAddress(""));
        assertEquals(false, placeOrder_UnitTest.validateAddress("1Ha Noi"));
    }

    @Test
    void validateTime() {
        assertEquals(true, placeOrder_UnitTest.validateTime("12/22/2021 18:30"));
        assertEquals(false, placeOrder_UnitTest.validateTime("12/32/2021 18:30"));
        assertEquals(false, placeOrder_UnitTest.validateTime("11/31/2021 18:30"));
        assertEquals(false, placeOrder_UnitTest.validateTime("10/31/2021 24:30"));
        assertEquals(false, placeOrder_UnitTest.validateTime("12/22/2020 18:30"));
        assertEquals(false, placeOrder_UnitTest.validateTime(""));
        assertEquals(false, placeOrder_UnitTest.validateTime("1Ha Noi"));
    }
}