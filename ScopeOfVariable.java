
class Algebra {

    int a = 10; //member variables
    int b = 5;

    int add() {
        int p = 11; //methods level scope variable
        int q = 19;
        return p + q;
    }

    int sub() {
        return a - b;
    }

    void demo() {
        int a = 15;
        System.out.println(a);
        // System.out.println(b); not access inside b
        {
            int b = 20; //only access inside the bracts
            System.out.println(b);
        }
    }
}

public class ScopeOfVariable {

    public static void main(String[] args) {
        int a = 10;
        // int a = 11;   Give an error
        // double a;
        // string a;
        Algebra obj = new Algebra();
        obj.demo();
        int addAns = obj.add();
        int subAns = obj.sub();
        System.out.println(addAns);
        System.out.println(subAns);
    }
}
