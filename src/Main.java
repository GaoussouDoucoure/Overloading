class Person{
    String firstName;
    String lastName;
    int age;

    Person(String firstName){
        this.firstName = firstName;
    }
    Person(String firstName, String lastName){  //Overloading previous constructor
        this.firstName = firstName;
        this.lastName = lastName;
    }
    Person(String firstName, String lastName, int age){  //Overloading both previous constructors
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int add(int i, int j){
        int result = i + j;
        System.out.println(result);
        return result;
    }
    public int add(int i, int j, int k){   //Overloading method
        int result = i + j;
        System.out.println(result);
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Gaoussou");
        Person p2 = new Person("Gaoussou", "Doucoure");
        Person p3 = new Person("Gaoussou", "Doucoure", 00);

        p1.add(2,3);

    }
}
