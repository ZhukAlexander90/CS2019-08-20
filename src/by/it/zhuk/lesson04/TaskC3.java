package by.it.zhuk.lesson04;

/*
Вывести таблицу умножения 10 x 10 (двоныйм циклом),
но вывод должен быть словами:

Ожидаемый вывод:
два умножить на два равно четыре
два умножить на три равно шесть
два умножить на четыре равно восемь
два умножить на пять равно десять
два умножить на шесть равно двенадцать
два умножить на семь равно четырнадцать
два умножить на восемь равно шестнадцать
два умножить на девять равно восемнадцать
два умножить на десять равно двадцать
три умножить на два равно шесть
три умножить на три равно девять
три умножить на четыре равно двенадцать
...
и т.д. до фразы
...
десять умножить на десять равно сто
*/

public class TaskC3 {
    public static void main(String[] args) {
        int i;
        int j;
        String wordi = "";
        String wordj = "";
        String wordmul = "";
        for (i = 2; i <= 10; i+=1) {
            for (j = 2; j <= 10; j+=1) {
                int mul = i * j;

                System.out.println(i + " умножить на " + j + " равно " + mul );

            }
        }
    }
}
