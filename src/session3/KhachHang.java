package session3;

public class KhachHang {
    int id;
    char name;

    char quoctich;


    double giatien;


    public KhachHang() {
    }

    public KhachHang(int id, char name, double giatien, char quoctich) {
        this.id = id;
        this.name = name;
        this.giatien = giatien;
        this.quoctich = quoctich;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public double getGiatien() {
        return giatien;
    }

    public void setGiatien(double giatien) {
        this.giatien = giatien;
    }

    public  char getQuoctich(){
        return quoctich;
    }
      public void setQuoctich(char quoctich){
        this.quoctich = quoctich;
      }

    public void DonGia(int SoLuong){
        if (SoLuong>0 && SoLuong<50){
            this.setGiatien(SoLuong*1000);
        } else if (SoLuong>=50 && SoLuong<=100) {
            this.setGiatien(SoLuong*1200);
        } else if (SoLuong>100 && SoLuong<=200) {
            this.setGiatien(SoLuong*1500);
        }else if (SoLuong>200){
            this.setGiatien(SoLuong*2000);
        }else {
            System.out.println("Vui lòng chọn số lượng hợp lệ");
        }
    }
}
