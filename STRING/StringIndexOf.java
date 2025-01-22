import java.lang.String;

public class StringIndexOf
{
    public static void main(String[]args)
    {
        String s1 = new String("Computer");
        int i = s1.indexOf("ute",4);
        System.out.println("Index is "+i);
        int i2 = s1.lastIndexOf('p');
        System.out.println("Index is "+i2);
    }
}