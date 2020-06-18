package org.academiadecodigo.gitbusters;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class SpecialOne {


    private MyKeyboard myKeyboard;
    private Rectangle specialOne;

    public SpecialOne(int X, int Y) {

        specialOne = new Rectangle(X, Y, Square.SQUARE_SIZE, Square.SQUARE_SIZE);
        specialOne.setColor(Color.BLACK);
        specialOne.fill();

        this.myKeyboard = new MyKeyboard(this);
        myKeyboard.setupKeys();
    }

    public void moveUp() {
        if (!(getY() == 10)) {
            specialOne.translate(0, -Square.SQUARE_SIZE);
        }
    }

    public void moveDown() {
        if (!(getY() == Map.getHeight() - 22)) {
            specialOne.translate(0, Square.SQUARE_SIZE);
        }
    }

    public void moveRight() {
        if (!(getX() == Map.getWidth() - 22)) {
            specialOne.translate(Square.SQUARE_SIZE, 0);
        }
    }

    public void moveLeft() {
        if (!(getX() == 10)) {
            specialOne.translate(-Square.SQUARE_SIZE, 0);

        }
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
        return specialOne.getX();
    }

    public int getY() {
        return specialOne.getY();
    }

}
