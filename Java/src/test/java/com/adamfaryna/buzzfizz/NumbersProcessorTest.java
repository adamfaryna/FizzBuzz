package com.adamfaryna.buzzfizz;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.PrintStream;
import java.util.stream.IntStream;

/**
 * @author https://github.com/adamfaryna
 */
@RunWith(MockitoJUnitRunner.class)
public class NumbersProcessorTest {

  private static final int ARRAY_LENGTH = 15;

  @Mock
  private PrintStream printStream;

  @Before
  public void setUp() throws Exception {
    System.setOut(printStream);
  }

  @Test
  public void shouldProcessNumbersInCorrectOrder() {
    String[] expected = {
      "1", "2", "fizz", "4", "buzz", "fizz", "7", "8", "fizz", "buzz", "11", "fizz", "13", "14", "fizz buzz"
    };

    IntStream.rangeClosed(1, ARRAY_LENGTH).forEachOrdered(new NumbersProcessor());

    for (String elem : expected) {
      Mockito.verify(printStream, Mockito.atLeastOnce()).println(elem);
    }
  }
}
