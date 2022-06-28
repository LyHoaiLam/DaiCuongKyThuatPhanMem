package student;

import java.io.FileReader;
import java.io.FileWriter;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class StoredFileStudent 
{
    private String storedFile;
    private JsonArray memory;
    private List_Student list_Student;

    Gson gson = new Gson();


    public  StoredFileStudent()
    {

    }


    public StoredFileStudent(String storedFile, List_Student list_Student)
    {
        this.storedFile = storedFile;
        this.list_Student = list_Student;
    }

    public JsonArray getMemory() 
    {
        return memory;
    }


    public void Write()
    {
        

        try(FileWriter writer = new FileWriter(storedFile))
        {
            gson.toJson(this.list_Student, writer);
            //Gson gson = new Gson();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }


    public void Print()
    {
        gson.toJson(list_Student);
        String line = gson.toJson(list_Student);
        System.out.println(line);   
    }



    public void Update(String name, Integer age, Double mark)
    {
        JsonObject jsonObject = new JsonObject();
        {
            jsonObject.addProperty("name", name);
            jsonObject.addProperty("age", age);
            jsonObject.addProperty("mark", mark);
            memory.add(jsonObject);
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

        System.out.println(jsonArray.toString());

        return jsonArray;
    }


}
