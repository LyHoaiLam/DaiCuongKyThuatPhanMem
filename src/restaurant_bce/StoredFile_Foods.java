package restaurant_bce;

import java.io.FileReader;
import java.io.FileWriter;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class StoredFile_Foods 
{
    private String storedFile;
    private JsonArray memory;
    private JsonObject jsonObject = new JsonObject();
    
    Gson gson = new Gson();

    public StoredFile_Foods()
    {

    }


    public StoredFile_Foods(String storedFile)
    {
        this.storedFile = storedFile;

        this.memory = Read();// Tự Động Đọc Data Từ File json Lên
    }
   
    
   
    public JsonArray getAll() 
    {
        return this.memory;
    }


    public void Write()
    {

        try(FileWriter writer = new FileWriter(storedFile))
        {
            gson.toJson(memory, writer);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }


    


    public JsonArray Read()
    {
        JsonArray jsonArray = null;

        try(FileReader reader = new FileReader(storedFile))
        {
            jsonArray = (JsonArray) JsonParser.parseReader(reader);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return jsonArray;
    }


    public void Update(String name_Food, Integer amount_Food, Double price_Food)
    {
        
        jsonObject.addProperty("name_Food", name_Food);
        jsonObject.addProperty("amount_Food", amount_Food);
        jsonObject.addProperty("price_Food", price_Food);
        
        memory.add(jsonObject);
    }

    public void Remove(int index)
    {
        
        memory.remove(index);
    }

    public void Print()
    {
        String line = gson.toJson(memory);
        
        System.out.println(line + "\n");
    }

  

   


   

  

}
