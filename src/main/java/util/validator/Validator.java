package util.validator;

import board.Board;

import java.util.Random;

/**
 * @author asokol
 *         created 10/25/16
 */
public class Validator {

    private static Random random = new Random();

    public static boolean isCheck(Board board) {
        return random.nextBoolean();
    }

    public static boolean isMate(Board board) {
        return false;
    }
}
