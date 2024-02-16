import java.util.Arrays;
import java.util.Scanner;

public class Person {
        private String name;
        private int age;
        private String gender;
        private String[] interests;

        public Person(String name, int age, String gender, String[] interests) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.interests = interests;
        }

        public String hello() {
            String interestList = String.join(", ", interests);
            return "Hello, my name is " + name + ", my gender is " + gender + " and I am " + age + " years old. My interests are " + interestList + ".";
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter name:");
            String name = scan.nextLine();
            System.out.println("Enter age");
            int age = scan.nextInt();

           Person person = new Person(name, age, "male",

                    new String[]{"being a hardarse", "agile", "SSD hard drives"}
          );
           String greeting = person.hello();
            System.out.println(greeting);
        }
    }


