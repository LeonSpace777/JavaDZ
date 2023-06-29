// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

public public static void name(int[] arr) {
    int n = arr.length;
        for (int i = 0; i < n-1; i++)
        for (int j = 0; j < n-i-1; j++)
        if (arr[j] > arr[j+1]) {
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
}