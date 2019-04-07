package com.lucifer.algorithm;

import java.util.Arrays;

/**
 * Created by Lucifer on 2019/4/7 14:03
 **/
public class HeapSort {

    private int[] arr;
    private int size;
    private static final int root = 0;

    public HeapSort(int[] arr) {
        this.arr = arr;
        this.size = arr.length;
    }

    public void sort() {
        buildMaxHeap();
        for (int i = this.size - 1; i > 0; i--) {
            swap(i, root);
            this.size--;
            maxHeapify(root);
        }
        this.size = this.arr.length;
    }

    public void buildMaxHeap() {
        for (int index = parent(this.size - 1); index >= 0; index--) {
            maxHeapify(index);
        }
    }

    private void maxHeapify(int index) {
        int left = left(index);
        int right = right(index);
        int max = index;
        if (left <= this.size - 1 && this.arr[left] > this.arr[max]) {
            max = left;
        }
        if (right <= this.size - 1 && this.arr[right] > this.arr[max]) {
            max = right;
        }
        if (max != index) {
            swap(max, index);
            maxHeapify(max);
        }
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int left(int index) {
        return index * 2 + 1;
    }

    private int right(int index) {
        return index * 2 + 2;
    }

    private void swap(int x, int y) {
        int temp = this.arr[x];
        this.arr[x] = this.arr[y];
        this.arr[y] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 4, 8, 6, 5, 9, 2};
        HeapSort heapSort = new HeapSort(arr);
        heapSort.sort();
        System.out.println(Arrays.toString(arr));
    }
}
