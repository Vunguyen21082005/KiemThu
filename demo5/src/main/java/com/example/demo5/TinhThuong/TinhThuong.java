package com.example.demo5.TinhThuong;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TinhThuong {
    TinhThuongSevice sevice= new TinhThuongSevice();
    @Test

    public void tinhThuong1() {
        Assert.assertEquals(5, sevice.TinhThuong( 50, 10));
    }
}
