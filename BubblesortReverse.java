package AllTogether;

public class BubblesortReverse {
  static int[] sort(int[] list) {
    sort(list, 0, list.length - 1);
    return list;
  }
  public static void sort(int[] list, int low, int max) {

    for (int i = max; i > 0; i--) {
      for (int j = 0; j < i; j++) {

        if (list[j] < list[j + 1]) {
          int temp = list[j];
          list[j] = list[j + 1];
          list[j + 1] = temp;
        }
      }
    }
    for (int i = 0; i < list.length; i++) {
      System.out.println(list[i]);
    }
  }
}
