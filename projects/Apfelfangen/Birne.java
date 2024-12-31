import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Birne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Birne extends Gegenstand
{
    private int birnenGeschwindigkeit = 1;
    /**
     * Act - do whatever the Birne wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    try{ //versuche das
         fallen();
         löschen();
         einsammelnMuenze();
         aktualisiereBirnenGeschwindigkeit();
         if (Greenfoot.getRandomNumber(100) < 1) {
             muenze();
            }
        }
    catch(Exception e){ //sonst mach das, fehler ist hier wenn man maus aus dem fenster rausnimmt
        ;
        }
    }
    
    public void fallen()
    {
        setLocation(getX(), getY() + birnenGeschwindigkeit);
        if (getY() >= getWorld().getHeight()) {
            getWorld().removeObject(this); // Entfernt die Birne, wenn sie aus der Welt fällt
        }
    }
    public void setFallGeschwindigkeit(int geschwindigkeit) {
    this.birnenGeschwindigkeit = geschwindigkeit;
      }
    public void löschen() {
      try{ //versuche das
          int h = this.getY();
          if (h >= 399) {
             World w = this.getWorld();
             w.removeObject(this);
          }
        }
        catch(Exception e){ // sonst mach nichts
            ;
        }
    }

    public void muenze() {
        int posX = Greenfoot.getRandomNumber(600);
        Muenze muenze = new Muenze();
        getWorld().addObject(muenze, posX, 0);
    }
    public void einsammelnMuenze() {
      Actor muenze = this.getOneIntersectingObject(Muenze.class);
      if (muenze != null) {
        getWorld().removeObject(muenze);
        birnenGeschwindigkeit++; //erhöht die geschwindigkeit der birnen
        aktualisiereBirnenGeschwindigkeit(); 
      }
    }
    public void setGeschwindigkeit(int geschwindigkeit) {
    geschwindigkeit = geschwindigkeit;
    }
    private void aktualisiereBirnenGeschwindigkeit() {
    for (Birne birne : getWorld().getObjects(Birne.class)) {
        birne.setGeschwindigkeit(birnenGeschwindigkeit);
    }
    }
}
   