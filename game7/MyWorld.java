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
    int totalScore = 0;   // スコア
    int timer = 1800;     // タイマー（60回で約1秒なので、1800で約30秒）
    boolean isGameFinished = false;
    

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        // 最初にKenを画面中央下に配置
        
        setBackground("haikei.png");
        addObject(new Ken(), 300, 350);
        
        // 最初のスコア表示
        showText("Score: 0", 50, 25);
        
        showText("Time: 30", 550, 25);
        
       
    }
    
    public void act()
    {
        
        if (isGameFinished == true) {
            // エンターキーが押されたかチェック
            if (Greenfoot.isKeyDown("enter")) {
                // 新しい世界を作ってリセット！
                Greenfoot.setWorld(new TitleWorld());
            }
            // ここで return すると、下の「時間を減らす処理」などは実行されません
            return; 
        }
        // 1. ランダムな確率でAppleを生成する
        if (timer > 0) {
            
            // ★追加★ 時間を減らして表示更新
            timer--; 
            showText("Time: " + (timer / 60), 550, 25);// 100分の2（つまり約2%）の確率で毎フレーム実行
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
        
         if (Greenfoot.getRandomNumber(100) < 2) {
            spawnBig();
        }
         if (Greenfoot.getRandomNumber(100) < 2) {
            spawnSmall();
        }
    
    } else {
            // ★追加★ 時間切れなら、結果判定へ！
            checkResult();
            isGameFinished = true; 
            
            // 再プレイの案内を出す
            showText("Press [ENTER] to Replay", 300, 300);
            
        }
    }
    // Appleを生成する専用のメソッド
    public void spawnBanana()
    {
        Banana banana = new Banana();
        
        // 2. ランダムなX座標（横幅の範囲内）を決める
        int randomX = Greenfoot.getRandomNumber(getWidth());
        
        // 画面の一番上（Y=0）の、ランダムな横位置（X）に追加
        addObject(banana, randomX, 0);
    }
    public void spawnBerry()
    {
        Berry berry = new Berry();
        
        // 2. ランダムなX座標（横幅の範囲内）を決める
        int randomX = Greenfoot.getRandomNumber(getWidth());
        
        // 画面の一番上（Y=0）の、ランダムな横位置（X）に追加
        addObject(berry, randomX, 0);
    }
    public void spawnOrange()
    {
        Orange orange = new Orange();
        
        // 2. ランダムなX座標（横幅の範囲内）を決める
        int randomX = Greenfoot.getRandomNumber(getWidth());
        
        // 画面の一番上（Y=0）の、ランダムな横位置（X）に追加
        addObject(orange, randomX, 0);
    }
    public void spawnPeach()
    {
        Peach peach = new Peach();
        
        // 2. ランダムなX座標（横幅の範囲内）を決める
        int randomX = Greenfoot.getRandomNumber(getWidth());
        
        // 画面の一番上（Y=0）の、ランダムな横位置（X）に追加
        addObject(peach, randomX, 0);
    }
    public void spawnBig()
    {
        Big big = new Big();
        
        // 2. ランダムなX座標（横幅の範囲内）を決める
        int randomX = Greenfoot.getRandomNumber(getWidth());
        
        // 画面の一番上（Y=0）の、ランダムな横位置（X）に追加
        addObject(big, randomX, 0);
    }
    public void spawnSmall()
    {
        Small small = new Small();
        
        // 2. ランダムなX座標（横幅の範囲内）を決める
        int randomX = Greenfoot.getRandomNumber(getWidth());
        
        // 画面の一番上（Y=0）の、ランダムな横位置（X）に追加
        addObject(small, randomX, 0);
    }
    public void addScore(int points)
    {
        
        
        totalScore = totalScore + points;
        showText("Score: " + totalScore, 50, 25);
    }
    
    // ★追加★ 結果を判定するメソッド
    public void checkResult()
{
    // ゲームオーバー判定 (200点未満)
    if (totalScore < 200) {
        // ▼▼▼ 背景をゲームオーバー画像に変える ▼▼▼
        // ※ "gameover.png" の部分は、あなたが用意した画像ファイル名にしてください
        GreenfootImage bg = new GreenfootImage("gameover.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        
        showText("GAME OVER", 300, 200);
        showText("Try Again...", 300, 240);
    } 
    // クリア判定 (200点以上)
    else {
        // ▼▼▼ 背景をクリア画像に変える ▼▼▼
      // 1. 画像を読み込む
        GreenfootImage bg = new GreenfootImage("clear.png");
        
        // 2. 画面サイズに合わせてリサイズする
        bg.scale(getWidth(), getHeight());
        
        // 3. 背景に設定する
        setBackground(bg);
        String rank = "";
        
        // ランク判定
        if (totalScore <= 250) {
            rank = "★";         // 200〜250
        } else if (totalScore <= 300) {
            rank = "★★";        // 251〜300
        } else {
            rank = "★★★";       // 301以上
        }
        
        showText("GAME CLEAR!!", 300, 200);
        showText("Rank: " + rank, 300, 240);
    }
}
}
