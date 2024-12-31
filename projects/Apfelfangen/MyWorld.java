import greenfoot.*;
import java.util.List;
import java.lang.Class;

/**
 * Die KlasseMyWorld ist eine Unterklasse der Klasse World, die 
 * zus&auml;tzlich die M&ouml;glichkeit bietet, die Anzahl der Objekte einer 
 * Klasse zu bestimmen, die sich auf der Welt befinden.
 *
 * @author Daniel Garmann
 * @version 2018-09-17
 */
public abstract class MyWorld extends World
{

    class Text extends Actor {
        // leere Klasse zur Darstellung eines Textes auf der Greenfoot-Welt
    }
    
    /**
     * Konstructor fuer Objekte der Klasse Welt.
     * 
     * @param worldWidth die Breite der Welt in Zellen
     * @param worldHeight die H&ouml;he der Welt in Zellen
     * @param die Breite und H&ouml;he einer Zelle in Pixeln
     */
    public MyWorld(int worldWidth, int worldHeight, int cellSize)
    {    
        super(worldWidth, worldHeight, cellSize); 
    }
    
    /**
     * Die Methode z&auml;hlt die Objekte einer Klasse auf der Welt.
     * 
     * @param cls die Klasse, deren Objekte gez&auml;hlt werden sollen
     * @return die Anzahl der entsprechenden Objekte
     */
    public int count(Class cls) {
        List list = getObjects(cls);
        int size = list.size();
        return size;
    }
    
    /**
     * Die Methode z&auml;hlt die Objekte einer Klasse in einer Zelle
     * der Welt.
     * 
     * @param x die x-Koordinate der Zelle
     * @param y die y-Koordinate der Zelle
     * @param cls die Klasse, deren Objekte gez&auml;hlt werden sollen
     * @return die Anzahl der entsprechenden Objekte
     */
    public int count(int x, int y, Class cls) {
        List list = getObjectsAt(x, y, cls);
        int size = list.size();
        return size;        
    }
    
    /**
     * Die Methode gibt Text auf dem Bildschirm aus.
     * Die Methode "showText" ist ab Version 3.xxx in der Klasse World
     * implementiert, sodass dies lediglich ein Workarround f&uuml;r &auml;ltere
     * Versionen von Greenfoot ist.
     * 
     * @param text der Text der Textausgabe
     * @param x die x-Koordinate der Textausgabe
     * @param y die y-Koordinate der Textausgabe
     */
    public void showText(String text, int x, int y) {
        GreenfootImage gi = new GreenfootImage("Text.png");

        gi.setColor(Color.BLACK);                                           // ab Greenfoot 3.5
        //gi.setColor(java.awt.Color.BLACK);                                     // vor Greenfoot 3.5 
        Font f = new Font("Arial", 24);                                     // ab Greenfoot 3.5
        //java.awt.Font f = new java.awt.Font("Arial", java.awt.Font.PLAIN, 24); // vor Greenfoot 3.5

        gi.setFont(f);
        gi.drawString(text,5,25);
        Text t = new Text();
        t.setImage(gi);
        java.util.List liste = getObjectsAt(x,y,Text.class);
        removeObjects(liste);
        addObject(t, x, y);
    }
}
