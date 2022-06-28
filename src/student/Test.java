package student;

public class Test 
{
    public static void main(String[] args) 
    {
        List_Student list_Student = new List_Student();
        StoredFileStudent storedFileStudent = new StoredFileStudent("sinhvien.json", list_Student);
        while(true)
        {
            Student student = new Student("Lam", 45, 8.3);
            list_Student.Add_List(student);
            storedFileStudent.Write();
            storedFileStudent.Read();
            //storedFileStudent.Print();
        }    
    }    
}
