package com.adamfaryna.buzzfizz;

import java.util.stream.IntStream;

/**
 * @author https://github.com/adamfaryna
 */
public class NumbersGenerator {

  public static final int ARRAY_LENGTH = 34;

  public IntStream generate() {
    return IntStream.rangeClosed(1, ARRAY_LENGTH);
  }

}
