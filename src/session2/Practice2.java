package session2;

public class Practice2 {
    char id;
    char name;
    int blance;

    public Practice2() {
    }

    public Practice2(char id, char name, int blance) {
        this.id = id;
        this.name = name;
        this.blance = blance;
    }

    public char getId() {
        return id;
    }

    public void setId(char id) {
        this.id = id;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public int getBlance() {
        return blance;
    }

    public void setBlance(int blance) {
        this.blance = blance;
    }

    public void SoDu(int amount){
    if (amount > 0){
        this.setBlance(this.blance+amount);
        }else {
        System.out.println("Hết tiền...");
    }
    }

    public void ChuyenTien(int amount){
    if (amount > 0 && amount <= this.getBlance()){
    this.setBlance(getBlance() - amount);
    }else {
        System.out.println("Không đủ tiền để chuyển....");
    }
    }
    public  void NapTien(int amount){
        if (amount > 0 && amount <= this.getBlance()){
            this.setBlance(getBlance()+amount);
        }
    }
}

