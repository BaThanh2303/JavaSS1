package slot8;

public class Main {
    public static void main(String[] args) {
        Person ps1 = new Person("Thanh",20,"03255456","HN");
        Person ps2 = new Person("Dung",21, "23141231","HN");
        Person ps3 = new Person("An",20,"01231241","HN");
        Room room = new Room("B12","Floor 1");
        room.addPerson(ps1);
        room.addPerson(ps2);
        room.addPerson(ps3);
        room.printInfo();
        room.sortListByName();
    }
}
