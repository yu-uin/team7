import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameover extends World
{
  private GreenfootSound bgm = new GreenfootSound("230_BPM166.mp3"); // ファイル名を変更
    /**
     * Constructor for objects of class gameover.
     * 
     */
    public gameover()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    public void act()
    {
        showText("GAME OVER",110,200);
        Greenfoot.playSound("304_BPM120.mp3");
        //MyWorld.count;
        //showText("score "+MyWorld.count,110,250);
    }
}
