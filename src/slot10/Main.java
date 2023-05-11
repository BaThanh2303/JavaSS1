package slot10;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.insertPhone("Thanh", "010231241");
        phoneBook.insertPhone("Cuong", "010295959");
        phoneBook.insertPhone("Thai", "016262626");
        phoneBook.searchPhone("Thai");
        phoneBook.removePhone("Thanh");
        phoneBook.searchPhone("010295959");
        phoneBook.sort();


    }
}
