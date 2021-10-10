public class Cylinder {

    private Circle base;
    private double height;

    public Cylinder(double radius, double height) {
        this.base = new Circle(radius);
        this.height = height;

    }

    public double vol() {
        return base.getArea() * height;
    }

    public double sa() {
        return 2 * base.getArea() + base.getCircumference() * height;
    }
}

/* Output
 * radius = 5 height = 2 volume = 157.07963267948966
 * surface area = 219.9114857512855
 * radius = 8 height = 6 volume = 1206.3715789784806
 * surface area = 703.7167544041137
 */