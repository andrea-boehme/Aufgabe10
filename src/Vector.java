public class Vector {

    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    };

    public double getY() {
        return y;
    };

    public double getZ() {
        return z;
    };

    public Vector add(Vector v) {
        double x_result = x + v.getX();
        double y_result = y + v.getY();
        double z_result = z + v.getZ();

        return new Vector(x_result, y_result, z_result);
    }

    public Vector subtract(Vector v) {
        double x_result = x - v.getX();
        double y_result = y - v.getY();
        double z_result = z - v.getZ();

        return new Vector(x_result, y_result, z_result);
    }

    public double scalar(Vector v) {
        final double x_result = x * v.getX();
        final double y_result = y * v.getY();
        final double z_result = z * v.getZ();
        return x_result + y_result + z_result;
    }

    public Vector cross(Vector v) {
        final double x_result = y * v.getZ() - z * v.getY();
        final double y_result = z * v.getX() - x * v.getZ();
        final double z_result = x * v.getY() - y * v.getX();

        return new Vector(x_result, y_result, z_result);
    }

    public double length(Vector v) {
        return Math.sqrt(Math.pow(v.getX(), 2) + Math.pow(v.getY(), 2) + Math.pow(v.getZ(), 2));
    }



    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
