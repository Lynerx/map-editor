package org.academiadecodigo.gitbusters;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.util.ArrayList;

public class Map {

    public static final int PADDING = 10;
    private Square square;
    private Rectangle CANVAS;
    private static ArrayList<Square> allSquares = new ArrayList<>();
    private SpecialOne specialOne;

    public Map(int width, int height) {
        CANVAS = new Rectangle(PADDING, PADDING, width, height);
        CANVAS.draw();

        drawInitialMap();
        specialOne = new SpecialOne(PADDING, PADDING);

    }

    public void drawInitialMap() {

        for (int i = 0; i < CANVAS.getWidth() / Square.SQUARE_SIZE; i++) {
            for (int j = 0; j < CANVAS.getHeight() / Square.SQUARE_SIZE; j++) {
                square = new Square(i * Square.SQUARE_SIZE + PADDING, j * Square.SQUARE_SIZE + PADDING);
                allSquares.add(square);
            }

        }

//        for (int i = PADDING; i < CANVAS.getWidth() - PADDING; i += Square.SQUARE_SIZE) {
//
//            for (int j = PADDING; j < CANVAS.getHeight() - PADDING; j += Square.SQUARE_SIZE) {
//
//                square = new Square(i, j);
//                allSquares.add(square);
//
//            }
//        }
    }

    public static ArrayList<Square> getAllSquares() {
        return allSquares;
    }
}
