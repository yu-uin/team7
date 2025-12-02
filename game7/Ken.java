import greenfoot.*;

public class Ken extends Actor
{
    public void act()
    {
        moveKen();
        checkCollision();
    }
    
    // 移動のコード
    public void moveKen()
    {
        if (Greenfoot.isKeyDown("left")) {
            move(-5);
        }
        if (Greenfoot.isKeyDown("right")) {
            move(5);
        }
    }
    
    // 当たり判定のコード
    public void checkCollision()
{
    // 1. バナナ (Banana) との判定
    Actor banana = getOneIntersectingObject(Banana.class);
    if (banana != null) {
        Banana item = (Banana) banana;    // バナナとして扱う
        int points = item.getScore();     // 点数を取る
        collectItem(item, points);        // 共通の処理へ（下で説明）
        return; // 1つ拾ったら、この回の処理は終わり
    }

    // 2. ベリー (Berry) との判定
    Actor berry = getOneIntersectingObject(Berry.class);
    if (berry != null) {
        Berry item = (Berry) berry;
        int points = item.getScore();
        collectItem(item, points);
        return;
    }

    // 3. オレンジ (Orange) との判定
    Actor orange = getOneIntersectingObject(Orange.class);
    if (orange != null) {
        Orange item = (Orange) orange;
        int points = item.getScore();
        collectItem(item, points);
        return;
    }

    // 4. ピーチ (Peach) との判定
    Actor peach = getOneIntersectingObject(Peach.class);
    if (peach != null) {
        Peach item = (Peach) peach;
        int points = item.getScore();
        collectItem(item, points);
        return;
    }

    // 5. Big との判定
    Actor big = getOneIntersectingObject(Big.class);
    if (big != null) {
        Big item = (Big) big;
        int points = item.getScore();
        collectItem(item, points);
        return;
    }

    // 6. Small との判定
    Actor small = getOneIntersectingObject(Small.class);
    if (small != null) {
        Small item = (Small) small;
        int points = item.getScore();
        collectItem(item, points);
        return;
    }
}

// ■共通の処理を行うメソッド（同じクラスの最後に追加してください）
// 「アイテムを消して、点数を足す」という作業は全員同じなのでまとめました
public void collectItem(Actor item, int points)
{
    MyWorld world = (MyWorld) getWorld();
    
    // 点数を加算
    if (world != null) {
        world.addScore(points);
        
        // オブジェクトを消す
        world.removeObject(item);
        
        // 音を鳴らす（必要ならコメントを外す）
        // Greenfoot.playSound("eat.wav");
    }
}
}