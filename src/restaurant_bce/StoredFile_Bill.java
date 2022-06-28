package restaurant_bce;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;
import java.io.FileWriter;

public class StoredFile_Bill 
{
    private String storedFile;
    private JsonArray memory;
    
    
    
    Gson gson = new Gson();

    public StoredFile_Bill()
    {

    }


    public StoredFile_Bill(String storedFile)
    {
        this.storedFile = storedFile;

        this.memory = Read();// Tự Động Đọc Data Từ File json Lên
    }
   
    
   
    public JsonArray getAll() 
    {
        return this.memory;
    }


    public void RemoveBill(int index)
    {
        Bill.getBills().RemoveBill(index);
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


        public void Update(String ma_BanAn, String name_Food, Integer amount_Food, Double price_Food, Double soTienKhachHangDua)
    {
        JsonObject jsonObject = new JsonObject();
        

        jsonObject.addProperty("ma_BanAn", ma_BanAn);
        jsonObject.addProperty("soTienKhachHangDua", soTienKhachHangDua);
        jsonObject.addProperty("name_Food", name_Food);
        jsonObject.addProperty("amount_Food", amount_Food);
        jsonObject.addProperty("price_Food", price_Food);
        
        memory.add(jsonObject);
    }

    public void Print()
    {
        String line = gson.toJson(memory);
        System.out.println(line);
    }

}
