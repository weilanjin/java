package com.wlj.class_arrayList.array;

import java.util.Arrays;

/**
 * int类型数组的冒泡排序和选择排序
 */
public class IntArrSort {

    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13};
        int[] arr1 = arr.clone();
        int[] cloneArr = arr.clone();

        bubbleSort(arr);
        selectSort(arr1);
        
        System.out.println("------冒泡排序------");
        System.out.println(Arrays.toString(arr));
        System.out.println("------选择排序------");
        System.out.println(Arrays.toString(arr1));

        System.out.println("------对比排序结果------");
        Arrays.sort(cloneArr);
        System.out.println(Arrays.toString(cloneArr));

        selectSort(arr);
    }

    /**
     * 选择排序
     * -->滚雪球<---
     * @param arr
     */
    private static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }
    }

    /**
     * 冒泡排序
     * -->打擂台<----
     * @param arr
     */
    private static void  bubbleSort(int[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) { //升序 -- ">" 降序 --"<"
                    arr[i] = arr[i] + arr[i + 1];
                    arr[i + 1] = arr[i] - arr[i + 1];
                    arr[i] = arr[i] - arr[i + 1];
                }
            }
        }
    }
}
