package chesspieces;

import board.Position;
import util.Color;

import java.util.List;

/**
 * @author asokol
 *         created 10/25/16
 */

public abstract class Piece {
    Color color;

    public Piece(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract List<Position> getAvailableMoves(Position position);

}
