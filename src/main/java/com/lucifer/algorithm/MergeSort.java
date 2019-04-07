package com.lucifer.algorithm;

import java.util.Arrays;

/**
 * Created by Lucifer on 2019/4/7 19:45
 **/
public class MergeSort {

    private int[] arr;

    public MergeSort(int[] arr) {
        this.arr = arr;
    }

    public void sort(int font, int end) {
        if (font < end) {
            int middle = (font + end) / 2;
            sort(font, middle);
            sort(middle + 1, end);
            merge(font, middle, end);
        }
    }

    private void merge(int font, int middle, int end) {
        if (middle < 1) {
            return;
        }
        int[] left = Arrays.copyOfRange(this.arr, font, middle + 1);
        int[] right = Arrays.copyOfRange(this.arr, middle + 1, end + 1);
        boolean leftLimit = false, rightLimit = false;
        for (int index = font, leftIndex = 0, rightIndex = 0; index <= end; index++) {

            if ((rightLimit || left[leftIndex] < right[rightIndex]) && !leftLimit) {
                this.arr[index] = left[leftIndex];
                leftIndex++;
                if (leftIndex == left.length) {
                    leftLimit = true;
                    leftIndex--;
                }
                continue;
            }
            this.arr[index] = right[rightIndex];
            rightIndex++;
            if (rightIndex == right.length) {
                rightLimit = true;
                rightIndex--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 4, 8, 6, 5, 9, 2};
        MergeSort mergeSort = new MergeSort(arr);
        mergeSort.sort(0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
