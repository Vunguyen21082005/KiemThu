package com.example.demo5.Mang;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Mang {
    MangSevice sevice = new MangSevice();
    @Test
    public void mang1(){
        int[] arr={1,2,3,4,5,6};
        int x=2;
        Assert.assertEquals(1,sevice.Mang(arr,x));
    }
    @Test
    public void mang2(){
        int[] arr={1,2,4,6,8};
        int x=2;
        Assert.assertEquals(1,sevice.Mang(arr,x));
    }
    @Test
    public void mang3(){
        int[] arr={1,2,3,5,7};
        int x=2;
        Assert.assertEquals(1,sevice.Mang(arr,x));
    }
    @Test
    public void mang4(){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int x=2;
        Assert.assertEquals(1,sevice.Mang(arr,x));
    }
}
