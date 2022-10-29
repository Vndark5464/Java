package session4.practice;

public abstract class Phone {
    abstract void insertPhone(String name,String phone);
    abstract void removePhone(String name);
    abstract void updatePhone(String name,String oldPhone, String newPhone);
    abstract void searchPhone(String name);
    abstract void sort();

}
