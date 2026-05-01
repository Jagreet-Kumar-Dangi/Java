package beggnierjava;

class Computer
{
    public void playMusic()
    {
        System.out.println("Plying Music.");
    }
    public String getMePen(int rs)
    {
        if(rs==10)
            return "Pen";
        else
            return "Give me Money";
    }
}
public class oops {
    public static void main(String[] args) {
        Computer comp=new Computer();
        comp.playMusic();
        String str=comp.getMePen(10);
        System.out.println(str);
    }
}




//object Oriented Programming
// Objects - Properties /behaviour