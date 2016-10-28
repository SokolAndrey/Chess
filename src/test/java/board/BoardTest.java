package board;

import org.junit.Before;
import org.junit.Test;


/**
 * @author asokol
 *         created 10/28/16
 */
public class BoardTest {

    private Board board;


    @Before
    public void setUp() throws Exception {

        board = new Board();
    }

    @Test
    public void creating() throws Exception {
        System.out.println(board);
    }

}