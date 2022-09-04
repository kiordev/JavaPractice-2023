import java.lang.String;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int array_size;
        Scanner num = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        array_size = num.nextInt();
        int[] my_array = new int[array_size];
        System.out.println("Массив создан, размер: "+ array_size);
        System.out.println("Ввод элелементов массива: ");
        //Ввод массива
        for(int i = 0; i < my_array.length; i++){
            System.out.println("Введите элемент массива номер - "+(i+1));
            my_array[i] = num.nextInt();
        }
        System.out.println("Массив my_array: ");
        for(int i = 0; i < my_array.length; i++){
            System.out.print(my_array[i]+" ");
        }
        //Предложение по сортировке
        System.out.println("Отсортировать массив?");
        System.out.println("Возрастание + | Убывание -");
        char symbol;
        Scanner sybmol_enter = new Scanner(System.in);
        symbol = sybmol_enter.next().charAt(0);
        int temp = 0;
        //Сортировка по возростанию
        if(symbol == '+'){
            boolean isSorted = false;
            while(!isSorted){
                isSorted=true;
                for(int i=1; i< my_array.length; i++){
                    if(my_array[i]<my_array[i-1]){
                        temp=my_array[i];
                        my_array[i]=my_array[i-1];
                        my_array[i-1]=temp;
                        isSorted=false;
                    }
                }

            }
            //Сортировка по убыванию
        }else if(symbol == '-'){
            boolean isSorted = false;
            while(!isSorted){
                isSorted=true;
                for(int i=1; i< my_array.length; i++){
                    if(my_array[i]>my_array[i-1]){
                        temp=my_array[i];
                        my_array[i]=my_array[i-1];
                        my_array[i-1]=temp;
                        isSorted=false;
                    }
                }
            }

        }
        //Вывод массива после сортировки
        System.out.println("Массив my_array: ");
        for(int i = 0; i < my_array.length; i++){
            System.out.print(my_array[i]+" ");
        }
    }
}
