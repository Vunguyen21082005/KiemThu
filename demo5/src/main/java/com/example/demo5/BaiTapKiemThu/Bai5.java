package com.example.demo5.BaiTapKiemThu;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Bai5 {

    private String name;

    public Bai5(String name) {
        this.name = name;
    }

    public String getName() {
        if (name == null) {
            throw new NullPointerException("Tên người dùng không tồn tại!");
        }
        return name;
    }

    @Test
    void testGetNameWithValidProfile() {
        Bai5 profile = new Bai5("Nguyen Van A");
        Assert.assertEquals("Nguyen Van A", profile.getName());
    }

    @Test
    void testGetNameWithNullName() {
       Bai5 profile = new Bai5(null);
        Exception exception = Assert.expectThrows(NullPointerException.class, profile::getName);
        Assert.assertEquals("Tên người dùng không tồn tại!", exception.getMessage());
    }

    @Test
    void testGetNameWithNullProfile() {
        Bai5 profile = null;
        Assert.assertThrows(NullPointerException.class, () -> {
            if (profile == null) {
                throw new NullPointerException("Hồ sơ không tồn tại!");
            }
            profile.getName();
        });
    }
}
