import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class unitfarm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class unitfarm extends Actor
{
    /**
     * Act - do whatever the unitfarm wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         MyWorld myworld = (MyWorld)getWorld();
        farm text = myworld.getFARM();
        int unit = text.num;
        setImage(new GreenfootImage(String.format("FARM %d", unit)+"  UNITS", 30, Color.WHITE,Color.BLACK));
    }    
}
