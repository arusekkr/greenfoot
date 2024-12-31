import greenfoot.*; 
import java.util.Random;
import java.lang.Thread;
import greenfoot.Actor; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Die Klasse Korb modelliert den Spielerkorb, mit dem der Spieler die 
 * &Auml;pfel auffangen muss.
 * 
 * @author Daniel Garmann
 * @version 2018-09-14
 */
public class Korb extends Actor
{
    private int anzahlBirnen;
    private int anzahlApfel;
    public Korb()
    {
        
    }
    /**
     * Die Methode act steuert das Spiel.
     */
    public void act() 
    {
        bewegen();
        fangen();
        birnenFangen();
        einsammelnMuenze();
    }    

    /**
     * Die aktuellen Mausinformationen werden abgerufen, wenn wir den Mauszeiger auf das Szenario halten (!=null). 
     * Die x-Position des Mauszeigers wird angenommen, die y-Position bleibt festgelegt.
     */
    public void bewegen() {
        MouseInfo maus = Greenfoot.getMouseInfo();
        if (maus != null) {
            int x = maus.getX();
            int y = getY();
            setLocation(x, y);
        }
    }       

    //   protected getOneIntersectingObject(java.lang.apfel)

    /**
     * So kannder Korb Äpfel fangen
     */
    public void fangen() {
      Actor a = this.getOneIntersectingObject(Apfel.class);
      if (a != null) {
         World w = this.getWorld();
         w.removeObject(a);
         ++this.anzahlApfel;
         w.showText("Anzahl Apfel: " + this.anzahlApfel, 300, 20);
        }
    }
        
    public void birnenFangen() {
      Actor a = this.getOneIntersectingObject(Birne.class);
      if (a != null) {
         World w = this.getWorld();
         w.removeObject(a);
         ++this.anzahlBirnen;
         w.showText("Anzahl Birnen: " + this.anzahlBirnen, 300, 80);
         if (anzahlBirnen >= 10) {
            Ende ende = new Ende();
            w = getWorld();
            w.addObject(ende, 300, 200);
            Greenfoot.stop();    
        }
      }
    }
    public void einsammelnMuenze() {
    Actor muenze = this.getOneIntersectingObject(Muenze.class);
    if (muenze != null) {
        getWorld().removeObject(muenze); 
    }
    }
}