// Write a program to find out duplicate characters in a string.

public class MyClass {
    public static void main(String args[]) {
      String s1 = "abbacdc";
      int count = 0;
      for(int i = 0; i<s1.length(); i++)
      {
          for(int j = i+1; j<s1.length(); j++)
          {
             
              if(s1.charAt(i) == s1.charAt(j))
              {
                  count++;
              }
          }
          if(count==1)
            System.out.print(s1.charAt(i)+" ");
          count=0;
      }
    }
}

// Remove duplicate from a string

public class MyClass {
    public static void main(String args[]) {
      String s1 = "abbacdc";
      int count = 0;
      for(int i = 0; i<s1.length(); i++)
      {
          for(int j = i+1; j<s1.length(); j++)
          {
             
              if(s1.charAt(i) == s1.charAt(j))
              {
                  count++;
              }
          }
          if(count==0)
            System.out.print(s1.charAt(i)+" ");
          count=0;
      }
    }
}


// Reverse a string
public class MyClass {
    public static void main(String args[]) {
      String s1 = "abcde";
      for(int i = s1.length()-1; i>=0; i--)
      {
          System.out.print(s1.charAt(i));
      }
    }
}


//Anagaram

import java.util.Arrays;

public class MyClass {
    public static void main(String args[]) {
      String s1 = "tea";
      String s2 = "eat";
      char[] c1 = s1.toCharArray();
      char[] c2 = s2.toCharArray();
      Arrays.sort(c1);
      Arrays.sort(c2);
      boolean check = false;
      String s3 = Arrays.toString(c1);
      String s4 = Arrays.toString(c2);
      if(s3.length() == s4.length())
      {
          if(s3.equalsIgnoreCase(s4))
            check = true;
      }
      if(check)
        System.out.println("Anagram!");
      else
        System.out.println("Not Anagram!");
    }
}


//Counting vowels and consonants

import java.util.Arrays;

public class MyClass {
    public static void main(String args[]) {
      String s1 = "tHis";
      int vowelCount = 0, consonantCount = 0;
      
      for(char i : s1.toLowerCase().toCharArray())
      {
        if(i=='a' || i=='e' || i=='i' || i=='o' || i=='u')
            vowelCount++;
        else
            consonantCount++;
      }
      System.out.println("Vowel : "+ vowelCount);
      System.out.println("Consonants : "+ consonantCount);
    }
}