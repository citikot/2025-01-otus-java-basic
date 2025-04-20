package multithreading;

public class TaskService {

    private int ARRAY_SIZE = 100_000_000;

    private double[] array = new double[ARRAY_SIZE];

    public void simpleCycle() {

        long start = System.nanoTime();
        fillArray(0, ARRAY_SIZE);
        long finish = System.nanoTime();

        double seconds = (finish - start) / 1_000_000_000.0;
        System.out.printf("Simple cycle took: %.3f sec%n", seconds);
    }

    public void threadCycleWithMethod() throws InterruptedException {

        long start = System.nanoTime();

        Thread thread1 = new Thread(() -> fillArray(0, 25_000_000));
        Thread thread2 = new Thread(() -> fillArray(25_000_000, 50_000_000));
        Thread thread3 = new Thread(() -> fillArray(50_000_000, 75_000_000));
        Thread thread4 = new Thread(() -> fillArray(75_000_000, ARRAY_SIZE));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        long finish = System.nanoTime();

        double seconds = (finish - start) / 1_000_000_000.0;
        System.out.printf("Threaded cycle took: %.3f sec%n", seconds);
    }

    public void threadCycleWithoutMethod() throws InterruptedException {

        long start = System.nanoTime();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 25_000_000; i++) {
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 25_000_000; i < 50_000_000; i++) {
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread thread3 = new Thread(() -> {
            for (int i = 50_000_000; i < 75_000_000; i++) {
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });
        Thread thread4 = new Thread(() -> {
            for (int i = 75_000_000; i < ARRAY_SIZE; i++) {
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        long finish = System.nanoTime();

        double seconds = (finish - start) / 1_000_000_000.0;
        System.out.printf("Threaded cycle without additional method took: %.3f sec%n", seconds);
    }

    private void fillArray(int start, int end) {

        if (end > ARRAY_SIZE) {
            throw new IndexOutOfBoundsException("Parameter is out of array length of " + ARRAY_SIZE + " elements.");
        }

        for (int i = start; i < end; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }
}
