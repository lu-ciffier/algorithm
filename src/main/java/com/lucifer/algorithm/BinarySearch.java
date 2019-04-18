package com.lucifer.algorithm;

/**
 * Created by Lucifer on 2019/4/18 23:36
 **/
public class BinarySearch {

    private int[] arr;

    public BinarySearch(int[] arr) {
        this.arr = arr;
    }

    public int search(int key) {
        int left = 0;
        int right = this.arr.length - 1;
        int middle;
        while (left < right) {
            middle = (left + right) / 2;
            if (this.arr[middle] == key) {
                return middle;
            }
            if (key > this.arr[middle]) {
                left = middle + 1;
                continue;
            }
            if (key < this.arr[middle]) {
                right = middle - 1;
                continue;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 4, 8, 6, 5, 9, 2};
        BinarySearch binarySearch = new BinarySearch(arr);
        System.out.println(binarySearch.search(0));
    }
}
