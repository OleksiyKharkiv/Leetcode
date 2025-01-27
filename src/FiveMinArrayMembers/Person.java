package FiveMinArrayMembers;

import java.util.Objects;

public class Person {
    int id;
    String name;
    double salary;

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.equals(p2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id
                && Double.compare(salary, person.salary) == 0
                && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }
}

class Mains {
    public static void main(String[] args) {
        String a = new String("A");
        String b = new String("A");

        System.out.println(a.equals(b));


    }
}
