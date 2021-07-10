import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LastLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LastLevel extends World
{

    /**
     * Constructor for objects of class LastLevel.
     * 
     */
    public LastLevel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new flappybird(), 100, 200);
        addObject(new pipe(), 300, 150);
        addObject(new pipe(), 600, 150);
        addObject(new score(), 300, 100);
    }
}
