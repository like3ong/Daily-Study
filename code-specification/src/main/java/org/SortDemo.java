package org;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * @Author like3ong
 * @Date 2022/1/5 0:07
 **/
public class SortDemo {
    public static void main(String[] args) {

        Random random = new Random();
        // 创建一个数组为5的int[]
        int[] numbers = new int[5];
        // 循环添加
        for (int i = 0; i < numbers.length; i++) {
            int anInt = random.nextInt(10000);
            numbers[i] = anInt;
        }
        Arrays.sort(numbers);


    }
}
