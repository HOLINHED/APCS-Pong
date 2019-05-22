//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle(int x, int y, int w, int h, Color color, int speed) {
      super(x,y,w,h,color);
      setSpeed(speed);
   }

   public Paddle(int x, int y, int w, int h, Color color) {
      this(x,y,w,h,color,5);
   }

   public Paddle(int x, int y, int w, int h, int speed) {
      this(x,y,w,h,Color.BLACK,speed);
   }

   public Paddle(int x, int y, int w, int h) {
      this(x,y,w,h,Color.BLACK);
   }

   public Paddle(int x, int y, int speed) {
      this(x,y,10,10,speed);
   }

   public Paddle(int x, int y) {
      this(x,y,10,10);
   }

   public Paddle()
   {
		this(10,10);
   }

   public void setSpeed(int speed) { this.speed = speed; }

   public void moveUpAndDraw(Graphics window)
   {
      super.draw(window, Color.WHITE);
      setY(getY() - speed);
      super.draw(window);
   }

   public void moveDownAndDraw(Graphics window)
   {
      super.draw(window, Color.WHITE);
      setY(getY() + speed);
      super.draw(window);
   }

   //add get methods
   public int getSpeed() { return speed; }
   
   //add a toString() method
   public String toString() {
      return super.toString() + " " + speed;
   }
}