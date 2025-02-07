package com.example.demo5.Mang;

public class MangSevice {
    public static int Mang(int [] arr,int x ){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
      return -1;
    }
}
