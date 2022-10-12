package session1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int x = 10;
        Student s ;
        s = new Student();
        s.name = " Nam ";
        s.age = 18;

        Student s2 = new Student();
        s2.age = 21;

        s.showInfo();
        s2.showInfo();


        Scanner sc = new Scanner(System.in);
        TamGiac t = new TamGiac();
        System.out.println("Nhap Canh 1 : ");
        t.setA(sc.nextInt());
        System.out.println("Nhap Canh 2 : ");
        t.setB(sc.nextInt());
        System.out.println("Nhap Canh 3 : ");
        t.setC(sc.nextInt());
        System.out.println("Chu vi : "+t.tinhChuvi());
        System.out.println("Dien tich : "+t.tinhDienTich());

        PhanSo ps1 = new PhanSo(12,24);
        PhanSo ps2 = new PhanSo(1,3);

        ps1.add(ps2);
        ps1.daonguocPhanSo();

    }
}