import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    int totalScore = 0;   
    int timer = 1800;     
    boolean isGameFinished = false;
    

    public MyWorld()
    {    
        
        super(600, 400, 1); 
        
        
        setBackground("haikei.png");
        addObject(new Ken(), 300, 350);
        
        
        showText("Score: 0", 50, 25);
        
        showText("Time: 30", 550, 25);
        
       
    }
    
    public void act()
    {
        
        if (isGameFinished == true) {
            
            if (Greenfoot.isKeyDown("enter")) {
               
                Greenfoot.setWorld(new TitleWorld());
            }
           
            return; 
        }
       
        if (timer > 0) {
            
           
            timer--; 
            showText("Time: " + (timer / 60), 550, 25);
        if (Greenfoot.getRandomNumber(100) < 2) {
            spawnBanana();
        }
         if (Greenfoot.getRandomNumber(100) < 2) {
            spawnBerry();
        }
         if (Greenfoot.getRandomNumber(100) < 2) {
            spawnOrange();
        }
         if (Greenfoot.getRandomNumber(100) < 2) {
            spawnPeach();
        }
        
         if (Greenfoot.getRandomNumber(100) < 1) {
            spawnBig();
        }
         if (Greenfoot.getRandomNumber(100) < 1) {
            spawnSmall();
        }
    
    } else {
            
            checkResult();
            isGameFinished = true; 
            
            
            showText("Press [ENTER] to Replay", 300, 300);
            
        }
        
    }
    
    public void spawnBanana()
    {
        Banana banana = new Banana();
        
        
        int randomX = Greenfoot.getRandomNumber(getWidth());
        
        
        addObject(banana, randomX, 0);
    }
    public void spawnBerry()
    {
        Berry berry = new Berry();
        
        
        int randomX = Greenfoot.getRandomNumber(getWidth());
        
        
        addObject(berry, randomX, 0);
    }
    public void spawnOrange()
    {
        Orange orange = new Orange();
        
        
        int randomX = Greenfoot.getRandomNumber(getWidth());
        
        
        addObject(orange, randomX, 0);
    }
    public void spawnPeach()
    {
        Peach peach = new Peach();
        
        
        int randomX = Greenfoot.getRandomNumber(getWidth());
        
        
        addObject(peach, randomX, 0);
    }
    public void spawnBig()
    {
        Big big = new Big();
        
        
        int randomX = Greenfoot.getRandomNumber(getWidth());
        
        
        addObject(big, randomX, 0);
    }
    public void spawnSmall()
    {
        Small small = new Small();
        
        
        int randomX = Greenfoot.getRandomNumber(getWidth());
        
        
        addObject(small, randomX, 0);
    }
    public void addScore(int points)
    {
        
        
        totalScore = totalScore + points;
        showText("Score: " + totalScore, 50, 25);
    }
    
    
    public void checkResult()
{
    removeObjects(getObjects(null));
    
    // ゲームオーバー判定 (200点未満)

    if (totalScore < 200) {
        
        GreenfootImage bg = new GreenfootImage("gameover.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        
        showText("GAME OVER", 300, 200);
        showText("Try Again...", 300, 240);
    } 
    
    else {
       
        GreenfootImage bg = new GreenfootImage("clear.png");
        
        
        bg.scale(getWidth(), getHeight());
        
        
        setBackground(bg);
        String rank = "";
        
        
        if (totalScore <= 250) {
            rank = "★";         
        } else if (totalScore <= 300) {
            rank = "★★";       
        } else {
            rank = "★★★";       
        }
        
        showText("GAME CLEAR!!", 300, 200);
        showText("Rank: " + rank, 300, 240);
    }
    
    
}
public void spawnFruits()
{
    int x = Greenfoot.getRandomNumber(getWidth());
    Actor item = null;
    
    int r = Greenfoot.getRandomNumber(100);
    
    // ■ ここで生成と同時にサイズを指定します
    if (r < 1) {
        item = new Small();
        item.getImage().scale(20, 20);  // Smallは20x20にする
    } 
    else if (r < 3) {
        item = new Peach();
        item.getImage().scale(50, 50);  // Peachは50x50にする
    }
    else if (r < 10) {
        item = new Big();
        item.getImage().scale(80, 80);  // Bigは80x80にする
    }
    else if (r < 20) {
        item = new Berry();
        item.getImage().scale(50, 50);  // Berryは30x30にする
    }
    else if (r < 40) {
        item = new Banana();
        item.getImage().scale(60, 40);  // Bananaは横長にする
    }
    else if (r < 60) {
        item = new Orange();
        item.getImage().scale(45, 45);  // Orangeは45x45にする
    }
    else {
        item = new Peach();
        item.getImage().scale(40, 40);  // 普通のAppleは40x40にする
    }
    
    // 画面に追加
    addObject(item, x, 0);
}

}
