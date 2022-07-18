package AllTogether;

public class Quicksort {

  static int[] quicksort(int[] list) {
    quicksort(list, 0, list.length - 1);
    return list;
  }

  static void quicksort(int[] list, int low, int high) {

    int pivot;
    if (low < high) {
      pivot = list[high];
      int i = low - 1;
      int j = high;

      for (;;) {
        while (list[++i] < pivot);
        while (j > 0 && list[--j] > pivot);

        if (j <= i) {
          break;
        }

        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
      }
      list[high] = list[i];
      list[i] = pivot;
      quicksort(list, low, i - 1);
      quicksort(list, i + 1, high);
    }
  }
}
