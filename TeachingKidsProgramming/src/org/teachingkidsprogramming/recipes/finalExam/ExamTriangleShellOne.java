package org.teachingkidsprogramming.recipes.finalExam;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;

public class ExamTriangleShellOne
{
  private static int length;
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    int shellSize = MessageBox.askForNumericalInput("Set shell size");
    if (shellSize < 200)
    {
      MessageBox.showMessage("Size of shell is too small to be seen");
      MessageBox.askForNumericalInput("Enter updated size of shell");
    }
    else
    {
      for (int i = 1; i <= shellSize; i++)
      {
        Tortoise.setPenColor(Colors.getRandomColor());
        int largeLength = shellSize / 2;
        length = shellSize;
        Tortoise.move(shellSize);
        int j = length + largeLength;
        if (largeLength < 0)
        {
          length = length + 3;
        }
        else
        {
          drawTriangle();
        }
        int numberofRotations = 6;
        Tortoise.turn(numberofRotations * 360 / shellSize);
      }
    }
  }
  private static void drawTriangle()
  {
    for (int i = 1; i <= 2.5; i++)
    {
      Tortoise.move(length);
      Tortoise.turn(360 / 3.5);
    }
  }
}