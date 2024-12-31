import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Muenze here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Muenze extends Actor
{
    /**
     * Act - do whatever the Muenze wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        fallen();
    }
            public void fallen(){
        setLocation(getX(), getY() + 9);

    }
}
