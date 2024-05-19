package executable.javacourse;

public class PrimitiveTypes {
	
	public static void main(String[] args) {
		// byte: 8-bit signed integer
        byte byteVar = 100;
        System.out.println("byte: " + byteVar);
        System.out.println("Size: 8 bits");
        System.out.println("Range: -128 to 127\n");
        
        // short: 16-bit signed integer
        short shortVar = 10000;
        System.out.println("short: " + shortVar);
        System.out.println("Size: 16 bits");
        System.out.println("Range: -32768 to 32767\n");
        
        // int: 32-bit signed integer
        int intVar = 100000;
        System.out.println("int: " + intVar);
        System.out.println("Size: 32 bits");
        System.out.println("Range: -2147483648 to 2147483647\n");
        
        // long: 64-bit signed integer
        long longVar = 100000L;
        System.out.println("long: " + longVar);
        System.out.println("Size: 64 bits");
        System.out.println("Range: -9223372036854775808 to 9223372036854775807\n");
        
        // float: 32-bit floating point
        float floatVar = 10.5f;
        System.out.println("float: " + floatVar);
        System.out.println("Size: 32 bits");
        System.out.println("Range: approximately ±3.40282347E+38F\n");
        
        // double: 64-bit floating point
        double doubleVar = 20.5;
        System.out.println("double: " + doubleVar);
        System.out.println("Size: 64 bits");
        System.out.println("Range: approximately ±1.79769313486231570E+308\n");
        
        // boolean: 1-bit value
        boolean booleanVar = true;
        System.out.println("boolean: " + booleanVar);
        System.out.println("Size: 1 bit");
        System.out.println("Range: true or false\n");
        
        // char: 16-bit Unicode character
        char charVar = 'A';
        System.out.println("char: " + charVar);
        System.out.println("Size: 16 bits");
        System.out.println("Range: '\u0000' (0) to '\uffff' (65535)\n");
	}

}
