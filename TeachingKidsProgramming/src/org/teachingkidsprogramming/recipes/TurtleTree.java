package org.teachingkidsprogramming.recipes;

import java.awt.Color;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Turtle;

public class TurtleTree
{
  public static void main(String[] args)
  {
    Turtle turtle = new Turtle();
    turtle.setSpeed(10);
    turtle.getBackgroundWindow().setColor(Color.black);
    int lengthBranch = 60;
    drawbranch(turtle, lengthBranch);
  }
  private static void drawbranch(Turtle turtle, int lengthBranch)
  {
    if (0 < lengthBranch)
    {
      adjustColor(turtle, lengthBranch);
      turtle.move(lengthBranch);
      drawlowerbranches(turtle, lengthBranch);
    }
  }
  private static void adjustColor(Turtle turtle, int lengthBranch)
  {
    if (lengthBranch == 10)
    {
      turtle.setPenColor(Colors.Greens.Lime);
    }
    if (lengthBranch == 20)
    {
      turtle.setPenColor(Colors.Greens.ForestGreen);
    }
    if (lengthBranch == 30)
    {
      turtle.setPenColor(Colors.Greens.DarkGreen);
    }
    if (lengthBranch == 40)
    {
      turtle.setPenColor(Colors.Greens.Olive);
    }
    if (lengthBranch == 50)
    {
      turtle.setPenColor(Colors.Browns.Sienna);
    }
    if (lengthBranch == 60)
    {
      turtle.setPenColor(Colors.Browns.SaddleBrown);
    }
  }
  private static void drawlowerbranches(Turtle turtle, int lengthBranch)
  {
    turtle.turn(30);
    drawshorterbranch(turtle, lengthBranch);
    turtle.turn(-60);
    drawshorterbranch(turtle, lengthBranch);
    turtle.turn(30);
    adjustColor(turtle, lengthBranch);
    turtle.move(-lengthBranch);
  }
  private static void drawshorterbranch(Turtle turtle, int lengthBranch)
  {
    drawbranch(turtle, lengthBranch - 10);
  }
}