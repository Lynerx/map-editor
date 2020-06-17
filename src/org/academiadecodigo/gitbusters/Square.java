package org.academiadecodigo.gitbusters;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Square {

    private Rectangle square;
    public static final int SQUARE_SIZE = 32;
    private int posX;
    private int posY;
    private boolean isPainted;

    public Square(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
        square = new Rectangle(posX, posY, SQUARE_SIZE, SQUARE_SIZE);
        square.draw();
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public void setColor(Color color) {
        this.square.setColor(color);
    }

    public void fill() {
        this.square.fill();
    }

    public boolean isPainted() {
        return isPainted;
    }

    public void setPainted(boolean painted) {
        isPainted = painted;
    }
}
