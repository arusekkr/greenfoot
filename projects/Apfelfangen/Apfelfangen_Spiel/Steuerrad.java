import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Steuerrad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Steuerrad extends Actor
{
    /**
     * Act - do whatever the Steuerrad wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        bewegen();
    }  

    public void bewegen() {
    MouseInfo maus = Greenfoot.getMouseInfo(); //maus info abrufen wie in Korb
      if (maus != null) {
         int degree = maus.getX();
         setRotation(degree); //links rechts drehen
    }  
    }
}
//public int getRotation()