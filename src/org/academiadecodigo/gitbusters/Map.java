package org.academiadecodigo.gitbusters;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.util.ArrayList;

public class Map {

    public static final int PADDING = 10;
    private Square square;

    private Rectangle CANVAS;
    private ArrayList<Square> allSquares;

    public Map(int width, int height) {
        CANVAS = new Rectangle(PADDING, PADDING, width, height);
        CANVAS.draw();

//        square = new Square(PADDING, PADDING);
        drawInitialMap();
    }

    public void drawInitialMap() {
        allSquares = new ArrayList<>();

        for (int i = 10; i < CANVAS.getWidth() - PADDING; i+=Square.SQUARE_SIZE) {
            for (int j = 10; j < CANVAS.getHeight()- PADDING; j+=Square.SQUARE_SIZE) {
                square = new Square(i, j);
                allSquares.add(square);

            }

        }


    }

}
