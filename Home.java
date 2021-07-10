import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Home here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Home extends World
{
    /**
     * Constructor for objects of class Home.
     * 
     */
    public Home()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject(new birdhome(),300, 200);
        addObject(new opening(),300, 100);
        addObject(new information(), 567,370);
        prepare();
    }
    private void prepare()
    {
        start start = new start();
        addObject(start, 300, 293);
    }
}
