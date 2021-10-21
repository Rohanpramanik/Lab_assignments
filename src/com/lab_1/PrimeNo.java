package com.lab_1;

import java.util.Scanner;

public class PrimeNo {
  public static void prime(int n){
        int i,j;
        for(i=2;i<=n;i++)
        {
          int c=0;
          for(j =1;j<=i;j++)
          {
            if(i%j==0)
            {
              c++;
            }
          }
          if(c==2)
          {
           System.out.print(i+" ");
          }
        }
      }
    public static void main(String args[]) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the range : ");
      int n = sc.nextInt();
      prime(n);
   }
}


