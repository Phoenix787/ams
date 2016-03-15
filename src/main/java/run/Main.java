package run;

/**
 * Created by Ксения on 07.03.2016.
 */
public class Main {
    private static final int THREAD_NUMBER = 10;
    public static void main(String[] args) {

        for (int i = 0; i < THREAD_NUMBER; i++) {
          // Thread thread = new RandomAccessThread();
           Thread thread = new SequenceAccessThread(i);
            System.out.println("Start: " + thread.getName());
            thread.start();
        }



    }

    private static class RandomAccessThread extends Thread {
        @Override
        public void run() {
            System.out.println("Run: " + this.getName());
        }
    }

    private static final Object waitObject = new Object();
    private static class SequenceAccessThread extends Thread {
        private static int currentMax = 0;
        private int mainId;

        public SequenceAccessThread(int id) {
            this.mainId = id;
        }

        @Override
        public void run() {
            try{
                System.out.println("Run " + mainId);
                synchronized (waitObject) {
                    while (mainId > currentMax) {
                        waitObject.wait();
                        System.out.println("Awakened: " +mainId);
                    }
                    currentMax++;
                    System.out.println("Finished: " + mainId);
                    waitObject.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
