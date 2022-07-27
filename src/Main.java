import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập size mảng 1");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i=0;i< array.length;i++){
            System.out.println(" Nhập phần tử mảng 1 với vị trí " + i);
            array[i] = scanner.nextInt();
        }
        System.out.println("Nhập size mảng 2");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        for (int i=0;i< array1.length;i++){
            System.out.println(" Nhập phần tử của mảng 2 với vị trí " + i);
            array1[i]= scanner.nextInt();
        }
        int length = array.length + array1.length;
        int[] arrayGop = new int[length];
        int j = 0;
        for (int i=0;i < array.length; i++){
            arrayGop[j] = array[i];
            j++;
        }
//        System.out.println("Sau khi thêm mảng 1" + Arrays.toString(arrayGop));
        for (int k = 0; k < array1.length; k++){
            arrayGop[j] = array1[k];
            j++;
        }
        System.out.println("Mảng sau khi gộp là: " + Arrays.toString(arrayGop));



//        for ( int element : array){
//            arrayGop[j] = element;
//            j++;
//        }
//        for (int element : array1){
//            arrayGop[j] = element;
//            j++;
//        }
//        System.out.println(Arrays.toString(arrayGop));
    }
}
