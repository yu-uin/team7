import greenfoot.*;

public class TitleWorld extends World
{
    public TitleWorld()
    {    
        // MyWorldと同じサイズにする
        super(600, 400, 1); 
        
        // タイトル文字を表示
        showText("Fruit Catch Game", 300, 150);
        
        // さっき作ったボタンを真ん中に置く
        addObject(new StartButton(), 300, 250);
    }
}