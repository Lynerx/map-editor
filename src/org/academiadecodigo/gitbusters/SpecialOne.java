package org.academiadecodigo.gitbusters;

import org.academiadecodigo.simplegraphics.graphics.Color;

public class SpecialOne {

    private int X;
    private int Y;

    public SpecialOne(int X, int Y) {
        this.X = X;
        this.Y = Y;
        Square specialOne = new Square(X, Y);
        specialOne.setColor(Color.ORANGE);
        specialOne.fill();
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }
}
