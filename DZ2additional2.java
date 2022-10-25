//Если необходимо, исправьте данный код: Код исправлен, при делении на ноль выведена  информация
//  об исключении(Catching exception: java.lang.ArithmeticException: / by zero),
// программа продолжила свою работу

public class DZ2additional2 {
    public static void main (String[]args) {
        int intArray[] = new int[] {1,2,3,4,5,6,7,8,9,10}; 
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } 
        catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
        
    }
}
