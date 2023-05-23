package restaurant_bce;

import java.util.Scanner;

public class UI_Terminal 
{
    private static Scanner scanner = new Scanner(System.in);
    public static Foods foods = new Foods();
    public static Foods_Controller foods_Controller = new Foods_Controller(foods);

    public static Foods_Boundary foods_Boundary = new Foods_Boundary(foods_Controller);
    public static ListFood listFood = new ListFood();


    /*public static Bill bill = new Bill();

    public static Bill_Controller bill_Controller = new Bill_Controller(bill);
    public static Bill_Boundary bill_Boundary = new Bill_Boundary(bill_Controller);*/

    public static int chon; 
    public static String rep;
    public static String resCmd;

    public static void main(String[] args) {
        System.out.println("********************************RESTAURANT*******************************");
        System.out.println("[1] Dau Bep");
        System.out.println("[2] Khach Hang");
        System.out.println("[3] Nhan Vien Thu Ngan");
        System.out.println("[4] Nguoi Duyet Web");
        System.out.println("[5] Thoat Chuong Trinh");
        System.out.println();
        chon = scanner.nextInt();
        scanner.nextLine();
        switch(chon){
            case 1:{
                DisPlay_DauBep(foods_Controller);
            }break;
            case 5:{
                break;
            }
        }
 
    }


    public static void DisPlay_DauBep(Foods_Controller foods_Controller){
        String luaChon;
        do{
            System.out.println("************[Dau Bep]************");
            System.out.println("[AF] Them Moi Mon An Vao Danh Sach Mon An Phuc Trong Ngay");
            System.out.println("[RF] Xoa Mon An Phuc Vu Trong Ngay");
            System.out.println("[PF] In Danh Sach Mon An Phuc Vu Trong Ngay");
            {
                rep = scanner.nextLine();

            if(rep.toUpperCase().equals(Actions_Restaurant.AF.toString())){
                    resCmd = foods_Boundary.handleCommands(rep);
                    System.out.println(resCmd);          
                    foods_Boundary.handleInput();
                }
            if(rep.toUpperCase().equals(Actions_Restaurant.PF.toString())){
                    resCmd = foods_Boundary.handleCommands(rep);
                    System.out.println(resCmd);
                    foods_Boundary.handlePrint();
                }
            if(rep.toUpperCase().equals(Actions_Restaurant.RF.toString())){
                    resCmd = foods_Boundary.handleCommands(rep);
                    System.out.println(resCmd);
                    System.out.println("Vi Tri Can Xoa");
                    int index = scanner.nextInt();
                    foods_Controller.RemoveFood(index);
                }
            }
            System.out.println("[1] Su Dung Tiep");
            System.out.println("[0] Thoat Ra giao Dien Dau Bep");
            chon = scanner.nextInt();
            scanner.nextLine();
        }while(chon ==1);

    }


    /*public static void DisPlay_NhanVienThuNgan(Bill_Controller bill_Controller)
    {
        while(true)
        {
            System.out.println("************[Nhan Vien Thu Ngan]************");
            System.out.println("[AB] Them Bill");
            System.out.println("[RB] Xoa Bill");
            System.out.println("[PB] In Bill");
            {
                rep = scanner.nextLine();

            if(rep.toUpperCase().equals(Actions_Restaurant.AB.toString()))
                {
                    resCmd = foods_Boundary.handleCommands(rep);
                    System.out.println(resCmd);          
                    bill_Boundary.handleInput();
                
                }
            if(rep.toUpperCase().equals(Actions_Restaurant.PB.toString()))
                {
                    resCmd = foods_Boundary.handleCommands(rep);
                    System.out.println(resCmd);
                    bill_Boundary.handlePrint();
                }
            if(rep.toUpperCase().equals(Actions_Restaurant.RB.toString()))
                {
                    resCmd = bill_Boundary.handleCommands(rep);
                    System.out.println(resCmd);
                    System.out.println("Vi Tri Can Xoa");
                    int index = scanner.nextInt();
                    UI_Terminal.bill_Controller.RemoveBill(index);
                }
            }
        }   
    }*/






}

