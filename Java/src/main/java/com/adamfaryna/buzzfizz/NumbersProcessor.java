package com.adamfaryna.buzzfizz;

import java.util.function.IntConsumer;

/**
 * @author https://github.com/adamfaryna
 */
public class NumbersProcessor implements IntConsumer {

  @Override
  public void accept(int value) {
    if (value % 3 == 0) {
      System.out.println(value % 5 == 0 ? "fizz buzz" : "fizz");

    } else {
      System.out.println(value % 5 == 0 ? "buzz" : String.valueOf(value));
    }
  }
}
