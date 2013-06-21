package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class PentagonCrazy
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    ColorWheel.addColor(Colors.Blues.SteelBlue);
    ColorWheel.addColor(Colors.Purples.DarkOrchid);
    ColorWheel.addColor(Colors.Blues.SlateBlue);
    ColorWheel.addColor(Colors.Blues.Teal);
    ColorWheel.addColor(Colors.Blues.Blue);
    // No indigo color?
    for (int i = 1; i <= 200; i++)
    {
      Tortoise.setPenColor(ColorWheel.getNextColor());
      int width;
      width = Tortoise.getPenWidth();
      Tortoise.setPenWidth(width + 1);
      if (width > 4)
      {
        Tortoise.setPenWidth(1);
      }
      // How do you not use a greater than in this situation?
      int lengthofSide = 60;
      Tortoise.move(lengthofSide);
      Tortoise.turn(360 / 5);
      Tortoise.turn(1);
    }
  }
}
