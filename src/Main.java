public class Main {
        public static void main(String[] args) {

                Person[] array = new Person[]{
                        new Person("Jack",20),
                        new Person("John",23),
                        new Person("Poul",27),
                        new Person("Nick",22),
                        new Person("John",32),
                        new Person("Mike",21),
                        new Person("John",51),
                        new Person("Lena",20),
                };

                ArrayOfPerson persons = new ArrayOfPerson(array);



                ArrayOfPerson persons2 = new ArrayOfPerson();
                persons2.addPerson(new Person("Jack",20));
                System.out.println("-------- 1");
                System.out.println(persons2);
                persons2.addPerson(new Person("Jack1",20));
                persons2.addPerson(new Person("Jack",20));
                System.out.println("-------- 3");
                System.out.println(persons2);

                persons2.addPerson(new Person("Jack3",20));
                System.out.println("-------- 4");
                System.out.println(persons2);

                persons2.addPerson(new Person("Jack13",20));
                persons2.addPerson(new Person("Jack14",20));
                persons2.addPerson(new Person("Jack15",20));
                System.out.println("-------- 7");
                System.out.println(persons2);


                System.out.println(persons2.toStringByName("jack"));
                System.out.println("--------------------------------");
                Person person = new Person("Ira", 20);
                System.out.println(person);
                person.setAge(21);
                System.out.println(person);

                System.out.println("------------------------------------------------");
                System.out.println("------------------------------------------------");
                System.out.println(persons);
                persons.addPerson(new Person("Nicolaus",30));
                System.out.println(persons);

        }
}