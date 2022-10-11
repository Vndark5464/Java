package session1;

public class TamGiac {
    int a;
    int b;
    int c;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int tinhChuvi(){
        return a + b + c;
    }

    public double tinhDienTich(){
        double P = (double)tinhChuvi()/2;
        return Math.sqrt(P*(P-a)*(P-b)*(P-c));
    }
}
