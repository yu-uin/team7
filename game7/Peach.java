import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Peach here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Peach extends Fruit
{
    private int score; 
    public Peach()
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
