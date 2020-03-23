import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.print("Kích thước không được vượt quá 20");
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập phần tử " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.print("Các phần tử trong mảng: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        // Duyệt các phần tử trong mảng để tìm GTNN và vị trí
        int min = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
                index = j + 1;
            }
        }
        System.out.println("Giá trị nhỏ nhất trong danh sách là " + min + " ,tại vị trí " + index);
    }
}
