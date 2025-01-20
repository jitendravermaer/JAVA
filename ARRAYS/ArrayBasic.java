
class ArrayExample {

    void demoArray() {
        int[] ages = new int[5];
        float[] weights = new float[5];
        String[] names = new String[5];

        ages[0] = 12;
        ages[1] = 14;
        ages[2] = 16;
        ages[3] = 18;
        ages[4] = 21;

        weights[0] = 37f;
        weights[1] = 45f;
        weights[2] = 48f;
        weights[3] = 52f;
        weights[4] = 58f;

        names[0] = "Ram";
        names[1] = "Ajay";
        names[2] = "Suman";

        System.out.println(names[0]);
        System.out.println(ages[0]);
        System.out.println(weights[0]);

        System.out.println(names[1]);
        System.out.println(ages[1]);
        System.out.println(weights[1]);

        System.out.println(names[2]);
        System.out.println(ages[2]);
        System.out.println(weights[2]);

        System.out.println(ages[3]);
        System.out.println(ages[4]);

        System.out.println(weights[3]);
        System.out.println(weights[4]);

    }
}

public class ArrayBasic {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        ArrayExample obj = new ArrayExample();
        obj.demoArray();

    }
}
