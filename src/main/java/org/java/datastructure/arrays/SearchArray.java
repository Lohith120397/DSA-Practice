package org.java.datastructure.arrays;

public class SearchArray {
    public static void main(String[] args) {
        /*boolean b = checkIfExist(new int[] {-2,0,10,-19,4,6,-8});
        System.out.println(b);*/
        /*boolean c = validMountainArray(new int[] {2,1});
        System.out.println(c);*/

        int[] res = replaceElements(new int[]{400});
        System.out.println(res[0]);
        int len = removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
        System.out.println(len);
    }


    public static boolean checkIfExist(int[] arr) {
        System.out.println(2*-1);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == 2*arr[j] || arr[j] == 2*arr[i])
                    return true;
            }
        }
        return false;
    }

    public static boolean validMountainArray(int[] arr) {
        int len = arr.length;
        if(arr == null || len < 3)
            return false;
        boolean increasing = arr[1] > arr[0];
        if(!increasing)
            return false;

        for (int i = 1; i < len; i++) {
            if(arr[i] == arr[i-1])
                return false;
            if(increasing)
            {
                if(arr[i] < arr[i-1])
                    increasing = false;
            }
            else
            {
                if(arr[i] > arr[i-1])
                    return false;
            }
        }
        return !increasing;
    }

    public static int[] replaceElements(int[] arr) { //[17,18,5,4,6,1] = [18,6,6,6,1,-1] //[400] = -1

        if(arr.length == 1)
        {
            arr[0] = -1;
            return arr;
        }
        int i = 0;
        for (int j = 1; j < arr.length; j++) {

            for (int k = j+1; k < arr.length ; k++) {
                if(arr[j] < arr[k])
                    j = k;
            }
            arr[i++] = arr[j];
            j = i;
            if(j == arr.length-1)
            {
                arr[j] = -1;
                break;
            }
        }
        return arr;
    }

    public static int removeDuplicates(int[] numbs) { //[0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
        int length = numbs.length;

        for (int i = length-2; i >= 0; i--) {

            if(numbs[i] == numbs[i+1])
            {
                for (int j = i+1; j < length; j++) {
                    numbs[j-1] = numbs[j];
                }
                length--;
            }
        }
        return length;
    }
}

