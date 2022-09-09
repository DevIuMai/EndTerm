import java.util.List;

public class KhachHang {
    private int maKh;
    private String tenKh;
    private List<SanPham> listSp ;
    public KhachHang(int maKh, String tenKh, List<SanPham> listSp) {
        this.maKh = maKh;
        this.tenKh = tenKh;
        this.listSp = listSp;
    }
    public int getMaKh() {
        return maKh;
    }
    public String getTenKh() {
        return tenKh;
    }
    public List<SanPham> getListSp() {
        return listSp;
    }
    public void setMaKh(int maKh) {
        this.maKh = maKh;
    }
    public void setTenKh(String tenKh) {
        this.tenKh = tenKh;
    }
    public void setListSp(List<SanPham> listSp) {
        this.listSp = listSp;
    }
    @Override
    public String toString() {
        return "KhachHang [listSp=" + listSp + ", maKh=" + maKh + ", tenKh=" + tenKh + "]";
    }
    
}
