import java.util.Scanner;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

//делала без try/catch, хотела изучить .hasNext- С.Камянецкий показывал на семинаре

public class DZ2additional1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дробное число: ");
    
        if (scanner.hasNextFloat()) {
            float num = scanner.nextFloat();
            System.out.println(num);
        } else {
            System.out.println("Вы ввели не дробное число");
        }
        
        scanner.close();
      }
    
}
