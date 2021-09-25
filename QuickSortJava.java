package com.company.QuickSortJava;

class QuickSort{

    //consider pivot, place it in position, left less than pivot, right greater than pivot

    int partition(int[] arr, int start, int end)
    {
        int pivot = arr[end];
        int i = (start-1);

        for(int j = start; j<=end; j++)
        {
            //if current element is smaller than pivot
            if(arr[j] < pivot)
            {
                i++;
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        int t = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = t;
        return(i+1);
    }

    void quickSort(int[] arr, int start, int end)
    {
        if(start < end)
        {
            int p = partition(arr, start, end);
            quickSort(arr, start, p-1);
            quickSort(arr, p+1, end);
        }
    }

    void printArray(int[] a)
    {
        for(int i : a)
            System.out.print(i+ " ");
        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {
        int a[] = { 5, 10, 3, 20, 6, 30 };
        QuickSort mySort = new QuickSort();
        mySort.quickSort(a, 0, a.length-1);
        mySort.printArray(a);
    }

}
