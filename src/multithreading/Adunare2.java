package multithreading;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Bogdan
 */
public class Adunare2 implements Runnable {
    // Create two named pointers to keep along the thread the counter and file writer

    Counter2 c;
    FileWriter fw;
    CounterDouble2 cd;

    public Adunare2(Counter2 c, FileWriter fw, CounterDouble2 cd) {
        this.c = c;
        this.fw = fw;
        this.cd = cd;
    }

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            if (null != c) {
                c.increment();
            }
            if (null != cd) {
                cd.increment();
            }
            writeCounterInFile(i, "C:/MultithreadingFile.txt");
        }
    }

    synchronized private void writeCounterInFile(int count, String filePath) {

        try {
            if (null != c) {
                fw.append(" ADUNARE - La citirea " + count + " contorul are valoarea:" + c.value() + "\n");
            }
            if (null != cd) {
                fw.append(" ADUNARE - La citirea " + count + " contorul double are valoarea:" + cd.value() + "\n");
            }
        } catch (IOException ex) {
        }
    }
}
