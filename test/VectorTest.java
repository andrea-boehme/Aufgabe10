import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VectorTest {

    private final Double DELTA = 0.001;

    @Test
    void add() {
        Vector v1 = new Vector(2,3,4);
        Vector v2 = new Vector(5,6,7);
        Vector v3 = v1.add(v2);

        assertEquals(v3.getX(), 7.0, DELTA);
        assertEquals(v3.getY(), 9.0, DELTA);
        assertEquals(v3.getZ(), 11.0, DELTA);
    }

    @Test
    void subtract() {
        Vector v1 = new Vector(2,3,4);
        Vector v2 = new Vector(5,6,7);
        Vector v3 = v1.subtract(v2);

        assertEquals(v3.getX(), -3.0, DELTA);
        assertEquals(v3.getY(), -3.0, DELTA);
        assertEquals(v3.getZ(), -3.0, DELTA);
    }

    @Test
    void scalar() {
        Vector v1 = new Vector(2,3,4);
        Vector v2 = new Vector(5,6,7);
        Double v3 = v1.scalar(v2);

        assertEquals(v3, 56.0, DELTA);
    }

    @Test
    void cross() {
        Vector v1 = new Vector(2,3,4);
        Vector v2 = new Vector(5,6,7);
        Vector v3 = v1.cross(v2);

        assertEquals(-3, v3.getX(), DELTA);
        assertEquals(6, v3.getY(), DELTA);
        assertEquals(-3, v3.getZ(), DELTA);
    }

    @Test
    void length() {
        Vector v1 = new Vector(2,3,4);
        Vector v2 = new Vector(5,6,7);
        double v3 = v1.length(v2);

        assertEquals(v3, 10.488088481701515, DELTA);
    }
}