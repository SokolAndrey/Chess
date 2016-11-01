package board;

import lombok.Data;
import lombok.ToString;

/**
 * @author asokol
 *         created 10/25/16
 *         <p>
 *         Describes current possition.
 */
@Data
public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
