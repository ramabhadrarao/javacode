public class DataTypesExample {
    public static void main(String[] args) {
        // Primitive data types
        byte byteVar = 10;
        short shortVar = 20;
        int intVar = 30;
        long longVar = 40L;
        float floatVar = 3.14f;
        double doubleVar = 3.14159;
        char charVar = 'A';
        boolean boolVar = true;

        // Display primitive data types
        System.out.println("Primitive Data Types:");
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: " + charVar);
        System.out.println("boolean: " + boolVar);

        // Wrapper classes
        Byte byteWrapper = Byte.valueOf(byteVar);
        Short shortWrapper = Short.valueOf(shortVar);
        Integer intWrapper = Integer.valueOf(intVar);
        Long longWrapper = Long.valueOf(longVar);
        Float floatWrapper = Float.valueOf(floatVar);
        Double doubleWrapper = Double.valueOf(doubleVar);
        Character charWrapper = Character.valueOf(charVar);
        Boolean boolWrapper = Boolean.valueOf(boolVar);

        // Display wrapper classes
        System.out.println("\nWrapper Classes:");
        System.out.println("Byte: " + byteWrapper);
        System.out.println("Short: " + shortWrapper);
        System.out.println("Integer: " + intWrapper);
        System.out.println("Long: " + longWrapper);
        System.out.println("Float: " + floatWrapper);
        System.out.println("Double: " + doubleWrapper);
        System.out.println("Character: " + charWrapper);
        System.out.println("Boolean: " + boolWrapper);
    }
}
