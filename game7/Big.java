import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Big here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Big extends Poison
{
     private int score; // このリンゴの点数
    public Big()
    {
        // ここで点数を固定します（例：常に100点）
        score = -180;
        
        getImage().scale(80, 80);
    }
    public int getScore()
    {
        return score;
    }
    public void act() 
    {
        setLocation(getX(), getY() + 3);
        
        // 2. 画面の下端（Worldの高さ）に到達したら消える
        // getWorld()がnullでないことを確認してから処理します
        if (getWorld() != null && getY() >= getWorld().getHeight() - 1) {
            getWorld().removeObject(this);
        }
        
      
    }    
}
