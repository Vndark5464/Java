package session3;

public class KhachHang2 extends KhachHang{
       private char quoctich2;

    public KhachHang2() {
    }

    public KhachHang2(int id,char name,char quoctich2,int soluong){
        this.setId(id);
        this.setName(name);
        this.setQuoctich2(quoctich2);
        this.setSoluong(soluong);
    }
    public char getQuoctich2() {
        return quoctich2;
    }

    public void setQuoctich2(char quoctich2) {
        this.quoctich2 = quoctich2;
    }
    @Override
    public double DonGia(){
        return getSoluong()*2000;
    }
}

