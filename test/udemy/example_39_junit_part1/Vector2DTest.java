package udemy.example_39_junit_part1;

import org.junit.Assert;
import org.junit.Test;
import udemy.example_39_junit_part1.Vector2D;

public class Vector2DTest {
    @Test
    public void newVectorShouldHaveZeroLength() {
        Vector2D v1 = new Vector2D();

        Assert.assertEquals(0, v1.length(), 1e-9);
    }

    @Test
    public void newVectorShouldHaveZeroX() {
        Vector2D v1 = new Vector2D();

        Assert.assertEquals(0, v1.getX(), 1e-9);
    }

    @Test
    public void newVectorShouldHaveZeroY() {
        Vector2D v1 = new Vector2D();

        Assert.assertEquals(0, v1.getY(), 1e-9);
    }
}
