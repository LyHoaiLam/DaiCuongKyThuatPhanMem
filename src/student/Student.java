package student;

public class Student 
{

    

    private String name;
    private Integer age;
    private Double mark;
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getAge() {
        return age;
    }
    public void setMark(Double mark) {
        this.mark = mark;
    }
    public Double getMark() {
        return mark;
    }
    

    public Student()
    {

    }


    public Student(String name, Integer age, Double mark)
    {
        this.setName(name);
        this.setAge(age);
        this.setMark(mark);
        
    }


    @Override
    public String toString() 
    {
        return "[Name Student]: " + this.getName() + " |" + "[Age Student]: " + this.getAge()
        + " |" + "[Mark Student]: " + this.getMark();
    }



}
