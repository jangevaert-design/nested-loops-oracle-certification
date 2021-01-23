package edu.cnm.deepdive;

import java.util.Arrays;

public class NestedLoops {

  public static void main(String[] args) {
//    for (int hours = 1; hours <= 6 ; hours++) {
//      for (int minutes = 0; minutes < 60 ; minutes++) {
//        //System.out.println(hours + ":" + minutes);
//      }

    int[][] myArray = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    System.out.println(myArray);//prints hashcode
    System.out.println(Arrays.toString(myArray));//prints hashcode

    OUTER:
    for (int[] rowArray : myArray) {
      INNER:
      for (int i = 0; i < rowArray.length; i++) {
        if (rowArray[i] % 2 == 0) {
//            break INNER;//INNER is not really needed because it will break out of the first loop
//            //where the break statement is in; in this case the INNER loop. Prints 1 - empty line - 7.
//            break OUTER;// will print 1 and then stop because 2 is an even number.
//            continue INNER;// prints 1 3 - 5 - 7 9 because it skips the even numbers.
//            continue OUTER;prints 1 - 7 because when reaching 2 it moves to the OUTER loop where
//            it starts with 4, doesn't print 4 but moves to the 3rd OUTER loop only to print 7.
        }
        System.out.print(rowArray[i] + " ");
      }
      System.out.println();
    }

    int x = 10;
    while (x > 0) {
      do {
        //1. this inner do while loop will execute until x = 5 and then move to x--.
        //3. x becomes now 3 and since 3 < 5 this falls through to x--.
        //5. x becomes now 1 and since 1 < 5 this falls through to x--.
        x -= 1;
      } while (x > 5);
      x--;//2. since x was 5, x is now 4 and prints 4.
          //4. x-- turns 3 into 2 and prints 2.
          //6. x-- turns 1 into 0 and prints 0.

      System.out.println(x);
    }
  }
}

