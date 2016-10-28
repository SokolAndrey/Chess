package board;

import chesspieces.Piece;
import lombok.Data;
import util.Color;

/**
 * @author asokol
 *         created 10/28/16
 *         <p>
 *         Describes a cell in a game board.
 */
@Data
public class Cell {
    Piece piece;
    Color color;

}
