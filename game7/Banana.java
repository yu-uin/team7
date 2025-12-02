import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Banana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banana extends Fruit
{
    /**
     * Act - do whatever the Banana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int score; // このリンゴの点数
    public Banana()
    {
        // ここで点数を固定します（例：常に100点）
        score = 50;
    }
    public int getScore()
    {
        return score;
    }
    
    

    // 点数を返すメソッド
  
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
