package org.teachingkidsprogramming.recipes;

import java.util.Random;

import org.teachingextensions.logo.utils.Sounds;
import org.teachingextensions.windows.MessageBox;

public class HiLow
{
  public static void main(String[] args)
  {
    int correctNum = new Random(100).nextInt(100);
    int forVar = 8;
    for (int i = 1; i <= forVar; i++)
    {
      int guess = MessageBox.askForNumericalInput("Guess a number");
      if (guess < 1 || 100 < guess)
      {
        MessageBox.showMessage("Your number " + guess + " is not a valid number or within the range");
      }
      else if (guess == correctNum)
      {
        Sounds.playBeep();
        MessageBox.showMessage("You won the game!");
        System.exit(0);
      }
      else if (correctNum < guess)
      {
        int tries = forVar - i;
        if (tries == 1)
        {
          String trs = "try";
          MessageBox.showMessage("Your number is too high and you have " + (forVar - i) + " more " + trs);
        }
        else
        {
          String trs = "tries";
          MessageBox.showMessage("Your number is too high and you have " + (forVar - i) + " more " + trs);
        }
      }
      else if (guess < correctNum)
      {
        int tries = forVar - i;
        if (tries == 1)
        {
          String trs = "try";
          MessageBox.showMessage("Your number is too low and you have " + (forVar - i) + " more " + trs);
        }
        else
        {
          String trs = "tries";
          MessageBox.showMessage("Your number is too low and you have " + (forVar - i) + " more " + trs);
        }
      }
    }
    MessageBox.showMessage("You lost the game and the answer was " + correctNum);
  }
}
