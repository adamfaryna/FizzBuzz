package com.adamfaryna.buzzfizz;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author https://github.com/adamfaryna
 */
public class NumbersGeneratorTest {

  @Test
  public void shouldGenerateIncrementalStreamOfInts() {
    int[] result = new NumbersGenerator().generate().toArray();
    int[] expected = new int[NumbersGenerator.ARRAY_LENGTH];

    for (int i = 0; i != NumbersGenerator.ARRAY_LENGTH; i++) {
      expected[i] = i + 1;
    }

    Assert.assertArrayEquals(expected, result);
  }
}
