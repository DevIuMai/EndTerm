import java.util.ArrayList;
import java.util.List;

public class QLBH {
public   List<KhachHang> lstKhachHangs = new ArrayList<KhachHang>();
public   List<SanPham> lstSanPhams = new ArrayList<SanPham>();

public void addCustomer(int idKh, String nameKh){
    lstKhachHangs.add(new KhachHang(idKh, nameKh, null));

}
public KhachHang findCustomer(int idKh){
    KhachHang result = null;
    for (KhachHang khachHang : lstKhachHangs) {
        if (idKh == khachHang.getMaKh()) {
            result = khachHang;
            
        }
    }
    return result;

}
public int getTotalPrice(KhachHang khachHang){
    int total = 0;
    if (khachHang.getListSp() != null) {
        for (SanPham sanPham : lstSanPhams) {
            total += sanPham.getGiaSp();
        }
    }
    return total;

}
/**
 * 
 */
public String printSanPham(){
    StringBuffer  stringBuffer = new StringBuffer();
    for (SanPham sanPham : lstSanPhams) {
        stringBuffer.append(sanPham.toString() + "/n");
    }
    return  stringBuffer.toString();

}
public static void main(String[] args) {
    
}

}
