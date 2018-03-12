import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class factory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class factory extends Actor
{
    int num =0;
    double price = 2500;
    /**
     * Act - do whatever the grandmom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       MyWorld myworld = (MyWorld)getWorld();
       Counter count = myworld.getCount();
        if(Greenfoot.mouseMoved(this))
        {
            GreenfootImage image = getImage();  
            image.scale(90, 110);  
            setImage(image);  
        }
        else  
        {
             GreenfootImage image = getImage();  
            image.scale(100, 120);  
            setImage(image);  
        }
       
       if(Greenfoot.mouseClicked(this)&&count.score-price>=0) 
        {
           GreenfootImage image = getImage();  
           image.scale(110, 130);  
           setImage(image); 
           num++;
           count.addScore(-price);
           price = price*1.2;
        }
       count.addScore((num*160.0)/50);
       //Greenfoot.delay(1);
       
    }    
}
