//Delete an element from a given index in an array

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      int size = input.nextInt();
      int[] myArray = new int[size];
      for(int i = 0; i<size;i++)
        myArray[i] = input.nextInt();
      int deleteIndex = input.nextInt();
      
  
      for(int j=deleteIndex; j<myArray.length-1;j++)
      {
         myArray[j] = myArray[j+1];
      }
    
      
      for(int i = 0; i<myArray.length-1;i++)
      {
          System.out.print(myArray[i]+" ");
      }
    }
}


//Find the first two maximum elements in an array

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      int size = input.nextInt();
      int[] myArray = new int[size];
      for(int i = 0; i<size;i++)
        myArray[i] = input.nextInt();
      int max1 = myArray[0], max2 = myArray[0], indexMax1 = 0;
      for(int i=0;i<myArray.length;i++)
      {
          if(myArray[i] > max1)
          {
            max2 = max1;
            max1 = myArray[i];
          }
          else if(myArray[i]>max2 && max2<max1){
              max2 = myArray[i];
          }
      }
      System.out.println("Max 1 : " +max1+" and Max 2 : "+max2)     ;
    }
}


//Print the first repeated number in an array

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      int size = input.nextInt();
      int[] myArray = new int[size];
      for(int i = 0; i<size;i++)
        myArray[i] = input.nextInt();
      
      for(int i=0;i<myArray.length;i++)
      {
          for(int j=i+1;j<myArray.length;j++)
          {
              if(myArray[i] == myArray[j])
              {
                  System.out.println(myArray[i] + " is the first repeating number!");
                  break;
              }
          }
      }
      
    }
}


//Rotating an array k times

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      int size = input.nextInt();
      int[] myArray = new int[size];
      for(int i = 0; i<size;i++)
        myArray[i] = input.nextInt();
      int rotate = input.nextInt();
      
      for(int i=0;i<rotate;i++)
      {
          int temp = myArray[myArray.length-1];
          for(int j=myArray.length-2;j>=0;j--)
          {
              myArray[j+1]=myArray[j];
          }
          myArray[0]=temp;
      }
      
      for(int i=0;i<myArray.length;i++)
        System.out.print(myArray[i]+" ");
    }
}


//Merge two sorted arrays
import java.util.*;

public class Source {
    public static void main(String []args) {
        Scanner s = new Scanner(System.in);
        int size1 = s.nextInt();
        int[] arr1 = new int[size1];
        for(int i = 0; i < size1; i++){
            arr1[i] = s.nextInt();
        }
        int size2 = s.nextInt();
        int[] arr2 = new int[size2];
        for(int i = 0; i < size2; i++){
            arr2[i] = s.nextInt();
        }
        mergeSortedArrays(arr1, arr2);
    }
  public static void mergeSortedArrays(int arr1[], int arr2[]) { 
        int[] arr3 = new int[arr1.length + arr2.length];
        for(int i = 0; i<arr1.length; i++)
        {
            arr3[i] = arr1[i];
        }
        //arr1=4, arr2=5
        for(int i = arr1.length, j=0; i<(arr1.length + arr2.length); i++,j++)
        {
            arr3[i] = arr2[j];
        }
        
        bubbleSort(arr3);
        // for(int i : arr3)
        //     System.out.print(i+" ");
        removeDuplicates(arr3);
  } 
  
  public static void bubbleSort(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    public static void removeDuplicates(int[] arr)
    {
        
        for(int i = 0; i<arr.length; i++)
        {
            int count=0;
            for(int j = i+1; j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count==0)
                System.out.print(arr[i]+" ");
        }
        
    }

}