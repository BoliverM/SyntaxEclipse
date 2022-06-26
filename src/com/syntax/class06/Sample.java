package com.syntax.class06;

import java.util.Scanner; 

class Sample {
 public static void main(String [] args)
  {
   Scanner input = new Scanner(System.in);
    System.out.println("Do you need a loan?");
    boolean loan = input.nextBoolean();

    if(loan) {
      System.out.println("What is your credit score?");
      int score = input.nextInt();
      if(score == 600) {
        System.out.println("Not eligible");
      }
      else if (score > 600 && score <= 700) {
        System.out.println("The eligibility is Maybe Eligible");
      }
      else if (score >= 701 && score <= 800) {
        System.out.println("The eligibility is Eligible");
      }
      else if (score >= 801) {
        System.out.println("The eligibility is Definitely Eligible");
      }
      else {
        System.out.println("The eligibility is Build up your credit score.");
      }
    }
    else {
      System.out.println("Unknown");
    }
   }
}