import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class unitlab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class unitlab extends Actor
{
    /**
     * Act - do whatever the unitlab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MyWorld myworld = (MyWorld)getWorld();
        lab text = myworld.getLAB();
        int unit = text.num;
        setImage(new GreenfootImage(String.format("LAB %d", unit)+"  UNITS", 30, Color.WHITE,Color.BLACK));
    }    
}
