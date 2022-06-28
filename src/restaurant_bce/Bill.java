package restaurant_bce;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Bill 
{
    private static StoredFile_Bill bills = new StoredFile_Bill("bill.json");

    private String ma_BanAn;
    private Foods foods;
    private Double tong_Tien = TongTien();
    private Double soTienKhachDuaChoNhanVien;
    private String name_Food;
    private Integer amount_Food;
    private Double price_Food;

    public void setName_Food(String name_Food) {
        this.name_Food = name_Food;
    }
    public String getName_Food() {
        return name_Food;
    }
    public void setAmount_Food(Integer amount_Food) {
        this.amount_Food = amount_Food;
    }
    public Integer getAmount_Food() {
        return amount_Food;
    }
    public void setPrice_Food(Double price_Food) {
        this.price_Food = price_Food;
    }
    public Double getPrice_Food() {
        return price_Food;
    }

                    public String getMa_BanAn() 
                    {
                        return ma_BanAn;
                    }
                    public Foods getFoods() 
                    {
                        return foods;
                    }
                    public Double getTong_Tien() 
                    {
                        return tong_Tien;
                    }
                    public Double getSoTienKhachDuaChoNhanVien() 
                    {
                        return soTienKhachDuaChoNhanVien;
                    }



   
    public Bill()
    {
        this.ma_BanAn = null;
        this.foods = null;
        this.tong_Tien = null;
        this.soTienKhachDuaChoNhanVien = null;
        this.name_Food = null;
        this.amount_Food = null;
        this.price_Food = null;
    }                    
    public Bill(String ma_BanAn, Double soTienKhachDuaChoNhanVien, String name_Food, Integer amount_Food, Double price_Food)
    {
        this.ma_BanAn = ma_BanAn;
        this.soTienKhachDuaChoNhanVien = soTienKhachDuaChoNhanVien;
       
       this.name_Food = name_Food;
       this.amount_Food = amount_Food;
       this.price_Food = price_Food;
    }


    public void setBill(String ma_BanAn, Double soTienKhachDuaChoNhanVien, String name_Food, Integer amount_Food, Double price_Food)
    {
        this.ma_BanAn = ma_BanAn;
        this.soTienKhachDuaChoNhanVien = soTienKhachDuaChoNhanVien;
        this.name_Food = name_Food;
       this.amount_Food = amount_Food;
       this.price_Food = price_Food;
        
    }


    public static StoredFile_Bill getBills() 
    {
        return bills;
    }


    @Override
    public String toString() 
    {
        SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/MM/yyyy");
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat tienVN = NumberFormat.getCurrencyInstance(localeVN);
        return "[BILL Thanh Toan]: " + " |" + " [Ma Ban An]: " + this.ma_BanAn + " |" + "[Tong Tien Bill]: " 
        + tienVN.format(this.TongTien()) + " |" + "[So Tien Thoi Cho Khach]: " + this.SoTienTraLaiChoKhach();
    }


    public Double TongTien()
    {
        return foods.getAmount_Food() * foods.getPrice_Food();
    }


    public Double SoTienTraLaiChoKhach()
    {
        return soTienKhachDuaChoNhanVien - this.TongTien();
    }

    

}
