package org.teachingkidsprogramming.recipes;

public class FizzBuzz
{
  public static String convert(int i)
  {
    // If number divisible by 3 and 5 with remainder 0 give FizzBuzz
    if (i % 15 == 0)
    {
      return "FizzBuzz";
    }
    // Else if number is divisible by 3 with remainder 0 give Fizz
    else if (i % 3 == 0)
    {
      return "Fizz";
    }
    // Else if number is divisible by 5 with remainder 0 give Buzz
    else if (i % 5 == 0)
    {
      return "Buzz";
    }
    // otherwise do the regular
    else
    {
      return "" + i;
    }
  }
}
