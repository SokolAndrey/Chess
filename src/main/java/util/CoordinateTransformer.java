package util;

import board.Position;
import exceptions.ChessException;
import exceptions.SyntaxException;

/**
 * @author asokol
 *         created 11/1/16
 *         <p>
 *         Allows to use coordinate noration to make a move.
 *         E2-E4, for example.
 */
public class CoordinateTransformer {

    public static Position transformIntoPosition(String position) throws SyntaxException {
        String tmp = position.trim().toUpperCase();
        if (position.length() != 2) {
            throw new SyntaxException("The position should look like E2. " +
                    tmp + " is not acceptable.");
        }
        int x;
        int y;
        switch (tmp.charAt(0)) {
            case 'A':
                x = 0;
                break;
            case 'B':
                x = 1;
                break;
            case 'C':
                x = 2;
                break;
            case 'D':
                x = 3;
                break;
            case 'E':
                x = 4;
                break;
            case 'F':
                x = 5;
                break;
            case 'G':
                x = 6;
                break;
            case 'H':
                x = 7;
                break;
            default:
                throw new SyntaxException("The x-coordinate may vary from A to H. " +
                        tmp + " is not acceptable.");
        }

        y = new Integer(tmp.substring(1)) - 1;
        if (y < 0 || y > 7) {
            throw new SyntaxException("The y-coordinate may vary from 1 to 8" +
                    tmp + " is not acceptable.");
        }
        return new Position(x, y);
    }

}
