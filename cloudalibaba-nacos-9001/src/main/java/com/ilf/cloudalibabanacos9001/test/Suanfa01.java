package com.ilf.cloudalibabanacos9001.test;

/**
 * @program: SpringCloudAlibabaMSB
 * @description: 算法联系课01
 * @author: carl.zhang
 * @create: 2022-05-27  20:53
 **/
public class Suanfa01 {

    //region 阶乘加和

    /**
     * 计算N 的阶乘  。 N! = 1 + （1*2）+ （1*2*3）。。。（1*2*3*4.。。*N）
     *
     * @param n
     * @return
     */
    public static int jieCheng(int n) {
        int total = 0;
        int part = 1;
        for (int i = 1; i <= n; i++) {
            part = part * i;
            total += part;
        }
        return total;
    }
//endregion

    //region 选择排序
    public static void xuanZePaiXu(int[] source) {
        if (source == null || source.length < 2) {
            return;
        }
        for (int i = 0; i < source.length; i++) {
            int minIndex = i;
            for (int q = i + 1; q < source.length; q++) {
                minIndex = source[minIndex] > source[q] ? q : minIndex;

                /*if (source[minIndex] > source[q]) {
                    minIndex = q;
                }*/
            }
            swap(source, i, minIndex);
        }
    }


    //endregion


    //region 冒泡排序
    public static void maoPaoPaiXu(int[] source) {
        if (source == null || source.length < 2) {
            return;
        }
        for (int i = 0; i < source.length; i++) {
            for (int q = i; q < source.length; q++) {
                if (source[i] > source[q]) {
                    swap(source, i, q);
                    /*int t = source[i];
                    source[i] = source[q];
                    source[q] = t;*/
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "   ");
        }
        System.out.println("");
    }

    //endregion

    //region 插入排序

    public static void chaRuPaiXu(int[] source) {
        if (source == null || source.length < 2) {
            return;
        }
        //写法1
        /*for (int i = 1; i < source.length; i++) {
            for (int m = i; m > 0; m--) {
                if (source[m] < source[m - 1]) {
                    swap(source, m, m - 1);
                } else {
                    continue;
                }
            }
        }*/
        //写法2
        for (int i = 1; i < source.length; i++) {
            int end = i;
            for (int pre = end - 1; pre >= 0 && source[pre + 1] < source[pre]; pre--) {
                swap(source, pre + 1, pre);
            }
        }


    }


    //endregion

    //交换
    public static void swap(int[] arr, int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }


    public static void main(String[] args) {
        //计算阶乘 加和
        System.out.println(jieCheng(3));


        //冒泡排序
        int[] a = {2, 15, 3, 8, 6, 1, 7, 17, 9, 5, 10, 12, 4, 13, 16, 14, 11};


        //选择排序
        xuanZePaiXu(a);
        printArray(a);



      /*  maoPaoPaiXu(a);
        printArray(a);*/

        //选择排序
        /*chaRuPaiXu(a);
        printArray(a);
*/
    }
}
