package SC.skills;

public class App {
    protected String str_1 = "I am a public memeber";

    void printFromClass() {
        System.out.println("within Class: " + str_1);
    }

    public static void main(String[] args) {
        App obj = new App();
        obj.printFromClass();
        System.out.println("with in class: " + obj.str_1);

        App2 obj2 = new App2();
        obj2.printOfOutsideClass();
    }
}

class App2 {
void printOfOutsideClass(){
    App obj = new App();
    System.out.println("within package , outside class: " + obj.str_1);
}
}