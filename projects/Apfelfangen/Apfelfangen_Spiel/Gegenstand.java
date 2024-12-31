import greenfoot.*;

/**
 * Diese Klasse modelliert einen fallenden Gegenstand.
 * 
 * @author Daniel Garmann
 * @version 2018-09-14
 */
public abstract class Gegenstand extends Actor
{
    /**
     * Der Gegenstand f&auml;llt mit seiner Geschwindigkeit in Richtung Boden.
     * @param pFallgeschwindigkeit die Fallgeschwindigkeit des Gegenstands.
     */
     public void act() 
    {
        fallen();
        schnellfallen();

    }    
    
    
    public void fallen(){
        setLocation(getX(), getY() + 1);

    }
    public void schnellfallen(){
        setLocation(getX(), getY() + 3);
    }
}

