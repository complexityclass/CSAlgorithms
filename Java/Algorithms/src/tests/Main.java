package tests;

import java.util.Date;

import compIO.StdAudio;
import compIO.StdIn;
import sortings.QuickSort;

public class Main {

	/**
	 * @param args
	 */

    public void playThatTune(){


        // repeat as long as there are more integers to read in
        while (!StdIn.isEmpty()) {

            // read in the pitch, where 0 = Concert A (A4)
            int pitch = StdIn.readInt();

            // read in duration in seconds
            double duration = StdIn.readDouble();

            // build sine wave with desired frequency
            double hz = 440 * Math.pow(2, pitch / 12.0);
            int N = (int) (StdAudio.SAMPLE_RATE * duration);
            double[] a = new double[N+1];
            for (int i = 0; i <= N; i++) {
                a[i] = Math.sin(2 * Math.PI * i * hz / StdAudio.SAMPLE_RATE);
            }

            // play it using standard audio
            StdAudio.play(a);
        }

    }


	public static void main(String[] args) {

		/*int[] arr = new int[] { 1, 7, 8, 2, 3, 4, 5 };

		int[] arr2 = new int[1000];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = 1000 - i;
		}

		QuickSort qsort = new QuickSort(arr2);

		//qsort.print();
		System.out.println();
		long startTime = System.nanoTime();
		qsort.sortArray();
		//qsort.print();
		long endTime = System.nanoTime();

		long dist1 = endTime - startTime;

		long stTime = System.nanoTime();

		for (int i = 0; i < arr2.length - 1; i++) {
			for (int j = i + 1; j < arr2.length; j++) {
				if (arr2[i] > arr2[j]) {
					int tmp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = tmp;
				}
			}
		}
		long edTime = System.nanoTime();

		long dist2 = edTime - stTime;

		System.out.println("QuickSort :" + dist1 + "ms");
		System.out.println("BubbleSort :" + dist2 + "ms");*/

        Main main = new Main();

        main.playThatTune();


	}

}
