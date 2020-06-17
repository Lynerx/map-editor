package org.academiadecodigo.gitbusters;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class MyKeyboard implements KeyboardHandler {

    private SpecialOne  specialOne;

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
//            case KeyboardEvent.KEY_SPACE -> ;
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

}
