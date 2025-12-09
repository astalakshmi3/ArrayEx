package astalakshmi.example;

import java.sql.Array;
import java.util.*;
public class ArrayExe {
    public static void main(String[] args) {
        System.out.println("Exercise 1");
        exercise1();
        System.out.println("Exercise 2");
        exercise2();
        System.out.println("Exercise 3");
        exercise3();
        System.out.println("Exercise 4");
        exercise4();
        System.out.println("Exercise 5");
        exercise5();
        System.out.println("Exercise 6");
        exercise6();
        System.out.println("Exercise 7");
        exercise7();
        System.out.println("Exercise 8");
        exercise8();
        System.out.println("Exercise 9");
        exercise9();
        System.out.println("Exercise 10");
        exercise10();
        System.out.println("Exercise 11");
        exercise11();
        System.out.println("Exercise 12");
        exercise12();
        System.out.println("Exercise 13");
        exercise13();
        ex();
    }

    // Exercise 1 : Store and print array elements
    static void exercise1() {
        int[] arr = {11, 23, 39};
        System.out.println("Array elements");
        for (int num : arr)  // for each loop and store on num variable
        {
            System.out.println(num + "");
        }
    }

    // Exercise 2 : Find index of a number in array (IndexOf)
    static void exercise2() {
        int[] arr = {1, 3, 5, 7};
        int index = indexof(arr, 5);
        System.out.println("Index position of number 5 is :" + index);
    }

    static int indexof(int[] arr, int value) {  // check every position
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i; // return index when found
            }
        }
        return -1; // not found
    }

    // Exercise 3 : Sort a string array
    static void exercise3() {
        String[] arr = {"Paris", "London", "New Work", "Stockholm"};
        System.out.println("Before sort :" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("After sort :" + Arrays.toString(arr));
    }

    // Exercise 4 : Copy elements into another array
    static void exercise4() {
        int[] first = {1, 15, 20};
        int[] second = new int[first.length];
        for (int i = 0; i < first.length; i++) {
            second[i] = first[i];
        }
        System.out.println("First :" + Arrays.toString(first));
        System.out.println("Second :" + Arrays.toString(second));
    }

    // Exercise 5 : 2D Country-City array
    static void exercise5() {
        String[][] arr = {{"France", "Paris"}, {"Sweden", "Stockholm"}};
//String [][] names = Arrays.stream(arr).spliterator(",");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "   " + arr[i][1]);
        }
    }

    // Exercise 6 : Print average of number
    static void exercise6() {
        int[] arr = {43, 5, 23, 17, 2, 14};
        int sum = 0;
        for (int n : arr)
            sum += n; // sum = sum + n
        double avg = sum / arr.length;
        System.out.println("Average :" + avg);
    }

    // Exercise 7 : Print Odd number only
    static void exercise7() {
        int[] arr = {1, 2, 4, 7, 9, 12};
        System.out.println("Array " + Arrays.toString(arr));
        System.out.println("Odd Number :");
        for (int n : arr) {
            if (n % 2 != 0) {
                System.out.println(+n);
            }
        }
    }

    // Exercise 8 : Remove duplicate values using set
    static void exercise8() {
        int[] arr = {20, 20, 40, 20, 30, 40, 50, 60};
        System.out.println("Array :" + Arrays.toString(arr));
        Set<Integer> set = new LinkedHashSet<>();
        for (int n : arr)
            set.add(n);
        System.out.println("Array without Duplicate values : " + set);
    }

    // Exercise 9 : Expand array by adding element
    static void exercise9() {
        int[] arr = {10, 20, 30};
        System.out.println("Actual Array :" + Arrays.toString(arr));
        arr = addElement(arr, 40);
        System.out.println("Expand Array : " + Arrays.toString(arr));
    }

    static int[] addElement(int[] arr, int value) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++)
            newArr[i] = arr[i];
        newArr[arr.length] = value;
        return newArr;
    }

    // Exercise 10 : Multiplication table stored in 2D array
    static void exercise10() {
        int[][] table = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                table[i][j] = (i + 1) * (j + 1);
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }

    }

    // Exercise 11 : Reverse Array by Swapping
    static void exercise11() {
        int[] arr = {3, 8, 12, 5, 10};
        System.out.println("Actual Array :" + Arrays.toString(arr));
        // Swap Element
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println("Reversed array : " + Arrays.toString(arr));
    }

    // Exercise 12 : Print diagonal element of 2D array
    static void exercise12() {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Diagonal :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][i] + " ");
        }
    }

    // Exercise 13 : Put odd number left side, even number right side.
    static void exercise13() {
        int[] arr = {5, 8, 3, 10, 7, 2, 9, 4};
        int[] result = new int[arr.length];
        int left = 0; // where odd numbers go
        int right = arr.length - 1; // where even numbers go
        for (int n : arr) {
            if (n % 2 != 0) {
                result[left++] = n; //odd
            } else {
                result[right--] = n; //even
            }
        }
        System.out.println("Original : " + Arrays.toString(arr));
        System.out.println("Odd / Even separated : " + Arrays.toString(result));
    }
    public static void ex ()
    {
        int [] arr = {10,20,30};
        int [] newArr = Arrays.copyOf(arr, arr.length + 1);
        int newElement = 5;
        newArr[newArr.length-1] = newElement;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArr));
    }

}
