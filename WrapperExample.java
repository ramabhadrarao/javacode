public class WrapperExample {
    public static void main(String[] args) {
        // Check if the correct number of command-line arguments are provided
        if (args.length < 6) {
            System.out.println("Usage: java WrapperExample <byte> <short> <int> <long> <float> <double>");
            return;
        }
        
        // Parse command-line arguments into respective wrapper classes
        Byte byteArg = Byte.valueOf(args[0]);
        Short shortArg = Short.valueOf(args[1]);
        Integer intArg = Integer.valueOf(args[2]);
        Long longArg = Long.valueOf(args[3]);
        Float floatArg = Float.valueOf(args[4]);
        Double doubleArg = Double.valueOf(args[5]);

        // Display the values of the wrapper objects
        System.out.println("Byte argument: " + byteArg);
        System.out.println("Short argument: " + shortArg);
        System.out.println("Integer argument: " + intArg);
        System.out.println("Long argument: " + longArg);
        System.out.println("Float argument: " + floatArg);
        System.out.println("Double argument: " + doubleArg);
    }
}


// javac WrapperExample.java

// C:\Users\maddu\javacode>java WrapperExample 23 2 234 344 3.4f 45.6  
// Byte argument: 23
// Short argument: 2
// Integer argument: 234
// Long argument: 344
// Float argument: 3.4
// Double argument: 45.6