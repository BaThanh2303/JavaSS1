package javafx2;

public class Product {
    private String tenSP;
    private String gia;
    private String soLuong;
    private String danhMuc;
    private String moTa;

    public Product(String tenSP, String gia, String soLuong, String danhMuc, String moTa) {
        this.tenSP = tenSP;
        this.gia = gia;
        this.soLuong = soLuong;
        this.danhMuc = danhMuc;
        this.moTa = moTa;

    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }

    public String getMoTa() {
        return this.moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    public String toString(){
        return tenSP+"-"+gia+"-"+soLuong+"-"+danhMuc+"-"+moTa;
    }
}
