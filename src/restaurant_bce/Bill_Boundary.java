package restaurant_bce;

import java.util.Scanner;

public class Bill_Boundary 
{
    private static Scanner scanner = new Scanner(System.in);

    private Bill_Controller bill_Controller;

    private Actions_Restaurant command;
    Bill bill;
    Foods foods;

    public Foods getFoods() 
    {
        return foods;
    }

    public Bill_Boundary(Bill_Controller bill_Controller)
    {
        this.bill_Controller = bill_Controller;
        this.command = null;
    }


    public String handleCommands(String rep) 
    {
        String cmd = rep.toUpperCase();
        this.command = Actions_Restaurant.valueOf(cmd);

        if (this.command.equals(Actions_Restaurant.AB)) 
        {
            return "Nhap Ma Ban An, Nhap Mon An, Nhap So Tien Khach Dua";
        } 
        else 
        {
            return "Nhap Cau Lenh Sai.";
        }
    }


    private static Bill Add_Bill_Inputs()
    {
        System.out.println("Ma Ban An: ");
        String ma_BanAn = scanner.nextLine();
        System.out.println("Name Food");
        String name_Food = scanner.nextLine();
        System.out.println("Amount Foods: ");
        Integer amount_Food = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Price Foods: ");
        Double price_Food = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("So Tien Khach Dua: ");
        Double soTienKhachDuaChoNhanVien = scanner.nextDouble();
        scanner.nextLine();

        return new Bill(ma_BanAn, soTienKhachDuaChoNhanVien, name_Food, amount_Food, price_Food);

    }


    public void handlePrint()
    {
        if(this.command.equals(Actions_Restaurant.PF))
        {
            bill.getBills().Print();
        }
    }


    public void handleInput()
    {
        if(this.command.equals(Actions_Restaurant.AF))
        {
            bill = Add_Bill_Inputs();
            bill.setName_Food(foods.getName_Food());
            bill.setAmount_Food(foods.getAmount_Food());
            bill.setPrice_Food(foods.getPrice_Food());
            this.bill_Controller.AddBill(bill.getMa_BanAn(), bill.getName_Food(), bill.getAmount_Food(), bill.getPrice_Food(),bill.getSoTienKhachDuaChoNhanVien());
        }
    }

}
