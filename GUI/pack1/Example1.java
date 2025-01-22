package pack1;
import pack2.Student1;
public class Example1
{
    public static void main(String []args)
    {
        Student1 s1 = new Student1();
        s1.setRollno(100);
        s1.setName("Jitendra");
        System.out.println("Roll No."+s1.getRollno());
        System.out.println("Name:"+s1.getName());
    }
}