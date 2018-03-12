import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class textmom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class textmom extends Actor
{
    public void act() 
    {
        MyWorld myworld = (MyWorld)getWorld();
        grandmom text = myworld.getMOM();
        double price = text.price;
        setImage(new GreenfootImage(String.format("PRICE %.02f", price)+"  COOKIES", 30, Color.WHITE,Color.BLACK));
    }    
}
