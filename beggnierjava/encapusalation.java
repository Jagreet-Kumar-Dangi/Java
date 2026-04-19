package beggnierjava;
class Human
{
    private int age;
    private String name;
    public void setAge(int a)
    {
        age=a;
    }
    public void setName(String nam)
    {
        name=nam;
    }
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
}
public class encapusalation {
    public static void main(String[] args) {
        Human obj=new Human();
        obj.setAge(20);
        obj.setName("Jagreet");
        System.out.println(obj.getName()+" : "+obj.getAge());

    }
}
