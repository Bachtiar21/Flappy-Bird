import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class flappybird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flappybird extends Actor
{
    private double g = 1;
    private int y = 200;
    private boolean haspressed = false;
    private boolean isalive = true;
    private boolean isacross = false;
    private boolean hasaddscore = false;
    /**
     * Act - do whatever the flappybird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public flappybird(){
        GreenfootImage image = getImage();
        image.scale(50,40);
    }

    public void act() 
    {
        // jika tekan spasi, koordinat y akan berkurang dan terbang ke atas
        if(spacePressed()){
            g=-2;
        }    
        g += 0.1; //Nilai g meningkat 0.1 setiap saat
        y += g; //Nilai y tidak berubah dengan kecepatan konstan
        setLocation(getX(), (int)(y));
        //Jika menabrak pipa maka flappybird mati
        if(isTouchpipe()){
            isalive = false;
        }
        //pemberian suara pada saat game over
        if(isTouchpipe()){
            isalive = false;
        }
        //setelah jatuh atau menabrak pipa maka flappybird hilang
        if(!isalive){
            getWorld().addObject (new gameover(), 300, 200);
            getWorld().addObject (new restart(),300,200);
            getWorld().removeObject(this);
        }
        //penambahan skor setelah melewati pipa dan pemberian suara
        if(!hasaddscore && isacross && isalive){
            score.add(1);
        }

        hasaddscore = isacross;
        level();
    }

    public void level() 
    {
        if(score.score == 5) //berada di level 1
        {
            getWorld().addObject (new youwin(), 300, 107);
            getWorld().addObject (new Next(), 291, 220);
            getWorld().removeObject(this);
        }
        if (score.score == 5) { //berada di level 2
            getWorld().addObject (new youwin(), 300, 107);
            getWorld().addObject (new Next(), 291, 220);
            getWorld().removeObject(this);
        }
        if (score.score == 3) { //berada di level 3
            getWorld().addObject (new youwin(), 300, 107);
            getWorld().addObject (new Next(), 291, 220);
            getWorld().removeObject(this);
        }
        if (score.score == 4) { //berada di level 4
            getWorld().addObject (new youwin(), 300, 107);
            getWorld().addObject (new Next(), 291, 220);
            getWorld().removeObject(this);
        }
        if (score.score == 5) { //berada di level 5
            getWorld().addObject (new youwin(), 300, 107);
            getWorld().addObject (new Next(), 300, 107);
            getWorld().removeObject(this);
        }
        if (score.score == 5) { // berada di last level
            getWorld().addObject (new youwin(), 300, 107);
            getWorld().addObject (new Next(), 300, 107);
            getWorld().removeObject(this);
        }
    }

    public boolean spacePressed(){
        boolean pressed = false;
        if(Greenfoot.isKeyDown("Space")){
            if(!haspressed){
                pressed = true;
            }
            haspressed = true;
        } else {
            haspressed = false;
        }
        return pressed;
    }

    public boolean isTouchpipe() {
        isacross = false;
        for(pipe pipe : getWorld().getObjects(pipe.class)){
            if(Math.abs(pipe.getX() - getX()) < 69){
                if(Math.abs(pipe.getY() + 30 - getY()) > 37){
                    isalive = false;
                }
                isacross = true;
            }
        }
        return !isalive;
    }
}

