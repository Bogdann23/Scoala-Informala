package multithreading;

import java.io.FileWriter;
import java.io.IOException;

public class Scadere2 implements Runnable {

    FileWriter fw;
    Counter2 c;
    CounterDouble2 cd;

    public Scadere2(FileWriter fw, Counter2 c, CounterDouble2 cd) {
        this.fw = fw;
        this.c = c;
        this.cd = cd;
    }

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            if (null != c) {
                c.decrement();
            }
            if (null != cd) {
                cd.decrement();
            }
            writeCounterInFile(i, "C:/MultithreadingFile.txt");
        }
    }

    synchronized private void writeCounterInFile(int count, String filePath) {

        try {
            if (null != c) {
                fw.append(" SCADERE - La citirea " + count + " contorul are valoarea:" + c.value() + "\n");
            }
            if (null != cd) {
                fw.append(" SCADERE - La citirea " + count + " contorul double are valoarea:" + cd.value() + "\n");
            }
        } catch (IOException ex) {
        }
    }
}
