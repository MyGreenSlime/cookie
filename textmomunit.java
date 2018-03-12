import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class textmomunit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class textmomunit extends Actor
{
    /**
     * Act - do whatever the textmomunit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MyWorld myworld = (MyWorld)getWorld();
        grandmom text = myworld.getMOM();
        int unit = text.num;
        setImage(new GreenfootImage(String.format("GRANDMOM %d",unit)+"  UNITS", 30, Color.WHITE,Color.BLACK));
    }    
}
