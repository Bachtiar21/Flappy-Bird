import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class information here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class information extends button
{
    /**
     * Act - do whatever the information wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.mousePressed(this) )  
        {   
            Greenfoot.setWorld(new tentang());
        }
    }
    public information()
    {
        GreenfootImage image = getImage();
        image.scale(50,50);
    }
}
