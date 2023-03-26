public class Str {
    void display(double a){
        System.out.println("Double");

    }
    void display(String b){

        System.out.println("String");
    }

    public static void main(String[] args) {
        Str Si =new Str();
        Si.display("nirosh");
        Si.display(78.98);
    }
}
