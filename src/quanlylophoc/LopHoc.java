package quanlylophoc;

public class LopHoc {
    public String tenLop;
    public String phongHoc;
    public String khoaHoc;

    public LopHoc(String tenLop, String phongHoc, String khoaHoc) {
        this.tenLop = tenLop;
        this.phongHoc = phongHoc;
        this.khoaHoc = khoaHoc;
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

    public String getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(String khoaHoc) {
        this.khoaHoc = khoaHoc;
    }
    public String toString(){
        return ("Lớp: " + tenLop + "  Phòng: " + phongHoc + "     Khóa: " + khoaHoc);
    }
}
