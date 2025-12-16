import greenfoot.*;

public class TitleWorld extends World
{
    public TitleWorld()
    {    
       
        super(600, 400, 1); 
        
        
        showText("Fruit Catch Game", 300, 150);
        
        
        addObject(new StartButton(), 300, 250);
    }
}