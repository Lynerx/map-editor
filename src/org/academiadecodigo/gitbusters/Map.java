package org.academiadecodigo.gitbusters;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Map {

    public static final int PADDING = 10;
    private static int width;
    private static int height;
    private static Rectangle CANVAS;
    private Square square;
    private SpecialOne specialOne;
    private static ArrayList<Square> allSquares = new ArrayList<>();
    private static BufferedWriter bufferedWriter;
    private static BufferedReader bufferedReader;
    private static String filePath = "resources/mapData.txt";

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

    public static void saveMap() throws IOException {

        try {
            File dataFile = new File(filePath);

            if (!dataFile.exists()) {
                dataFile.createNewFile();
            }

            bufferedWriter = new BufferedWriter(new FileWriter(dataFile));
            bufferedReader = new BufferedReader(new FileReader(dataFile));

            for (Square square : getAllSquares()) {
                bufferedWriter.write(square.toString());
//                bufferedWriter.newLine();
            }

            bufferedWriter.flush();

        } catch (IOException ioException) {
            ioException.printStackTrace();

        } finally {

            if (bufferedWriter != null) {
                bufferedWriter.close();
            }

        }
    }

    public static void loadMap() throws IOException {

        try {

            String line;
            String currentLine = "";

            while ((line = bufferedReader.readLine()) != null) {
                currentLine += line + "\n";
            }

            for (int i = 0; i < currentLine.split("").length; i++) {
                if (currentLine.split("")[i].equals("1")) {
                    allSquares.get(i).setColor(Color.BLACK);
                    allSquares.get(i).fill();
                    allSquares.get(i).setPainted(true);
                }
            }

        } catch (IOException ioException) {
            ioException.printStackTrace();

        } finally {

            if (bufferedReader != null) {
                bufferedReader.close();
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
