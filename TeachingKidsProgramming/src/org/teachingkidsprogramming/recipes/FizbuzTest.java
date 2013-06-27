package org.teachingkidsprogramming.recipes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizbuzTest
{
  @Test
  public void test1Produces1()
  {
    assertEquals("1", FizzBuzz.convert(1));
  }
  @Test
  public void test2Produces2()
  {
    assertEquals("2", FizzBuzz.convert(2));
  }
  @Test
  public void test3ProducesFizz()
  {
    assertEquals("Fizz", FizzBuzz.convert(3));
  }
  @Test
  public void test4Produces4()
  {
    assertEquals("4", FizzBuzz.convert(4));
  }
  @Test
  public void test5ProducesBuzz()
  {
    assertEquals("Buzz", FizzBuzz.convert(5));
  }
  @Test
  public void testmultiplesof3ProducesFizz()
  {
    assertEquals("Fizz", FizzBuzz.convert(6));
  }
  @Test
  public void testmultiplesof5ProducesBuzz()
  {
    assertEquals("Buzz", FizzBuzz.convert(10));
  }
  @Test
  public void testmultiplesof3and5ProducesFizzBuzz()
  {
    assertEquals("FizzBuzz", FizzBuzz.convert(15));
  }
}
