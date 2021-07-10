import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class button extends Actor
{
    /**
     * Act - do whatever the button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(String start) 
    {
        if (Greenfoot.mouseMoved(this)) {

        } else if (Greenfoot.mouseMoved(null)) {

        }
        if (Greenfoot.mousePressed(this)) {
            getImage().scale((int)Math.round(getImage().getWidth() * 0.9), (int)Math.round(getImage().getHeight() * 0.9));
        }
        if (Greenfoot.mouseClicked(null) || Greenfoot.mouseDragEnded(null)) {

        }
        if (Greenfoot.mouseClicked(this)) {

            Greenfoot.delay(5); 
            if  (start.equalsIgnoreCase("start")) Greenfoot.setWorld(new MyWorld());

        }
    } 
}
