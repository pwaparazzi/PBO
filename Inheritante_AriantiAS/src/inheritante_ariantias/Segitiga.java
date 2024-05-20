package inheritante_ariantias;

public class Segitiga extends ObjekGeometris {
    double sisi1, sisi2, sisi3;

    public Segitiga() {
        sisi1 = 1.0;
        sisi2 = 1.0;
        sisi3 = 1.0;
    }

    public Segitiga(double sisi1, double sisi2, double sisi3) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    public Segitiga(double sisi1, double sisi2, double sisi3, String warna, boolean filled) {
        super(warna, filled);
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    public double getSisi1() {
        return sisi1;
    }

    public double getSisi2() {
        return sisi2;
    }

    public double getSisi3() {
        return sisi3;
    }

    public void setSisi1(double sisi1) {
        this.sisi1 = sisi1;
    }

    public void setSisi2(double sisi2) {
        this.sisi2 = sisi2;
    }

    public void setSisi3(double sisi3) {
        this.sisi3 = sisi3;
    }

    @Override
    public double getArea() {
        double s = (sisi1 + sisi2 + sisi3) / 2;
        return Math.sqrt(s * (s - sisi1) * (s - sisi2) * (s - sisi3));
    }

    @Override
    public double getPerimeter() {
        return sisi1 + sisi2 + sisi3;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nSegitiga: sisi1 = " + sisi1 +
               ", sisi2 = " + sisi2 +
               ", sisi3 = " + sisi3 +
               "\nArea: " + getArea() +
               "\nPerimeter: " + getPerimeter();
    }
}
