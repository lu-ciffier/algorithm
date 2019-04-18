package com.lucifer.algorithm;

import java.util.Arrays;

/**
 * Created by Lucifer on 2019/4/19 0:08
 **/
public class ShellSort {

    private int[] arr;

    public ShellSort(int[] arr) {
        this.arr = arr;
    }

    public void sort(int size) {
        int interval = size / 2;
        if (interval < 1) {
            return;
        }
        for (int i = 0; i < this.arr.length - interval; i++) {
            if (this.arr[i] < this.arr[i + interval]) {
                swap(i, i + interval);
            }
        }
        sort(interval);
    }

    public void swap(int x, int y) {
        int temp = this.arr[x];
        this.arr[x] = this.arr[y];
        this.arr[y] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 4, 5, 8, 6, 5, 9, 2};
        ShellSort shellSort = new ShellSort(arr);
        shellSort.sort(arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
