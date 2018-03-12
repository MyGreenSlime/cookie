import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cookie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cookie extends Actor
{
    
   
     /* Act - do whatever the cookie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
         if(Greenfoot.mouseMoved(this))
        {
            GreenfootImage image = getImage();  
            image.scale(500, 500);  
            setImage(image);  
        }
        else  
        {
             GreenfootImage image = getImage();  
            image.scale(512, 512);  
            setImage(image);  
        }
        if(Greenfoot.mouseClicked(this)) 
        {
            GreenfootImage image = getImage();  
            image.scale(522, 522);  
            setImage(image);  
             MyWorld myworld = (MyWorld)getWorld();
            Counter count = myworld.getCount();
            count.addScore(1);
            
        }
    }    
}
