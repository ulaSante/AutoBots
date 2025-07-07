package com.autobots.java;

public class Array1Codingbat {
    public static void main(String[] args) {


    }

    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        }
        return false;
    }

    public boolean sameFirstLast(int[] nums) {
        if (nums[0] == nums[nums.length - 1]) {
            return true;
        }
        return false;
    }

    public boolean commonEnd(int[] a, int[] b) {
        return (a[0] == b[0] || a[a.length - 1] == b[b.length - 1] ? true : false);
    }

    public int[] rotateLeft3(int[] nums) {
        int[] newNums = new int[3];
        newNums[0] = nums[1];
        newNums[1] = nums[2];
        newNums[2] = nums[0];
        return newNums;
    }

    public int[] maxEnd3(int[] nums) {
        int[] maxNums = new int[3];
        if (nums[0] >= nums[2]) {
            maxNums[0] = nums[0];
            maxNums[1] = nums[0];
            maxNums[2] = nums[0];
            return maxNums;
        } else {
            if (nums[2] >= nums[0]) {
                maxNums[0] = nums[2];
                maxNums[1] = nums[2];
                maxNums[2] = nums[2];
            }
        }
        return maxNums;
    }

    public int sum2(int[] nums) {
        int numss;
        if (nums.length > 1) {
            numss = nums[0] + nums[1];
            return numss;
        } else if (nums.length == 1) {
            return nums[0];
        } else {
            return 0;
        }
    }

    public int[] middleWay(int[] a, int[] b) {
        int[] ab = new int[0];
    }



}


