package seminars.finish;

import java.util.Random;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class FinalFile {
    // метод нахождения среднего значения массива
    public static double averNumber(ArrayList<Integer> x){
        int sum = 0;
        for (int i = x.size() - 1; i >= 0; i--) {
            sum= sum + x.get(i);
        }
        double average1 = (double) sum / x.size();
        return average1;
    }

    // метод, выдающий результат сравнения средних значений массива в виде строки

    public static String printer(double a1, double a2){
        String s;
        if(a2>a1) s = "Второй список имеет большее среднее значение";
        else if (a2<a1) s = "Первый список имеет большее среднее значение";
        else s ="Средние значения равны";
        return s;
    }
    public static void main(String[] args) {
        final int n = 4;
        //подготовка списков
        Random rd = new Random(0);
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr1.add(rd.nextInt(0, 100));
        }
        Random rd1 = new Random(0);
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr2.add(rd.nextInt(0, 100));
        }
        // вывод списков
        System.out.println(arr1);
        System.out.println(arr2);
        double average1 = averNumber(arr1);
        double average2 = averNumber(arr2);
        // вывод результата работы программы
        System.out.println(printer(average1,average2));

        }
}

