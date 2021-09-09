package HomeWork.Lesson1.HomeWork;

public class Lesson1 {
    // 1 task
    public static void main(String[] args) {
        //System.out.println(Task3(4.5f,5,21,3));
        //System.out.println(Task4(7,5));
       // Task5(-1);
       // System.out.println(Task6(6));
        //Task7("Reva");
        //Task8(4);


    }
    //region Task 2
    //2 task Создать переменные всех пройденных типов данных и инициализировать их значения.
    int a = 30;
    byte b = 10;
    long c =30000000000000000L;
    short d = 20;
    float e = 10.55f;
    double f = 10.555566;
    char g = 'i';
    String str = "Hi";


    //endregion

    //region Task 3
    /*Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    где a, b, c, d – аргументы этого метода, имеющие тип float.
    */
    public static float Task3(float a, float b, float c, float d){
        float result = a *(b+(c/d)) ;
        return result;
    }


    //endregion

    //region Task 4
    /*Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
    от 10 до 20 (включительно), если да – вернуть true, в противном случае – false
     */

    public static boolean Task4(int a,int b){
        boolean result =a+b>=10&&a+b<=20;
        return result;

    }

    //endregion

    //region Task 5
    /*Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
     положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом
     */

    public static void Task5(int a){
        if(a >=0){
            System.out.println("Положительное число");
        }else{
            System.out.println("Отрицательное число");
        }

    }
    //endregion

    //region Task 6
    /*Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
    если число отрицательное, и вернуть false если положительное
     */
    public static boolean Task6(int a){
        boolean bool = true;
        if (a >= 0) {
            bool = false;
        }
        return bool;
    }

    //endregion

    //region Task 7
    /*Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
     */
    public static void Task7(String name){
        System.out.println("Hello, "+ name + " !");
    }

    //endregion

    //region Task 8
    /*
    Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */

    public static void Task8(int year){
        if(year%4==0&&year%100!=0||year%400==0){
            System.out.println("Год високосный");
        }else{
            System.out.println("Год не высокосный");
        }
    }
    //endregion

}
