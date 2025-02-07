package com.example.demo5.TinhHieu;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TinhHieu {
    TinhHieuSevice sevice= new TinhHieuSevice();
    @Test

    public void tinhHieu1() {
        Assert.assertEquals(5, sevice.TinhHieu( 10, 5));
    }
    @Test

    public void tinhHieu2() {
        Assert.assertEquals(6, sevice.TinhHieu( 10, 4));
    }
    @Test

    public void tinhhieu3() {
        Assert.assertEquals(4, sevice.TinhHieu(10,6) );
    }
    @Test

    public void tinhHieu4() {
        Assert.assertEquals(-1, sevice.TinhHieu( 9, 10));
    }
    @Test

    public void tinhHieu5() {
        Assert.assertEquals(0, sevice.TinhHieu( 10, 10));
    }
}
