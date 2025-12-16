import greenfoot.*;

public class TitleWorld extends World
{
    public TitleWorld()
    {    
       
        super(600, 400, 1); 
        
        addObject(new StartButton(), 300, 275);
    }
}