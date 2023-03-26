public class add {
    static int add(int a ,int b ){


        return a+b;
    }
    static double add (double a, double b){
        return a + b;
    }
    static class TestOverloading{
        public static void main(String[] args) {

            System.out.println(add.add(11,11));
            System.out.println(add.add(11.7,11.8));

        }

    }

}
