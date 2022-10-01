package uet.oop.bomberman.entities;

import javafx.scene.SnapshotParameters;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import  javafx.scene.input.KeyEvent;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import uet.oop.bomberman.graphics.Sprite;

import javax.xml.bind.SchemaOutputResolver;
import java.security.Key;
import java.util.List;


public class Bomber extends Entity {
    protected final int speedBomber =  3;

    KeyCode keyCode;

    public Bomber(int x, int y, Image img) {
        super( x, y, img);
    }

    @Override
    public void update() {
        if (keyCode==KeyCode.RIGHT){
            x++;
        }
        if (keyCode==KeyCode.LEFT){
            x--;
        }
        if (keyCode==KeyCode.UP){
            y--;
        }
        if (keyCode==KeyCode.DOWN){
            y++;
        }
    }

    public void handle(KeyCode keyCode){
        this.keyCode=keyCode;
        System.out.println(this.keyCode);
    }

    public void moving(){
        System.out.println("moving");
        if (keyCode.equals(KeyCode.RIGHT)){
            x+=speedBomber;
        }
        if (keyCode==KeyCode.LEFT){
            x-=speedBomber;
        }
        if (keyCode==KeyCode.UP){
            y-=speedBomber;
        }
        if (keyCode==KeyCode.DOWN){
            y+=speedBomber;
        }

    }

    public void moveUp(){
        y -= speedBomber;
    }
    public void moveDown(){
        y += speedBomber;
    }
    public void moveLeft(){
        x -= speedBomber;
    }
    public void moveRight(){
        x += speedBomber;
    }


    public void render(GraphicsContext gc, List<Entity> entities) {
        Entity bomberman = new Bomber(1, 1, Sprite.player_right.getFxImage());
        entities.add(bomberman);
    }
}
