package uet.oop.bomberman.entities.ennemy;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import uet.oop.bomberman.entities.Entity;
import uet.oop.bomberman.graphics.Sprite;

public class Enemy extends Entity {


    public Enemy(int xUnit, int yUnit, Image img) {
        super(xUnit, yUnit, img);
    }


    public void render(GraphicsContext gc){
        gc.drawImage(img, x, y);
    }

    @Override
    public void update() {

    }
}