import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SchnellerApfel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SchnellerApfel extends Apfel
{
    /**
     * Act - do whatever the SchnellerApfel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        fallen();
        faulen();
    }   
 
        public void fallen(){
        setLocation(getX(), getY() + 3);

    }
}
