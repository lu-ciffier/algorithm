package com.lucifer.algorithm;

import java.util.Arrays;

/**
 * Created by Lucifer on 2019/4/7 13:41
 **/
public class QuickSort {

    private int[] arr;

    public QuickSort(int[] arr) {
        this.arr = arr;
    }

    public void sort(int start, int end) {
        if (start < end) {
            int pivot = partition(start, end);
            sort(start, pivot - 1);
            sort(pivot + 1, end);
        }
    }

    private int partition(int font, int end) {
        int pivot = end;
        for (int i = font; i < end; i++) {
            if (this.arr[i] > this.arr[pivot]) {
                swap(i, pivot);
            }
        }
        return pivot;
    }

    private void swap(int x, int y) {
        int temp = this.arr[x];
        this.arr[x] = this.arr[y];
        this.arr[y] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 4, 8, 6, 5, 9, 2};
        QuickSort quickSort = new QuickSort(arr);
        quickSort.sort(0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
