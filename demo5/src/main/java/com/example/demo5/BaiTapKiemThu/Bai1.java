package com.example.demo5.BaiTapKiemThu;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Bai1 {
    public int multiply(int a, int b) {
        return a * b;
    }


    public boolean kiemtrasonguyen(Object input) {
        return input instanceof Integer;
    }

    @Test
    void testValidPositiveNumbers() {

        Assert.assertEquals(72, multiply(8, 9));
    }

    @Test
    void testValidNegativeNumbers() {

        Assert.assertEquals(72, multiply(-8, -9));
    }

    @Test
    void testPositiveAndNegativeNumbers() {
        Assert.assertEquals(-72, multiply(8, -9));
    }

    @Test
    void testZeroAndPositiveNumber() {

        Assert.assertEquals(0, multiply(0, 8));
    }

    @Test
    void testZeroAndNegativeNumber() {
        Assert.assertEquals(0, multiply(0, -9));
    }

    @Test
    void testMaxIntegerValue() {
        Assert.assertEquals((long) Integer.MAX_VALUE * 1, (long) multiply(Integer.MAX_VALUE, 1));
    }

    @Test
    void testMinIntegerValue() {
        Assert.assertEquals((long) Integer.MIN_VALUE * 1, (long) multiply(Integer.MIN_VALUE, 1));
    }

    @Test
    void testNonIntegerInput1() {
        Assert.assertFalse(kiemtrasonguyen("vu"));
    }

    @Test
    void testNonIntegerInput2() {
        Assert.assertFalse(kiemtrasonguyen(3.5));
    }

    @Test
    void testValidIntegerInput() {
        Assert.assertTrue(kiemtrasonguyen(10));
    }
}
