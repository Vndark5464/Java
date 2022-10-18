package session3;

public class KhachHang2 extends KhachHang{
       private char quoctich2;

    public KhachHang2() {
    }
public KhachHang2(int id, char name, int soluong){
    this.id = id;
    this.name = name;
    this.soluong = soluong;
}
    public char getQuoctich2() {
        return quoctich2;
    }

    public void setQuoctich2(char quoctich2) {
        this.quoctich2 = quoctich2;
    }
    @Override
    public void DonGia(int SoLuong){
        return getSoluong()*2000;
    }
}

