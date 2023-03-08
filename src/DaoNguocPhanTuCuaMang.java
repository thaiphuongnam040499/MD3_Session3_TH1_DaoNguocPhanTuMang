import java.util.Scanner;

public class DaoNguocPhanTuCuaMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhap size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("size lon qua");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("" + (i + 1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Element in array:", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int j = 0; j < array.length; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array:", "");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
        }
    }
}
