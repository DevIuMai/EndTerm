public class SanPham {
    private int maSp, giaSp;
    private String tenSp;
    public SanPham(int maSp, int giaSp, String tenSp) {
        this.maSp = maSp;
        this.giaSp = giaSp;
        this.tenSp = tenSp;
    }
    public int getMaSp() {
        return maSp;
    }
    public int getGiaSp() {
        return giaSp;
    }
    public String getTenSp() {
        return tenSp;
    }
    public void setMaSp(int maSp) {
        this.maSp = maSp;
    }
    public void setGiaSp(int giaSp) {
        this.giaSp = giaSp;
    }
    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }
    @Override
    public String toString() {
        return "SanPham [giaSp=" + giaSp + ", maSp=" + maSp + ", tenSp=" + tenSp + "]";
    }
    
    
}
