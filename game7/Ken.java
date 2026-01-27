import greenfoot.*;

public class Ken extends Actor
{
    public Ken()
    {
           getImage().scale(75, 75);
       }


    public void act()
    {
        moveKen();
        checkCollision();
    }
    
    
    public void moveKen()
    {
        if (Greenfoot.isKeyDown("left")) {
            move(-5);
        }
        if (Greenfoot.isKeyDown("right")) {
            move(5);
        }
    }
    
   
    public void checkCollision()
{
    
    Actor banana = getOneIntersectingObject(Banana.class);
    if (banana != null) {
        Banana item = (Banana) banana;    
        int points = item.getScore();     
        collectItem(item, points); 
        return; 
    }


    Actor berry = getOneIntersectingObject(Berry.class);
    if (berry != null) {
        Berry item = (Berry) berry;
        int points = item.getScore();
        collectItem(item, points);
        return;
    }

    
    Actor orange = getOneIntersectingObject(Orange.class);
    if (orange != null) {
        Orange item = (Orange) orange;
        int points = item.getScore();
        collectItem(item, points);
        return;
    }

    
    Actor peach = getOneIntersectingObject(Peach.class);
    if (peach != null) {
        Peach item = (Peach) peach;
        int points = item.getScore();
        collectItem(item, points);
        return;
    }

    
    Actor big = getOneIntersectingObject(Big.class);
    if (big != null) {
        Big item = (Big) big;
        int points = item.getScore();
        collectItem(item, points);
        return;
    }

    
    Actor small = getOneIntersectingObject(Small.class);
    if (small != null) {
        Small item = (Small) small;
        int points = item.getScore();
        collectItem(item, points);
        return;
    }
}



public void collectItem(Actor item, int points)
{
    MyWorld world = (MyWorld) getWorld();
    
    
    if (world != null) {
        world.addScore(points);
        
       
        world.removeObject(item);
        
        
    }
}
}