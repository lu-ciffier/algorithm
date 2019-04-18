package com.lucifer.algorithm;

import java.util.Arrays;

/**
 * Created by Lucifer on 2019/4/18 23:47
 **/
public class BubbleSort {

    private int[] arr;

    public BubbleSort(int[] arr) {
        this.arr = arr;
    }

    public void sort(){
        if (this.arr.length < 2) {
            return;
        }
        for (int i = 0; i < this.arr.length - 1; i++) {
            for (int j = i + 1; j < this.arr.length; j++) {
                if (this.arr[i] > this.arr[j]) {
                    swap(i, j);
                }
            }
        }
    }

    public void swap(int x, int y) {
        int temp = this.arr[x];
        this.arr[x] = this.arr[y];
        this.arr[y] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 4, 5, 8, 6, 5, 9, 2};
        BubbleSort bubbleSort = new BubbleSort(arr);
        bubbleSort.sort();
        System.out.println(Arrays.toString(arr));
    }
}
