package com.example.demo5.TinhTich;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TinhTich {
    TinhTichSevice sevice= new TinhTichSevice();
    @Test

    public void tinhTich1() {
        Assert.assertEquals(50, sevice.TinhTich( 5, 10));
    }
    @Test

    public void tinhTich2() {
        Assert.assertEquals(500, sevice.TinhTich( 50, 10));
    }
    @Test

    public void tinhTich3() {
        Assert.assertEquals(0, sevice.TinhTich( 0, 10));
    }
    @Test

    public void tinhTich4() {
        Assert.assertEquals(20, sevice.TinhTich( 2, 10));
    }
    @Test

    public void tinhTich5() {
        Assert.assertEquals(30, sevice.TinhTich( 3, 10));
    }


}
