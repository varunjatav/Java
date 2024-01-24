public class Priority {
    public static void main(String args[]) {
        int queue[] = new int[] { 4, 8, 9, 4, 8, 80 };
        int pqueue[] = new int[] { -1, -1, 1, 0, 1, 0 };
        int f = 0;
        int r = pqueue.length -1;
        int i = f;
        int j = i + 1;
        int swap = 0;
        int swap2 = 0;
        while (i <= r) {
            j = i + 1;
            while (j <= r) {
                if (pqueue[i] < pqueue[j]) {
                    swap = pqueue[j];
                    pqueue[j] = pqueue[i];
                    pqueue[i] = swap;

                    swap2 = queue[j];
                    queue[j] = queue[i];
                    queue[i] = swap2;
                }
                j++;
            }
            i++;
        }

        while (f <= r) {
            System.out.println(queue[f]);
            f++;
        }
    }

}
