import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class scoreWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameclear extends World
{

    /**
     * Constructor for objects of class scoreWorld.
     * 
     */
    public gameclear()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    
    public void act()
    {
        showText("GAME CLEAR",110,200);
        //MyWorld.count;
        //showText("score "+MyWorld.count,110,250);
        /*if(count<=250)
        {
            showText("☆☆★",110,250);
        }
        else if(count<=300 && count>250)
        {
            showText("☆★★",110,250);
        }
        else
        {
            showText("★★★",110,250);
        }*/
    }
}
