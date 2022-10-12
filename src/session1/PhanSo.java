package session1;

public class PhanSo {
    int tuso;
    int mauso;

    public PhanSo(int tuso, int mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }

    public int getTuso() {
        return tuso;
    }

    public void setTuso(int tuso) {
        this.tuso = tuso;
    }

    public int getMauso() {
        return mauso;
    }

    public void setMauso(int mauso) {
        this.mauso = mauso;
    }

    public  void inPhanSo(){
        int ts = this.getTuso();
        int ms = this.getMauso();
        PhanSo inPS = new PhanSo(ts,ms);
        System.out.println("In Phân Số : "+ inPS.tuso+"/"+inPS.mauso);
    }
    public  int timUSCLN(int a,int b){
        while (a!=b){
            if (a<b){
                b=b-a;
            }else {
                a=a-b;
            }
        }
        return a;
    }
    public void toiGianPhanSo() {
        int i = timUSCLN(this.getTuso(), this.getMauso());
        this.setTuso(this.getTuso() / i);
        this.setMauso(this.getMauso() / i);
    }
    public  void daonguocPhanSo(){
        int ts = this.getTuso();
        int ms = this.getMauso();
        PhanSo daonguoc = new PhanSo(ts,ms);
        System.out.println("Phân số đảo ngược : " + daonguoc.mauso + "/" + daonguoc.tuso);
    }
    public void add(PhanSo ps) {
        int ts = this.getTuso() * ps.getMauso() + ps.getTuso() * this.getMauso();
        int ms = this.getMauso() * ps.getMauso();
        PhanSo phanSoTong = new PhanSo(ts, ms);
        phanSoTong.toiGianPhanSo();
        System.out.println("Tổng hai phân số = " + phanSoTong.tuso + "/" + phanSoTong.mauso);
    }

    public void sub(PhanSo ps) {
        int ts = this.getTuso() * ps.getMauso() - ps.getTuso() * this.getMauso();
        int ms = this.getMauso() * ps.getMauso();
        PhanSo phanSoHieu = new PhanSo(ts, ms);
        phanSoHieu.toiGianPhanSo();
        System.out.println("Hiệu hai phân số = " + phanSoHieu.tuso + "/" + phanSoHieu.mauso);
    }

    public void mul(PhanSo ps) {
        int ts = this.getTuso() * ps.getTuso();
        int ms = this.getMauso() * ps.getMauso();
        PhanSo phanSoTich = new PhanSo(ts, ms);
        phanSoTich.toiGianPhanSo();
        System.out.println("Tích hai phân số = " + phanSoTich.tuso + "/" + phanSoTich.mauso);
    }

    public void div(PhanSo ps) {
        int ts = this.getTuso() * ps.getMauso();
        int ms = this.getMauso() * ps.getTuso();
        PhanSo phanSoThuong = new PhanSo(ts, ms);
        phanSoThuong.toiGianPhanSo();
        System.out.println("Thương hai phân số = " + phanSoThuong.tuso + "/" + phanSoThuong.mauso);
    }

}
