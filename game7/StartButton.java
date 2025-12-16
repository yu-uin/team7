import greenfoot.*;

public class StartButton extends Actor
{
    public void act()
    {
        
        if (Greenfoot.mouseClicked(this)) {
            
            Greenfoot.setWorld(new MyWorld());
        }
    }
    public StartButton()
    {
           getImage().scale(180, 110);
       }
}