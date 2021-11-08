package set12.stopwatch;

public class SelectionSort {

    public static void main(String[] args) {

        final int MAXN = 100000;

        int[] array = new int[MAXN];

        for (int i = 0; i < MAXN; i++) {
            array[i] = (int) (Math.random() * MAXN);
        }

        StopWatch stopWatch= new StopWatch();

        int currentMinInd = 0;

        stopWatch.start();
        for (int i = 0; i < MAXN - 1; i++) {
            currentMinInd = i;
            for (int j = i + 1; j < MAXN; j++) {
                currentMinInd = array[currentMinInd] > array[j] ? j : currentMinInd;
            }
            int t = array[i];
            array[i] = array[currentMinInd];
            array[currentMinInd] = t;
        }
        stopWatch.stop();

        System.out.println(stopWatch.getElapsedTime() / 1000.0);

    }

}
