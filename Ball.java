//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

   public Ball(int x, int y, int w, int h, Color col, int vx, int vy) {
      super(x,y,w,h,col);
      setXSpeed(vx);
      setYSpeed(vy);
   }
   
	public Ball(int x, int y, int w, int h, Color col) {
      this(x,y,w,h,col,3,1);
   }
   
   public Ball(int x, int y, int w, int h) {
      this(x,y,w,h,Color.BLACK);
   }
   
   public Ball(int x, int y) {
      this(x,y,10,10);
   }
   
   public Ball() {
      this(200,200);
   }
	
   void setXSpeed(int vx) { xSpeed = vx; }
   
   void setYSpeed(int vy) { ySpeed = vy; }

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
      draw(window, Color.WHITE);

      setX(getX() + xSpeed);
		//setY
      setY(getY() + ySpeed);

		//draw the ball at its new location
      draw(window);
   }
   
	public boolean equals(Object obj)
	{
      final Ball b = (Ball)obj;
		return super.equals(obj) && 
             b.getXSpeed() == xSpeed &&
             b.getYSpeed() == ySpeed;
	}   

   //add the get methods
   int getXSpeed() { return xSpeed; }
   
   int getYSpeed() { return ySpeed; }

   //add a toString() method
   public String toString() {
      return super.toString() + " " + xSpeed + " " + ySpeed;
   }
   
}