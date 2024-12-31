import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Die Klasse Apfel modelliert den speziellen fallenden Gegenstand, den der Spieler
 * versuchen muss, aufzufangen.
 * 
 * @author Daniel Garmann
 * @version 2018-09-14
 */
public class Apfel extends Gegenstand
{
    /**
     * Die Methode act sorgt daf&uuml;r, dass der Apfel in seiner Geschwindigkeit f&auml;llt.
     */
    public void act() 
    {
     fallen();
     faulen();
    }   
    public void fallen()
    {
      setLocation(getX(), getY() + 1);
    }
    public void faulen() {
      int x = this.getX();
      int y = this.getY();
      if (y >= 399) {
         World w = this.getWorld();
         w.removeObject(this);
         FaulerApfel a = new FaulerApfel();
         w.addObject(a, x, y);
      }

    }
}
