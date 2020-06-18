package org.academiadecodigo.gitbusters;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

import java.io.IOException;

public class MyKeyboard implements KeyboardHandler {

    private SpecialOne specialOne;

    public MyKeyboard(SpecialOne specialOne) {
        this.specialOne = specialOne;
    }

    public void setupKeys() {

        Keyboard keyboard = new Keyboard(this);

        KeyboardEvent rightArrow = new KeyboardEvent();
        rightArrow.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        rightArrow.setKey(KeyboardEvent.KEY_RIGHT);
        keyboard.addEventListener(rightArrow);

        KeyboardEvent leftArrow = new KeyboardEvent();
        leftArrow.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        leftArrow.setKey(KeyboardEvent.KEY_LEFT);
        keyboard.addEventListener(leftArrow);

        KeyboardEvent upArrow = new KeyboardEvent();
        upArrow.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        upArrow.setKey(KeyboardEvent.KEY_UP);
        keyboard.addEventListener(upArrow);

        KeyboardEvent downArrow = new KeyboardEvent();
        downArrow.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        downArrow.setKey(KeyboardEvent.KEY_DOWN);
        keyboard.addEventListener(downArrow);

        KeyboardEvent space = new KeyboardEvent();
        space.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        space.setKey(KeyboardEvent.KEY_SPACE);
        keyboard.addEventListener(space);

        KeyboardEvent C_Key = new KeyboardEvent();
        C_Key.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        C_Key.setKey(KeyboardEvent.KEY_C);
        keyboard.addEventListener(C_Key);

        KeyboardEvent L_Key = new KeyboardEvent();
        L_Key.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        L_Key.setKey(KeyboardEvent.KEY_L);
        keyboard.addEventListener(L_Key);

        KeyboardEvent S_Key = new KeyboardEvent();
        S_Key.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        S_Key.setKey(KeyboardEvent.KEY_S);
        keyboard.addEventListener(S_Key);
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {

            case KeyboardEvent.KEY_RIGHT:
                specialOne.moveRight();
                break;

            case KeyboardEvent.KEY_LEFT:
                specialOne.moveLeft();
                break;

            case KeyboardEvent.KEY_UP:
                specialOne.moveUp();
                break;

            case KeyboardEvent.KEY_DOWN:
                specialOne.moveDown();
                break;

            case KeyboardEvent.KEY_SPACE:
                specialOne.paintSquare();
                break;

            case KeyboardEvent.KEY_C:
                Map.clearMap();
                break;

            case KeyboardEvent.KEY_S:
                try {
                    Map.saveMap();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                break;

            case KeyboardEvent.KEY_L:
                try {
                    Map.loadMap();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {


    }

}
