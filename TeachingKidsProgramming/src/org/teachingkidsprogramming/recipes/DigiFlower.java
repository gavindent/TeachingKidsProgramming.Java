package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Colors.Oranges;
import org.teachingextensions.logo.Colors.Reds;
import org.teachingextensions.logo.Colors.Yellows;
import org.teachingextensions.logo.Tortoise;

public class DigiFlower
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.getBackgroundWindow().setColor(Colors.Grays.Silver);
    Tortoise.setPenWidth(3);
    for (int i = 1; i <= 15; i++)
    {
      Tortoise.turn(360 / 15);
      ColorWheel.addColor(Reds.Red);
      ColorWheel.addColor(Oranges.DarkOrange);
      ColorWheel.addColor(Yellows.Gold);
      ColorWheel.addColor(Yellows.Yellow);
      ColorWheel.addColor(Yellows.Yellow);
      ColorWheel.addColor(Yellows.Gold);
      ColorWheel.addColor(Oranges.DarkOrange);
      ColorWheel.addColor(Reds.Red);
      for (int i1 = 1; i1 <= 8; i1++)
      {
        Tortoise.setPenColor(ColorWheel.getNextColor());
        Tortoise.move(50);
        Tortoise.turn(360 / 8);
      }
    }
  }
}
