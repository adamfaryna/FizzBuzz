package com.adamfaryna.buzzfizz;

/**
 * @author https://github.com/adamfaryna
 */
public class Game {

  private NumbersGenerator generator = new NumbersGenerator();
  private NumbersProcessor processor = new NumbersProcessor();

  public void play() {
    generator.generate().forEach(processor);
  }
}
