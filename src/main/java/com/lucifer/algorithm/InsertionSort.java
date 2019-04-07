package com.lucifer.algorithm;

import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by Lucifer on 2019/4/7 13:08
 **/
@Component
public class InsertionSort {

    private int[] arr;

    public InsertionSort(int[] arr) {
        this.arr = arr;
    }

    public void sort() {
        for (int i = 1; i < this.arr.length; i++) {
            int key = this.arr[i];
            int index = i - 1;
            while (index >= 0 && key < this.arr[index]) {
                this.arr[index + 1] = this.arr[index];
                index--;
            }
            this.arr[index + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 4, 8, 6, 5, 9, 2};
        InsertionSort insertionSort = new InsertionSort(arr);
        insertionSort.sort();
        System.out.println(Arrays.toString(arr));
    }
}
