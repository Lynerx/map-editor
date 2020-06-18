package org.academiadecodigo.gitbusters;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.util.ArrayList;

public class Map {

    public static final int PADDING = 10;
    private static int width;
    private static int height;
    private static Rectangle CANVAS;
    private Square square;
    private SpecialOne specialOne;
    private static ArrayList<Square> allSquares = new ArrayList<>();

    public Map(int width, int height) {
        Map.width = width;
        Map.height = height;

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
    }

    public static void clearMap() {
        for (Square square : getAllSquares()) {
            if (square.isPainted()) {
                square.delete();
                square.draw();
                square.setPainted(false);
            }
        }
    }

    public static ArrayList<Square> getAllSquares() {
        return allSquares;
    }

    public static int getWidth() {
        return width;
    }

    public static int getHeight() {
        return height;
    }
}
