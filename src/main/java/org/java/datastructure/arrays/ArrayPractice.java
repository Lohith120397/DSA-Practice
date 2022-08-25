package org.java.datastructure.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
//        LeetCodeArray.duplicateZeros(new int[]{1,0,2,3,0,4,5,0});
//        LeetCodeArray.merge(new int[]{1}, 1 ,new int[]{}, 0);
//        LeetCodeArray.removeElement(new int[]{3,2,2,3}, 3);
        LeetCodeArray.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
        /*int a = LeetCodeArray.fac(5);
        System.out.println(a);
        int b = LeetCodeArray.sub(5);
        System.out.println(b);
        int fi = LeetCodeArray.fib(5);
        System.out.println("fib of 5 is: " + fi);*/

       /* int search = LeetCodeArray.binSearch(new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110}, 120, 0, 10);
        System.out.println(search);*/

    }
}

class LeetCodeArray
{
    public static int findMaxConsecutiveOnes(int[] nums) { // [1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1]

        int count = 0;
        int totalCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1)
            {
                count++;
                if(totalCount < count)
                {
                    totalCount = count;
                }
            }
            else
                count = 0;


        }
        return totalCount;
    }

    public static int findNumbers(int[] nums) {
        int result = 0;
        for (int n: nums) {
            /*int count = 0;
            while(n > 0)
            {
                n = n/10;
                count++;
            }
            if(count%2 == 0)
                result++;*/
            if(Math.floor(Math.log10(n) + 1) % 2 == 0)
                result++;
        }
        return result;
    }

    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        for (int i=0; i<nums.length; i++) {
            result[i] = (int) Math.pow(nums[i], 2);
        }
        Arrays.sort(result);

        return result;
    }

    //Function to find a continuous sub-array which adds up to a given number.
    /*static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        ArrayList<Integer> arrList = new ArrayList<>();

        for (int i = 0; i<n; i++)
        {
            int sum = arr[i];
            arrList.add(i+1);
            for (int j = i+1; j <n ; j++) {
                sum += arr[j];
                if(sum == s)
                {
                    arrList.add(j+1);
                    return arrList;
                }
                else if(sum > s)
                {
                    arrList.clear();
                    break;
                }
            }
            if (i+1 == n && sum==s)
            {
                arrList.add(i+1);
                return arrList;
            }
            else
            {
                arrList.clear();
            }
        }
        arrList.add(-1);
        return arrList;
    }*/

    public static void duplicateZeros(int[] arr) { //[1,0,2,3,0,4,5,0]

        int[] result = new int[arr.length];
        int i = 0;
        for (int a : arr) {
            /*if(arr[i] == 0)
            {
                for (int j = arr.length-1; j > i ; j--) {
                    arr[j] = arr[j-1];
                }
                i++;
            }
        }
        for (int a: arr
             ) {
            System.out.println(a);
        }*/
            if(i == result.length )
                break;

            result[i++] = a;
            if(a == 0 && i < arr.length)
                result[i++] = a;
        }
        for (int r: result
             ) {
            System.out.println(r);
        }
        System.arraycopy(result, 0 , arr, 0, arr.length);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = 0;
        for (int i = m; i < m+n; i++) {
            nums1[i] = nums2[k];
            k++;
        }
        Arrays.sort(nums1);
        for (int a: nums1
             ) {
            System.out.println(a);
        }
    }

    /*public static int removeElement(int[] nums, int val) //[2,1,3,0,3,5,7,3,1,4], val = 3
    {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }*/

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static int removeDuplicates(int[] nums) { //[0,0,1,1,1,2,2,3,3,4] = [0,1,2,3,4]
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if(nums[i] != nums[j])
            {
                nums[++i] = nums[j];
            }
        }
        return i+1;
    }

    static int fac(int a)
    {
        if(a == 0)
        {
            return 1;
        }
        return a * fac(a-1);
    }

    static int sub(int a)
    {
        System.out.println("Value of a is: " + a);
        if(a == 0)
        {
            return a;
        }
        return sub(--a);
    }

    static int fib(int n) //1, 2
    {
        if(n<0)
            return -1;
        else if( (n==1) || (n ==2) )
            return n-1;
        else
            return fib(n-1) + fib(n-2);
    }

    static int binSearch(int[] a, int searchValue, int start, int end)
    {
        int mid = (start + end) / 2;
        if(start == end)
        {
            if (a[start] == searchValue)
                return start;
            else
                return -1;
        }

        else if(a[mid] == searchValue)
            return mid;
        else if(a[mid] < searchValue)
        {
            start = mid + 1;
            return binSearch(a, searchValue, start, end);
        }
        else  if(a[mid] > searchValue)
        {
            end = mid - 1;
            return binSearch(a, searchValue, start, end);
        }
        return -1;
    }
}

