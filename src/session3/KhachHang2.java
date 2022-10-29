package session3;

public class KhachHang2 extends KhachHang1{
    public String country;

    public KhachHang2(String code, String fullName, String invoiceDate, Integer qty, String country) {
        super(code, fullName, invoiceDate, qty);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public double calculateMoney() {
        return super.calculateMoney();
    }
}