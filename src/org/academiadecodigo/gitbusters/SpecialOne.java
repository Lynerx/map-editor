package org.academiadecodigo.gitbusters;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class SpecialOne {

    private int X;
    private int Y;
    private MyKeyboard myKeyboard;
    private Rectangle specialOne;
//    private Color HOT_PINK = new Color(255, 20, 147);

    public SpecialOne(int X, int Y) {
        this.X = X;
        this.Y = Y;

        specialOne = new Rectangle(X, Y, Square.SQUARE_SIZE, Square.SQUARE_SIZE);
        specialOne.setColor(Color.BLACK);
        specialOne.fill();

        this.myKeyboard = new MyKeyboard(this);
        myKeyboard.setupKeys();
    }

    public void moveUp() {
        specialOne.translate(0, -Square.SQUARE_SIZE);
        setY(getY() - Square.SQUARE_SIZE);
    }

    public void moveDown() {
        specialOne.translate(0, Square.SQUARE_SIZE);
        setY(getY() + Square.SQUARE_SIZE);
    }

    public void moveRight() {
        specialOne.translate(Square.SQUARE_SIZE, 0);
        setX(getX() + Square.SQUARE_SIZE);
    }

    public void moveLeft() {
        specialOne.translate(-Square.SQUARE_SIZE, 0);
        setX(getX() - Square.SQUARE_SIZE);
    }

    public void paintSquare() {

        for (Square sqr : Map.getAllSquares()) {
            if ((specialOne.getX() == sqr.getPosX()) && (specialOne.getY() == sqr.getPosY())) {

                if (sqr.isPainted()) {
                    sqr.delete();
                    sqr.draw();
                    sqr.setPainted(false);

                } else {
                    sqr.setColor(Color.BLACK);
                    sqr.fill();
                    sqr.setPainted(true);
                }
            }
        }
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
