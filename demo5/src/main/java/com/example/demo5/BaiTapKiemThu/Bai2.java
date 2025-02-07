package com.example.demo5.BaiTapKiemThu;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Bai2 {
    public int chia(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Không thể chia cho 0");
        }
        return a / b;
    }

    @Test
    void chiaSoDuong() {
        Assert.assertEquals(8, chia(16, 2));
    }

    @Test
    void chiaSoAm() {
        Assert.assertEquals(-9, chia(-6, -3));
    }

    @Test
    void chiaSoDuongChoSoAm() {
        Assert.assertEquals(-4, chia(12, -3));
    }

    @Test
    void chiaSoAmChoSoDuong() {
        Assert.assertEquals(-5, chia(-10, 2));
    }

    @Test
    void chiaSoKhongChoSoDuong() {
        Assert.assertEquals(0, chia(0, 5));
    }

    @Test
    void chiaSoKhongChoSoAm() {
        Assert.assertEquals(0, chia(0, -7));
    }

    @Test
    void chiaMaxInteger() {
        Assert.assertEquals(1, chia(Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    @Test
    void chiaMinInteger() {
        Assert.assertEquals(1, chia(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    @Test
    void chiaChoKhong() {
        Exception exception = Assert.expectThrows(ArithmeticException.class, () -> chia(5, 0));
        Assert.assertEquals("Không thể chia cho 0", exception.getMessage());
    }

    @Test
    void chiaMaxMin() {
        Assert.assertEquals(0, chia(Integer.MAX_VALUE, Integer.MIN_VALUE));
    }
}
