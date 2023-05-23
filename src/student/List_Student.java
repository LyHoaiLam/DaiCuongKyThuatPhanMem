package student;

import java.util.ArrayList;
import java.util.List;

public class List_Student {
    private List<Student> list_Student = new ArrayList<>();

    public void Add_List(Student newstudent){
        list_Student.add(newstudent);
    } 


    public void Print_List(){
        for (Student student : list_Student) {
            System.out.println(student);    
        }
    }
}
