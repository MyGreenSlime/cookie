import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class unitfac here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class unitfac extends Actor
{
    /**
     * Act - do whatever the unitfac wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         MyWorld myworld = (MyWorld)getWorld();
        factory text = myworld.getFAC();
        int unit = text.num;
        setImage(new GreenfootImage(String.format("FACTORY %d", unit)+"  UNITS", 30, Color.WHITE,Color.BLACK));
    }    
}
