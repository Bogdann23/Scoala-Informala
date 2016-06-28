package streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Scanner;

/**
 * @author Bogdan
 */
public class InOut {

    public static void main(String[] args) throws FileNotFoundException, IOException {
//#1 Method - Buffered streams.................................................................................................
//Write to a file
        try {
            FileWriter fw = new FileWriter("Test0.txt"); //create object of type filewriter and name the file in which it will write
            PrintWriter pw = new PrintWriter(fw);  //create printwriter object, which will help to write in the file created previously

            pw.println("Verifica io Java"); //here the text is actually printed in the file

            pw.close(); // we close the prinwriter object, otherwise it won't be printed in the file
        } catch (IOException e) { //use exceptions for files
            System.out.println("ERROR!");
        }

        //read from the same file
        try {
            FileReader fr = new FileReader("Test0.txt"); //create filereader object with the file name
            BufferedReader br = new BufferedReader(fr); // create BufferedReader object, which actually does the reading ftom the fr object

            String str; // We read a line at a time untill the end of the file is reached
            while ((str = br.readLine()) != null) {
                System.out.println(str + "\n");
            }

            br.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }

  //#2 Metoda - Byte Streams.....................................................................................................................
        File f = new File("Test01.txt");
        String continut = "Acesta este un exemplu";

        try (FileOutputStream fop = new FileOutputStream(f)) {

            // if file doesn't exists, then create it
            if (!f.exists()) {
                f.createNewFile();
            }

            // get the content in bytes
            byte[] contentInBytes = continut.getBytes();
            fop.write(contentInBytes);
            fop.flush();
            fop.close();

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream in = new FileInputStream(f);

            int val;

            while ((val = in.read()) != -1) {
                // convert to char and display it
                System.out.print((char) val);
            }
            System.out.println();

        } catch (IOException e) {
            e.printStackTrace();
        }
        
      //#3 Standard IO - Reading file with Scanner........................................................................................
        
      File file = new File ("Test0.txt");
      Scanner scan = new Scanner(file);
      
      while (scan.hasNextLine())
      {
          String line = scan.nextLine();
          System.out.println(line);
      }
      scan.close();
      
      //#4 - Using channels (NIO) (read from file example only)..................................
      
      RandomAccessFile aFile = new RandomAccessFile
                ("Test01.txt", "r");
        FileChannel inChannel = aFile.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        while(inChannel.read(buffer) > 0)
        {
            buffer.flip();
            for (int i = 0; i < buffer.limit(); i++)
            {
                System.out.print((char) buffer.get());
            }
            buffer.clear(); // do something with the data and clear/compact it.
        }
        inChannel.close();
        aFile.close();
      }
        
    }


