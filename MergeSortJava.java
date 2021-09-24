package com.company.MergeSortJava;

import java.util.Scanner;

class MergeSort {

    void merge(int[] arr, int beg, int mid, int end)
    {
        //calculate size for left and right halves
        int l = mid - beg + 1;
        int r = end - mid;

        //create two subarrays to store values
        int leftSubArray[] = new int[l];
        int rightSubArray[] = new int[r];

        //copy elements from main array to left subarray
        for(int i=0; i<l; i++)
            leftSubArray[i] = arr[beg+i];

        //copy elements from main array to right subarray
        for(int j=0; j<r; j++)
            rightSubArray[j] = arr[mid+1+j];

        //sorting
        int i = 0, j=0;
        int k = beg;
        //compare and add values to the main array in ascending
        while(i<l && j<r)
        {
            if(leftSubArray[i] <= rightSubArray[j])
            {
                arr[k] = leftSubArray[i];
                i++;
            }
            else
            {
                arr[k] = rightSubArray[j];
                j++;
            }
            k++;
        }
        //add remaining elements from the left subarray
        while(i<l)
        {
            arr[k] = leftSubArray[i];
            i++;
            k++;
        }
        //add remaining elements from the right subarray
        while(j<r)
        {
            arr[k] = rightSubArray[j];
            j++;
            k++;
        }
    }

    void sort(int[] arr, int beg, int end)
    {
        if(beg<end)
        {
            int mid = (beg+end)/2;
            sort(arr, beg, mid);
            sort(arr, mid+1, end);
            merge(arr, beg, mid, end);
        }
    }

    void printArray(int[] arr)
    {
        for(int i : arr)
            System.out.print(i+ " ");
        System.out.println();
    }

}

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int size = input.nextInt();
        System.out.println("Enter "+size+" values : ");
        int[] myArray = new int[size];
        for(int i=0;i<size;i++)
            myArray[i] = input.nextInt();

        MergeSort mySort = new MergeSort();
        mySort.sort(myArray, 0, myArray.length-1);

        mySort.printArray(myArray);
    }
}

//1. Read n
//2. Get array values
//3. Print function
//4. Merge sort
//  - Divide
//  - Conquer
//  - Combine

