package practice;

public class Complex {
    private double realPart;
    private double imaginaryPart;

    public Complex() {
        realPart = 0;
        imaginaryPart = 0;
    }

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public Complex add(Complex ortherNumber) {
        double phanthuc = realPart + ortherNumber.getRealPart();
        double phanao = imaginaryPart + ortherNumber.getImaginaryPart();

        return new Complex(phanthuc, phanao);
    }

    public Complex subtract(Complex ortherNumber) {
        double phanthuc = realPart + ortherNumber.getRealPart();
        double phanao = imaginaryPart + ortherNumber.getImaginaryPart();

        return new Complex(phanthuc, phanao);
    }

    public Complex multiply(Complex ortherNumber) {
        double phanthuc = realPart * ortherNumber.getRealPart() - imaginaryPart * ortherNumber.getImaginaryPart();
        double phanao = realPart * ortherNumber.getImaginaryPart() + imaginaryPart * ortherNumber.getRealPart();

        return new Complex(phanthuc, phanao);
    }
    public Complex divide(Complex ortherNumber) {
        double phanthuc = (realPart * ortherNumber.getRealPart() + imaginaryPart * ortherNumber.getImaginaryPart()) /
                (Math.pow(ortherNumber.getRealPart(), 2) + Math.pow(ortherNumber.getImaginaryPart(), 2));
        double phanao = (imaginaryPart * ortherNumber.getRealPart() - realPart * ortherNumber.getImaginaryPart()) /
                (Math.pow(ortherNumber.getRealPart(), 2) + Math.pow(ortherNumber.getImaginaryPart(), 2));

        return new Complex(phanthuc, phanao);
    }

    @Override
    public String toString() {
        return
                realPart +
                        "+" + imaginaryPart +
                        'i';
    }

}
