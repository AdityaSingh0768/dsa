import java.util.*;
public class oops1stclass {

    private static class person {
        String name;
        int age;

        void Sayhi() {
            if (this.age > 30) {
                System.out.println("hello from " + this.name);
            } else {
                System.out.println("hi from " + this.name);
            }
        }
    }

    public static void main(String[] args) {
        person p1; // reference
        p1 = new person();// instances
        p1.age = 34;
        p1.name = "sumeet";
        p1.Sayhi();

        person p2;// refrences
        p2 = new person();// instances
        p2.age = 25;
        p2.name = "shashank";
        p2.Sayhi();// function call
        person p3=p2; // no refernce direct instances //both p3 and p2 have same instances
        p3.age=26;// change in one will lead to chsnge in both
        p3.name="amit";
     //   p3.game=valorant; wrong becuase ye filed class mein declare kri hi nhi
        p3.Sayhi();
        p2.Sayhi();

    }
}
