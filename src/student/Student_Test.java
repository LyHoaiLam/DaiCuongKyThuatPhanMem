package student;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class Student_Test 
{
    public static void main(String[] args) 
    {
        /*Student student1 = new Student("HoaiLam", 21, 7.2);
        Gson gson = new Gson();
        String jsondata =  gson.toJson(student1);  

        System.out.println(jsondata);*/

        Student student1 = new Student("HoaiLam", 21, 7.2);
        Student student2 = new Student("SonNguyen", 19, 7.2);
        Student student3 = new Student("TrongTuan", 29, 7.2);
        Student student4 = new Student("QuocVan", 35, 7.2);
        Student student5 = new Student("HoangLinh", 21, 7.2);
        Gson gson = new Gson();

        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        gson.toJson(list);
        String jsondata = gson.toJson(list);
        System.out.println(jsondata);
        
        



        
    }    
}
