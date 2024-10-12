package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SolutionTest {
    @Test
    public void testProductExceptSelf(){
        //TODO Strategy
        // 等价类划分法
        // 1.测试1个元素的数组
        // 2.测试正数数组
        // 3.测试负数数组
        // 4.测试正负数组
        // 5.测试含有0的数组
        int[] test1 = {1};
        int[] expected1 = {1};
        if(Arrays.equals(Solution.productExceptSelf(test1), expected1)) assert true;
        else assert false;

        int[] test2 = {1, 2, 3, 4};
        int[] expected2 = {24, 12, 8, 6};
        if(Arrays.equals(Solution.productExceptSelf(test2), expected2)) assert true;
        else assert false;

        int[] test3 = {-1, -2, -3};
        int[] expected3 = {6, 3, 2};
        if(Arrays.equals(Solution.productExceptSelf(test3), expected3)) assert true;
        else assert false;

        int[] test4 = {-1, 2, -3, 4};
        int[] expected4 = {-24, 12, -8, 6};
        if(Arrays.equals(Solution.productExceptSelf(test4), expected4)) assert true;
        else assert false;

        int[] test5 = {-1, 1, 0, -3, 3};
        int[] expected5 = {0, 0, 9, 0, 0};
        if(Arrays.equals(Solution.productExceptSelf(test5), expected5)) assert true;
        else assert false;
    }
}
