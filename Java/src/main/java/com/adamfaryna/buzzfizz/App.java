package com.adamfaryna.buzzfizz;

import java.util.stream.IntStream;

/**
 * Fizz Buzz main class.
 *
 * @author https://github.com/adamfaryna
 */
public class App {

  public static final int ARRAY_LENGTH = 34;

  public static void main(String[] args) {
    IntStream.rangeClosed(1, ARRAY_LENGTH).forEach(
      (v) -> {
        if (v % 3 == 0) {
          System.out.println(v % 5 == 0 ? "fizz buzz" : "fizz");

        } else {
          System.out.println(v % 5 == 0 ? "buzz" : String.valueOf(v));
        }
      }
    );
  }
}
