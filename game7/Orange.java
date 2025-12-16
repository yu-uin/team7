import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Orange here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Orange extends Fruit
{
     private int score; 
    public Orange()
    {
        
        score = 30;
    }
    public int getScore()
    {
        return score;
    }
    public void act() 
    {
        setLocation(getX(), getY() + 3);
        
        
        if (getWorld() != null && getY() >= getWorld().getHeight() - 1) {
            getWorld().removeObject(this);
        }
    }    
}
