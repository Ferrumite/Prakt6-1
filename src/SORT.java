import java.util.Arrays;

public class SORT {
    public static void main(String[] args) {

        Student[] array = new Student[6];
        array[0] = new Student(6);
        array[1] = new Student(2);
        array[2] = new Student(4);
        array[3] = new Student(12);
        array[4] = new Student(10);
        array[5] = new Student(8);
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {

            Student value = array[i];

            int j = i - 1;
            for (; j >= 0; j--) {
                if (value.num < array[j].num) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            array[j + 1] = value;
        }
        System.out.println(Arrays.toString(array));
    }
}

