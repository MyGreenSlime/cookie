import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class unitmine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class unitmine extends Actor
{
    /**
     * Act - do whatever the unitmine wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       MyWorld myworld = (MyWorld)getWorld();
        mine text = myworld.getMINE();
        int unit = text.num;
        setImage(new GreenfootImage(String.format("MINE %d", unit)+"  UNITS", 30, Color.WHITE,Color.BLACK));
    }    
}
