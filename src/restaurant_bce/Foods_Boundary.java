package restaurant_bce;

import java.util.Scanner;

public class Foods_Boundary 
{
    private static Scanner scanner = new Scanner(System.in);
    
    private Foods_Controller foods_Controller;

    private Actions_Restaurant command;
    private static Foods foods;


    public Foods_Boundary(Foods_Controller foods_Controller)
    {
        this.foods_Controller = foods_Controller;
        this.command = null;
    }
    

    public String handleCommands(String rep) 
    {
        String cmd = rep.toUpperCase();
        this.command = Actions_Restaurant.valueOf(cmd);

        if (this.command.equals(Actions_Restaurant.AF)) 
        {
           
            return "Nhap Ten Mon An, Nhap So Luong Mon An, Nhap Don Gia Mon An";
        } 
        else if(this.command.equals(Actions_Restaurant.PF))
        {
            return "In Thanh Cong";
        }
        else if(this.command.equals(Actions_Restaurant.RF))
        {
            return "Xoa Thanh Cong";
        }
        else 
        {
            return "Nhap Cau Lenh Sai.";
        }
    }


    private static Foods Add_Foods_Inputs()
    {
        System.out.println("Name Foods: ");
        String name_Food = scanner.nextLine();
        System.out.println("Amount Foods: ");
        Integer amount_Food = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Price Foods: ");
        Double price_Food = scanner.nextDouble();
        scanner.nextLine();

        return new Foods(name_Food, amount_Food, price_Food);
    }



    public void handlePrint()
    {
        if(this.command.equals(Actions_Restaurant.PF))
        {
            foods.getFoodss().Print();
            //this.foods_Controller.PrintFoods();
        }
    }

    public static void Remove_Input()
    {
        System.out.println("Ten: ");
        int index = scanner.nextInt();
        foods.getFoodss().Remove(index);
    }




    public void handleInput()
    {
        if(this.command.equals(Actions_Restaurant.AF))
        {
            foods = Add_Foods_Inputs();
            this.foods_Controller.AddFoods(foods.getName_Food(), foods.getAmount_Food(), foods.getPrice_Food());        
        }
    }


}
