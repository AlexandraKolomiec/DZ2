//Дан следующий код, исправьте его там, где требуется
//расположила обработку исключений в прорядке их возможного возникновения
//поменяла типы исключений на соотвествующие
//сначала исключения-производные, а затем корневое исключение Throwable
public class DZ2additional3 {
    public static void main(String[] args) throws Exception {
        int a = 90;
        int b = 2;
        String str="assfdh";
        int[] abc = {1, 2};
        
        try {            
            System.out.println(a / b);
            System.out.println(str.length());
            abc[3] = 9;
            System.out.println(a + b);
        } 
        catch (ArithmeticException ex) {
            System.out.println("Деление на ноль!");
        } 
        catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } 
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
        catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }  
     
    
}
