package com.example.demo5.BaiTapKiemThu;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Bai4 {
    public int getElementAtIndex(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Chỉ mục nằm ngoài phạm vi của mảng!");
        }
        return array[index];
    }
    @Test
    void testGetElementValidIndex() {
        int[] array = {1, 2, 3, 4, 5};
        Assert.assertEquals(3, getElementAtIndex(array, 2));
    }

    @Test
    void testGetElementAtNegativeIndex() {
        int[] array = {1, 2, 3, 4, 5};
        Exception exception = Assert.expectThrows(IndexOutOfBoundsException.class,
                () -> getElementAtIndex(array, -1));
        Assert.assertEquals(" nằm ngoài phạm vi của mảng!", exception.getMessage());
    }

    @Test
    void testGetElementAtOutOfBoundIndex() {
        int[] array = {1, 2, 3, 4, 5};
        Exception exception = Assert.expectThrows(IndexOutOfBoundsException.class,
                () -> getElementAtIndex(array, 5));
        Assert.assertEquals(" nằm ngoài phạm vi của mảng!", exception.getMessage());
    }

    @Test
    void testGetElementAtLastIndex() {
        int[] array = {10, 20, 30, 40, 50};
        Assert.assertEquals(50, getElementAtIndex(array, 4));
    }
}
