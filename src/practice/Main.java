package practice;


public class Main {
    public static void main(String[] args) {
        Complex sp1 = new Complex(6,7);
        Complex sp2 = new Complex(1,3);
        System.out.println("Add: "+sp1.add(sp2));
        System.out.println("Subtract: "+sp1.subtract(sp2));
        System.out.println("Multiply: "+sp1.multiply(sp2));
        System.out.println("Divide: "+sp1.divide(sp2));
    }
}