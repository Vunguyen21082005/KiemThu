package com.example.demo5.BaiTapKiemThu;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Bai3 {

    public double tinhTrungBinhCong(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new ArithmeticException("Danh sách trống! Không thể chia cho 0.");
        }

        int tong = numbers.stream().mapToInt(Integer::intValue).sum();
        return (double) tong / numbers.size();
    }
    @Test
    void tinhTrungBinhDanhSachHopLe() {
        List<Integer> numbers = Arrays.asList(4, 5, 6, 7, 8);
        Assert.assertEquals(6.0, tinhTrungBinhCong(numbers));
    }

    @Test
    void tinhTrungBinhMotPhanTu() {
        List<Integer> numbers = Arrays.asList(10);
        Assert.assertEquals(10.0, tinhTrungBinhCong(numbers));
    }

    @Test
    void tinhTrungBinhDanhSachAmDuong() {
        List<Integer> numbers = Arrays.asList(-10, 20, -5, 15);
        Assert.assertEquals(5.0,tinhTrungBinhCong(numbers));
    }

    @Test
    void tinhTrungBinhDanhSachRong() {
        List<Integer> numbers = Collections.emptyList();
        Exception exception = Assert.expectThrows(ArithmeticException.class, () -> tinhTrungBinhCong(numbers));
        Assert.assertEquals("Danh sách trống! Không thể chia cho 0.", exception.getMessage());
    }

    @Test
    void tinhTrungBinhDanhSachNull() {
        Exception exception = Assert.expectThrows(ArithmeticException.class, () -> tinhTrungBinhCong(null));
        Assert.assertEquals("Danh sách trống! Không thể chia cho 0.", exception.getMessage());
    }
}
