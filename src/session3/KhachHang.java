package session3;

public class KhachHang {
    int id;
    char name;

    char quoctich;


    int soluong;


    public KhachHang() {
    }

    public KhachHang(int id, char name, int soluong, char quoctich) {
        this.id = id;
        this.name = name;
        this.soluong = soluong;
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

   public int getSoluong(int soluong) {
       return soluong;
   }

    public void setSoluong(int soluong) {
        this.soluong=soluong;
    }

    public  char getQuoctich(){
        return quoctich;
    }
      public void setQuoctich(char quoctich){
        this.quoctich = quoctich;
      }

    public double GiaTien() {
        if(getSoluong() < 50) {
            return (double) getSoluong() * 1000;
        } else if (getSoluong() >=50 && getSoluong() < 100) {
            return (double) 50 * 1000 + (getSoluong() - 50) * 1200;
        } else if (getSoluong() >= 100 && getSoluong() < 200) {
            return (double) 50 * 1000 + 50 * 1200 + (getSoluong() - 100) * 1500;
        } else {
            return (double) 50 * 1000 + 50 * 1200 + 100 * 1500 + (getSoluong() - 200) * 2000;
        }
    }
}
