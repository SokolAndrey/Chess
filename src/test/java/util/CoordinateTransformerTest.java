package util;

import board.Position;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

/**
 * @author asokol
 *         created 11/1/16
 */
public class CoordinateTransformerTest {

    private Position positionB1 = new Position(1, 0);
    private Position positionE2 = new Position(4, 1);
    private Position fromNotationB1;
    private Position lowerCaseE2;

    @Before
    public void setUp() throws Exception {
        fromNotationB1 = CoordinateTransformer.transformIntoPosition("B1");
        lowerCaseE2 = CoordinateTransformer.transformIntoPosition("e2");
    }

    @Test
    public void transformIntoPosition() throws Exception {
        Assert.assertThat(fromNotationB1, is(positionB1));
    }

    @Test
    public void lowerCase() throws Exception {
        Assert.assertThat(lowerCaseE2, is(positionE2));
    }

}