import greenfoot.*;

public class StartButton extends Actor
{
    public void act()
    {
        // もしこのボタンがクリックされたら...
        if (Greenfoot.mouseClicked(this)) {
            // ゲームの世界 (MyWorld) に切り替える！
            Greenfoot.setWorld(new MyWorld());
        }
    }
}