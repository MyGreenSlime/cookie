import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.awt.Color;
 
/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    double score = 0;
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage(String.format("%.02f", score)+"  COOKIES", 60, Color.WHITE,Color.BLACK));
    }    
     
    public void addScore(double a)
    {
        score+= a;
        
        //setImage(new GreenfootImage(score+"  COOKIES", 60, Color.WHITE,Color.BLACK));
    }
}