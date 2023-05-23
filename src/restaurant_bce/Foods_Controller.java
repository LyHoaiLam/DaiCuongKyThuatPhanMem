 package restaurant_bce;

public class Foods_Controller {
    private Foods foods;
    private ListFood listFood;

    public Foods_Controller(Foods foods){
        this.foods = foods;
    }
    
    public void AddFoods(String name_Food, Integer amount_Food, Double price_Food){
        Foods.getFoodss().Update(name_Food, amount_Food, price_Food);
        Foods.getFoodss().Write();
        System.out.println("Them Thanh Cong");
    }

    public void RemoveFood(int index){
        Foods.getFoodss().Remove(index);
    }

    public void PrintFoods(){
        Foods.getFoodss().Print();
    }

    public Foods getFoods(){
        return foods;
    }

    

}
