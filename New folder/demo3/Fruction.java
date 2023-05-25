package demo3;

public class Fruction {
    int tu ;
    int mau;
    public Fruction(int a,int b){
        this.tu = a;
        this.mau = b;
    }
    public int getTu() {
        return tu;
    }

    public void setTu(int a) {
        this.tu = a;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int b) {
        this.mau = b;
    }

    public void PrintPS(){
        System.out.println("Tử Số là: " + tu);
        System.out.println("Mẫu Số là: " + mau);
    }
    public int timUSCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
    public void RutGonPS(){
        int i = timUSCLN(this.getTu(), this.getMau());
        this.setTu(this.getTu() / i);
        this.setMau(this.getMau() / i);
    }
    public void DaoPhanSo(){
        if (this.tu % this.mau > 0){
            int i = tu;
            tu = mau;
            mau = i;
        }
    }
    public void Add(Fruction p){
        Fruction kq = new Fruction();
        kq.tu = this.tu * p.mau + p.tu * this.mau;
        kq.mau = this.mau * p.mau;
        return kq;
    }
    public void Sub(Fruction p){
        Fruction kq = new Fruction();
        kq.tu = this.tu * p.mau - p.tu * this.mau;
        kq.mau = this.mau * p.mau;
        return kq;
    }
    public void Mul(Fruction p){
        Fruction kq = new Fruction();
        kq.tu = this.tu * p.tu;
        kq.mau = this.mau * p.mau;
        return kq;

    }
    public void Div(Fruction p){
        Fruction kq = new Fruction();
        kq.tu = this.tu * p.mau;
        kq.mau = this.mau * p.tu;
        return kq;
    }
}
