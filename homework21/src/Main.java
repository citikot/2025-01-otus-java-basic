import java.util.concurrent.*;

public class Main {

    private static final Object lock = new Object();
    private static char currentLetter = 'A';
    private static final int REPEAT_COUNT = 5;
    private static int completedCycles = 0;
    private static boolean isFinished = false;

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.submit(() -> {
            while (!isFinished) {
                synchronized (lock) {
                    try {
                        while (currentLetter != 'A' && !isFinished) {
                            lock.wait();
                        }

                        System.out.print("A");
                        currentLetter = 'B';
                        lock.notifyAll();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        });

        executor.submit(() -> {
            while (!isFinished) {
                synchronized (lock) {
                    try {
                        while (currentLetter != 'B' && !isFinished) {
                            lock.wait();
                        }

                        System.out.print("B");
                        currentLetter = 'C';
                        lock.notifyAll();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        });

        executor.submit(() -> {
            while (!isFinished) {
                synchronized (lock) {
                    try {
                        while (currentLetter != 'C' && !isFinished) {
                            lock.wait();
                        }

                        System.out.print("C");
                        completedCycles++;

                        if (completedCycles >= REPEAT_COUNT) {
                            isFinished = true;
                            lock.notifyAll();
                            break;
                        }

                        currentLetter = 'A';
                        lock.notifyAll();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        });

        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}