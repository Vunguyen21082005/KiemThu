package com.example.demo5.TinhTBC;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TBC {
    TBCSevice sevice= new TBCSevice();
    @Test

    public void tinhTBC1() {
        Assert.assertEquals(7, sevice.TinhTBC( 4, 10));
    }
    @Test

    public void tinhTBC2() {
        Assert.assertEquals(8, sevice.TinhTBC( 6, 10));
    }
    @Test

    public void tinhTBC3() {
        Assert.assertEquals(9, sevice.TinhTBC( 8, 10));
    }
    @Test

    public void tinhTBC4() {
        Assert.assertEquals(10, sevice.TinhTBC( 10, 10));
    }
    @Test

    public void tinhTBC5() {
        Assert.assertEquals(7, sevice.TinhTBC( 4, 10));
    }



}
