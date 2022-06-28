package restaurant_bce;

import java.util.ArrayList;
import java.util.List;

public class ListFood 
{
    List<Foods> listFood = new ArrayList<>();
    StoredFile_Foods storedFile_Foods;
    
    public void Add_List_Food(Foods foods)
    {
        listFood.add(foods);

    }

    public void Print_List_Fodd()
    {
        for (Foods foods : listFood) 
        {
            System.out.println(foods);    
        }
    }


    public void Remove_List_Food(int index)
    {
        listFood.remove(index);
    }
}
