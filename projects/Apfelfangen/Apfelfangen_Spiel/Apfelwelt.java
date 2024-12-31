import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
import java.lang.Thread;

/**
 * Die Klasse MyWorld modelliert die Spielfl&auml;che des Spiels.
 * 
 * @author Daniel Garmann
 * @version 2018-09-14
 */
public class Apfelwelt extends MyWorld
{
    private Korb spielerKorb;

    /**
     * Die Welt wird mit 10 Äpfeln in der oberen Spielhälfte gestartet.
     * 
     */
    public Apfelwelt()
    {    
        // Erzeugt eine neue Welt mit der Gr&ouml;&szlige 600 x 400 und der Zellengr&ouml;&szlig;e 1
        super(600, 400, 1); 
        prepare();
        
    }
    /**
     * Die Methode act steuert die Erzeugung neuer Objekte.
     */
    public void act() 
    {
      if (Greenfoot.getRandomNumber(100) < 3) {
         neuenApfelErzeugen();
      } else if (Greenfoot.getRandomNumber(100) < 1) {
         neuenSchnellenApfelErzeugen();
      } else if (Greenfoot.getRandomNumber(100) >= 99) {
         neueBirneErzeugen();
      }
      ende();

       }
        

    public void neuenSchnellenApfelErzeugen()
    {
        int posX = Greenfoot.getRandomNumber(600);
        SchnellerApfel schnellerApfel = new SchnellerApfel();
        addObject(schnellerApfel, posX, 0);
        
    }
    public void neueBirneErzeugen()
    {
        int posX = Greenfoot.getRandomNumber(600);
        Birne birne = new Birne();
        addObject(birne, posX, 0);
        
    }
    public void neuenApfelErzeugen()
    {
        int posX = Greenfoot.getRandomNumber(600);
        Apfel apfel = new Apfel();
        addObject(apfel, posX, 0);
        
    }

    private void setzeApfel()
    {
     int posX = Greenfoot.getRandomNumber(600);
     int  posY = Greenfoot.getRandomNumber(200);
     Apfel apfel = new Apfel(); // apfel speed
     addObject(apfel, posX, posY); //ka wozu aber ich alsse eif also die ganze methode
        
    }

    public void setzeVieleAepfel()
    {
        for(int i = 0; i < 10; i++) {// i = i+1 
            setzeApfel();

        }
        
     }
    
     public void ende() {
      int anzahlFauleApfel = count(FaulerApfel.class);
      showText("Anzahl faule Apfel: " + anzahlFauleApfel, 300, 50);
      if (anzahlFauleApfel >= 10) {
         Ende ende = new Ende();
         addObject(ende, 300, 200);
         Greenfoot.stop();
      }

    }
    

    private void prepare()
    {
                
        Seil seil = new Seil();
        addObject(seil, 300, 290);
        
        Korb korb = new Korb();
        addObject(korb, 300, 330);
        
        Steuerrad steuerrad= new Steuerrad();
        addObject(steuerrad, 50, 300);
        
        setzeVieleAepfel();
        showText("Anzahl Apfel: 0", 300, 20);
        showText("Anzahl faule Apfel: 0", 300, 50);
        showText("Anzahl Birnen: 0", 300, 80);

    }


}
