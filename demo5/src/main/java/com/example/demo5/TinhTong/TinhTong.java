package com.example.demo5.TinhTong;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TinhTong {
TinhTongSevice sevice= new TinhTongSevice();
@Test

    public void tinhTong1() {
    Assert.assertEquals(15, sevice.TinhTong( 5, 10));
    }
    @Test

    public void tinhTong2() {
        Assert.assertEquals(14, sevice.TinhTong( 4, 10));
    }
    @Test

    public void tinhTong3() {
        Assert.assertEquals(16, sevice.TinhTong( 6, 10));
    }
    @Test

    public void tinhTong4() {
        Assert.assertEquals(19, sevice.TinhTong( 9, 10));
    }
    @Test

    public void tinhTong5() {
        Assert.assertEquals(20, sevice.TinhTong( 10, 10));
    }



}
