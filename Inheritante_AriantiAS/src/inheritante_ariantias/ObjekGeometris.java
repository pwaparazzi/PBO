package inheritante_ariantias;

public class ObjekGeometris {
    String warna = "Kuning";
    boolean filled;

    public ObjekGeometris() {
    }

    public ObjekGeometris(String warna, boolean filled) {
        this.warna = warna;
        this.filled = filled;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getArea() {
        return 0.0; 
    }

    public double getPerimeter() {
        return 0.0; 
    }

    @Override
    public String toString() {
        return "Warna: " + warna + "\nTerisi: " + filled;
    }
}
