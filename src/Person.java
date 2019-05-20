public class Person {
    private String name;
    public String getName(){
        return this.name;
    }
    public void setName(String nameInput){
        this.name = nameInput;
    }
    public Person(String name) {
        this.name = name;
    }
    private void sayHello(){
        System.out.printf("Hello, from %S %n", name);
    }

    public static void main(String[] args) {
        Person bob = new Person("");
        bob.setName("Bob");
        bob.sayHello();

        Person heraticlus = new Person("");
        heraticlus.setName("heraticlus");
        heraticlus.sayHello();
        System.out.println(heraticlus.getName());
        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        //this prints true
//        System.out.println(person1.getName().equals(person2.getName()));
//        //this prints false
//        System.out.println(person1 == person2);
//        Person person1 = new Person("John");
        Person person2 = person1;
//        //this prints false
        System.out.println(person1 == person2);
    }

}
