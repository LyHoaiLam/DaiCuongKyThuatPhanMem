package restaurant_bce;

public class Foods {
    private static StoredFile_Foods foodss = new StoredFile_Foods("listfoods.json");

    private String name_Food;
    private Integer amount_Food;
    private Double price_Food;

    public void setName_Food(String name_Food){
        this.name_Food = name_Food;
    }
    public void setAmount_Food(Integer amount_Food){
        this.amount_Food = amount_Food;
    }
    public void setPrice_Food(Double price_Food){
        this.price_Food = price_Food;
    }

    public String getName_Food(){
        return name_Food;   
    }
    public Integer getAmount_Food(){
        return amount_Food;
    }
    public Double getPrice_Food(){
        return price_Food;
    }

    public Foods(){
        this.name_Food = null;
        this.amount_Food = null;
        this.price_Food = null;
    }

    public Foods(String name_Food, Integer amount_Food, Double price_Food){
        this.name_Food = name_Food;
        this.amount_Food = amount_Food;
        this.price_Food = price_Food;    
    }

   public void setFoods(String name_Food, Integer amount_Food, Double price_Food){
        this.name_Food = name_Food;
        this.amount_Food = amount_Food;
        this.price_Food = price_Food;
   }

   public static StoredFile_Foods getFoodss(){
        return foodss;
   }

    @Override
    public String toString(){
        return "Name Food: " + this.getName_Food() + " /"
         + "Amount Food: " + this.getAmount_Food() + " /" 
         + "Price Food: " + this.getPrice_Food() + "\n"; 
    }

}
