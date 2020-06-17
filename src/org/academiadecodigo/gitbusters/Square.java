package org.academiadecodigo.gitbusters;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Square {

    private Rectangle square;
    public static final int SQUARE_SIZE = 32;

    public Square(int posX, int posY){
        square = new Rectangle(posX, posY, SQUARE_SIZE, SQUARE_SIZE);
        square.draw();
    }


}
