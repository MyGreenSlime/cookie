import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pricefarm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pricefarm extends Actor
{
    /**
     * Act - do whatever the pricefarm wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MyWorld myworld = (MyWorld)getWorld();
        farm text = myworld.getFARM();
        double price = text.price;
        setImage(new GreenfootImage(String.format("PRICE %.02f", price)+"  COOKIES", 30, Color.WHITE,Color.BLACK));
    }    
}
