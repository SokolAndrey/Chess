package board;

import chesspieces.Bishop;
import chesspieces.King;
import chesspieces.Knight;
import chesspieces.Pawn;
import chesspieces.Piece;
import chesspieces.Queen;
import chesspieces.Rook;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.stream.Collectors;

import static util.Color.BLACK;
import static util.Color.WHITE;

/**
 * @author asokol
 *         created 10/25/16
 *         <p>
 *         A game board.
 *         Contains NxN cells({@link Cell}), each of them contains a piece(@link {@link Piece}) and coordinates(@link {@link Position}).
 */
public class Board {

    private final static int N = 8;

    private Cell[][] cells = new Cell[N][N];

    @Setter
    @Getter
    private Position whiteKingPosition;

    @Setter
    @Getter
    private Position blackKingPosition;

    public Board() {
        initBoard();
    }


    private void initBoard() {
        initCells();
        setPieces();
    }

    private void initCells() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                Cell cell = new Cell();
                cell.setColor((i + j) % 2 == 0 ? BLACK : WHITE);
                cells[i][j] = cell;
            }
        }
    }

    private void setPieces() {
        cells[0][0].setPiece(new Rook(WHITE));
        cells[0][7].setPiece(new Rook(WHITE));
        cells[7][0].setPiece(new Rook(BLACK));
        cells[7][7].setPiece(new Rook(BLACK));

        cells[0][1].setPiece(new Knight(WHITE));
        cells[0][6].setPiece(new Knight(WHITE));
        cells[7][1].setPiece(new Knight(BLACK));
        cells[7][6].setPiece(new Knight(BLACK));

        cells[0][2].setPiece(new Bishop(WHITE));
        cells[0][5].setPiece(new Bishop(WHITE));
        cells[7][2].setPiece(new Bishop(BLACK));
        cells[7][5].setPiece(new Bishop(BLACK));

        cells[0][3].setPiece(new Queen(WHITE));
        cells[0][4].setPiece(new King(WHITE));
        whiteKingPosition = new Position(0, 4);
        cells[7][3].setPiece(new Queen(BLACK));
        cells[7][4].setPiece(new King(BLACK));
        blackKingPosition = new Position(7, 4);

        for (int i = 0; i < N; i++) {
            cells[1][i].setPiece(new Pawn(WHITE));
            cells[6][i].setPiece(new Pawn(BLACK));
        }
    }


    public Cell getPosition(int x, int y) {
        return cells[x][y];
    }

    public Cell getPosition(String coordinate) {
        return null;
    }


    public String toString() {
        return Arrays.stream(cells)
                .map(line -> Arrays.stream(line)
                        .map(cell -> {
                            String res = null;
                            if (cell.getPiece() == null) {
                                res = cell.getColor() == BLACK ? "B" : "W";
                            } else {
                                res = cell.getPiece().toString();
                            }
                            return res;
                        })
                        .collect(Collectors.joining("_")))
                .collect(Collectors.joining("\n")) +
                "\nwhite king is here: " + whiteKingPosition +
                "\nblack king is here: " + blackKingPosition;
    }

}
