package chesspieces;

import board.Board;
import board.Position;
import util.Color;

import java.util.List;

/**
 * @author asokol
 *         created 10/25/16
 */
public class Rook extends Piece {

    public Rook(Color color) {
        super(color);
    }

    @Override
    public List<Position> getAvailableMoves(Board board, Position position) {
        return null;
    }

    @Override
    public String toString() {
        return "R";
    }
}
