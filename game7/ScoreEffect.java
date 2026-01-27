import greenfoot.*;

public class ScoreEffect extends Actor {
    private int timer = 50; // 表示する時間（約0.5秒〜1秒）

    public ScoreEffect(int score) {
        // 見た目を作成：黄色い文字、サイズ24、背景は透明
        setImage(new GreenfootImage("+" + score, 24, Color.YELLOW, new Color(0,0,0,0)));
    }

    public void act() {
        timer--;
        setLocation(getX(), getY() - 1); // 浮かび上がる演出
        
        if (timer <= 0) {
            getWorld().removeObject(this); // 時間がきたら消える
        }
    }
}