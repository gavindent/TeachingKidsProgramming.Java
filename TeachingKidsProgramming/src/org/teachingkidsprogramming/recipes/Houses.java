package org.teachingkidsprogramming.recipes;

import java.awt.Color;

import org.teachingextensions.logo.Tortoise;

public class Houses
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    int height = 40;
    drawHouse(height);
    drawHouse(120);
    drawHouse(90);
    drawHouse(20);
  }
  private static void drawHouse(int height)
  {
    Tortoise.setPenColor(Color.lightGray);
    Tortoise.move(height);
    // flatRoof();
    // MavericksRoof
    Tortoise.turn(-90);
    Tortoise.move(10);
    Tortoise.turn(90 + 45);
    Tortoise.move(50);
    Tortoise.turn(90);
    Tortoise.move(50);
    Tortoise.turn(90 + 45);
    Tortoise.move(10);
    Tortoise.turn(-90);
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(30);
    Tortoise.turn(-90);
  }
}
