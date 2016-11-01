package chesspieces;

import board.Board;
import board.Position;
import util.Color;

import java.util.ArrayList;
import java.util.List;

/**
 * @author asokol
 *         created 10/25/16
 */
public class Pawn extends Piece {


    public Pawn(Color color) {
        super(color);
    }

    @Override
    public List<Position> getAvailableMoves(Board board, Position position) {

        List<Position> moves = new ArrayList<>();

        return null;
    }

    @Override
    public String toString() {
        return "P";
    }
}
