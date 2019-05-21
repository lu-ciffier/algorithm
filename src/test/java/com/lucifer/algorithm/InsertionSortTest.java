package com.lucifer.algorithm;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.PostConstruct;
import java.util.Arrays;

/**
 * Created by Lucifer on 2019/4/24 23:16
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = InsertionSort.class)
public class InsertionSortTest {

    public InsertionSortTest() {
        System.out.println("Construct method");
    }

    @Autowired
    private InsertionSort insertionSort;

    @PostConstruct
    public void init() {
        System.out.println("Post construct method");
    }

    @Test
    public void sort() {
        int[] arr = {1, 3, 7, 4, 8, 6, 5, 9, 2};
        insertionSort = new InsertionSort(arr);
        insertionSort.sort();
        System.out.println(Arrays.toString(arr));
    }
}