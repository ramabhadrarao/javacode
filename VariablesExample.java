public class VariablesExample {
    public static void main(String[] args) {
        // Declaration and initialization of variables
        int age = 25;
        double height = 5.8;
        char gender = 'M';
        boolean isStudent = true;
        String name = "John Doe";

        // Printing variables
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " feet");
        System.out.println("Gender: " + gender);
        System.out.println("Is student? " + isStudent);

        // Modifying variables
        age = 26;
        height = 6.0;
        gender = 'F';
        isStudent = false;
        name = "Jane Smith";

        // Printing modified variables
        System.out.println("\nModified Variables:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " feet");
        System.out.println("Gender: " + gender);
        System.out.println("Is student? " + isStudent);
    }
}
