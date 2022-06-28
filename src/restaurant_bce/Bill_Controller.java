package restaurant_bce;

public class Bill_Controller 
{
    private Bill bill;

    Foods foods;

    public Foods getFoods() {
        return foods;
    }

    public Bill_Controller(Bill bill)
    {
        this.bill = bill;
    }

    public void AddBill(String ma_BanAn, String name_Food, Integer amount_Food, Double price_Food, Double soTienKhachHangDua)
    {
        Bill.getBills().Update(ma_BanAn, name_Food, amount_Food, price_Food, soTienKhachHangDua);
        Bill.getBills().Write();
        System.out.println("Thanh Cong");
    }

    public void PrintBill()
    {
        Bill.getBills().Print();
    }

    public Bill getBill() 
    {
        return bill;
    }

    public void RemoveBill(int index)
    {
        Bill.getBills().RemoveBill(index);
    }
    
}
