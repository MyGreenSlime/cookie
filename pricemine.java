import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pricemine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pricemine extends Actor
{
    /**
     * Act - do whatever the pricemine wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MyWorld myworld = (MyWorld)getWorld();
        mine text = myworld.getMINE();
        double price = text.price;
        setImage(new GreenfootImage(String.format("PRICE %.02f", price)+"  COOKIES", 30, Color.WHITE,Color.BLACK));
    }    
}
