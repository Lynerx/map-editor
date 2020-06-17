package org.academiadecodigo.gitbusters;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class SpecialOne {

    private int X;
    private int Y;
    private MyKeyboard myKeyboard;
    Rectangle specialOne;

    public SpecialOne(int X, int Y) {
        this.X = X;
        this.Y = Y;

        specialOne = new Rectangle(X, Y, Square.SQUARE_SIZE, Square.SQUARE_SIZE);
        specialOne.setColor(Color.ORANGE);
        specialOne.fill();

        this.myKeyboard = new MyKeyboard(this);
        myKeyboard.setupKeys();
    }


    public void moveUp(){
        specialOne.translate(0, Square.SQUARE_SIZE);
        System.out.println("move up");
    }

    public void moveDown(){
        specialOne.translate(0, Square.SQUARE_SIZE);
        System.out.println("move down");
    }

    public void moveRight(){
        specialOne.translate(Square.SQUARE_SIZE, 0);
        System.out.println("move right");
    }

    public void moveLeft(){
        specialOne.translate(-Square.SQUARE_SIZE, 0);
        System.out.println("move left");
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
