import java.util.Scanner;
class Student {
    String name;
    int age;
    void displayInfo(){
        System.out.println(this.name + " " + this.age);
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        s1.name = sc.next();
        s1.age = sc.nextInt();
        Student s2 = new Student();
        s2.name = sc.next();
        s2.age = sc.nextInt();
        s1.displayInfo();
        s2.displayInfo();
    }
}