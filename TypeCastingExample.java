public class TypeCastingExample {
    public static void main(String[] args) {
        double doubleVal = 45.67;
        int intVal = (int) doubleVal;
        System.out.println("Double to int: " + intVal);
        int anotherInt = 25;
        double anotherDouble = (double) anotherInt;
        System.out.println("Int to double: " + anotherDouble);
    }
}
