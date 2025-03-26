import java.util.Arrays;

public class Lesson_4_solution {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        checkSum(5,5);
        printNumPosOrNeg(-50);
        isNumPosOrNeg(-50);
        printStringIntTimes(3, "Строка");
        isYearLeap(404);
        changeArray();
        createArray(100);
        multiplyArray();
        fillDiagonalArray(5);
        returnArray(5, 100);
    }

    static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    static void checkSumSign() {
        int a = -15;
        int b = 10;
        if (a + b >= 0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");
    }

    static void printColor() {
        int value = 100;
        if (value <= 0)
            System.out.println("Красный");
        else if (value > 0 && value <= 100)
            System.out.println("Желтый");
        else
            System.out.println("Зеленый");
    }

    static void compareNumbers(){
        int a = 1;
        int b = 2;
        if (a >= b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");
    }

    static boolean checkSum(int a, int b){
        if (a + b >= 10 && a + b <= 20){
            // Здесь и далее в подобных заданиях вывожу строку на консоль исключительно для проверки
            System.out.println("true");
            return true;
        }
        else {
            System.out.println("false");
            return false;
        }
    }

    static void printNumPosOrNeg(int a){
        if (a >= 0)
            System.out.println("Число положительное");
        else
            System.out.println("Число отрицательное");
    }

    static boolean isNumPosOrNeg(int a){
        if (a < 0){
            System.out.println("true");
            return true;
        }
        else {
            System.out.println("false");
            return false;
        }
    }

    static void printStringIntTimes(int a, String s){
        for (int i = 1; i <= a; i++)
            System.out.println(s);
    }

    static boolean isYearLeap(int a){
        if (a % 4 == 0 || a % 400 == 0){
            System.out.println("true");
            return true;
        }
        else{
            System.out.println("false");
            return false;
            }
    }

    static void changeArray(){
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++)
            switch (arr[i]) {
                case 1:
                    arr[i] = 0;
                    break;
                case 0:
                    arr[i] = 1;
                    break;
            }
        System.out.println(Arrays.toString(arr));
    }

    static void createArray(int a){
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++)
            arr [i] = i + 1;
        System.out.println(Arrays.toString(arr));
    }

    static void multiplyArray(){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < 6)
                arr[i] = arr[i] * 2;
        System.out.println(Arrays.toString(arr));
    }

    static void fillDiagonalArray(int a){
        int[][] table = new int[a][a];
        for (int i = 0; i < table.length; i++) {
            table[i][i] = 1;
            table[i][table.length - 1 - i] = 1;
        }
        for (int i = 0; i < table.length; i++)
            System.out.println(Arrays.toString(table[i]));
    }

    static int[] returnArray (int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++)
            arr[i] = initialValue;
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
