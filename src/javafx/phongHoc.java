package javafx;

public class phongHoc {
    private Integer id;
    private String name;
    private String room;

    public phongHoc( String name, String room) {
        this.name = name;
        this.room = room;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
    public String toString(){
     return ("Môn: " + name + " Phòng: "+ room);
    }
}
