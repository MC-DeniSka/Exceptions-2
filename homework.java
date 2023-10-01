import java.util.Scanner;
public class homework {
public static void main(String[] args) {
   //task1();
   //task2();
   //task3();
   //task4();
}
    public static float task1(){
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите дробное число  ");
            float number = Float.parseFloat(scanner.nextLine());
            System.out.println(number);
            return number;
        }catch(NumberFormatException e){
            System.out.println("Ошибка! Повторите попытку ");
        }
        return 0;
        

    }
    public static void task2(){
        int [] intArray = {1,2,7,13,5,6,19,44,2};
        try {
            int d = 0;
            int catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
         }
         
    }
    public static void task3(){
         try {
                int a = 90;
                int b = 3;
                System.out.println(a / b);
                printSum(23,234);
                int[] abc = { 1, 2 };
                abc[3] = 9;
            } catch (NullPointerException ex) {
                System.out.println("Указатель не может указывать на null!");
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Массив выходит за пределы своего размера!");
            } catch (Throwable ex) {
                System.out.println("Что-то пошло не так...");
            }
         }
         public static void printSum(Integer a, Integer b){
            System.out.println(a + b);
         }

         public static void task4(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку  ");
            String string = scanner.nextLine();
            if(string.isEmpty()){
                throw new RuntimeException("Ошибка! Пустые строки вводить нельзя");
            }
            System.out.println(string);
            

        
    }

}
