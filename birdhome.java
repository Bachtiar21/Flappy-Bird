import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class birdhome here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class birdhome extends Actor
{
    /**
     * Act - do whatever the birdhome wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation(100,100);
    }    
    public birdhome(){
        GreenfootImage image = getImage();
        image.scale(80,70);
    }
}
