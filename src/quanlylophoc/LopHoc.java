package quanlylophoc;

public class LopHoc {
    public Integer id;
    public String tenLop;
    public String phongHoc;

    public LopHoc(Integer id, String tenLop, String phongHoc) {
        this.id = id;
        this.tenLop = tenLop;
        this.phongHoc = phongHoc;
    }

    public LopHoc(String tenLop, String phongHoc) {
        this.tenLop = tenLop;
        this.phongHoc = phongHoc;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getPhongHoc() {
        return phongHoc;
    }

    public void setPhongHoc(String phongHoc) {
        this.phongHoc = phongHoc;
    }

    public String toString(){
        return ("Lớp: " + tenLop + "  Phòng: " + phongHoc );
    }
}
