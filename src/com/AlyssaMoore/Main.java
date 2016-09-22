package com.AlyssaMoore;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        // Creating BufferedWriter bufWriter, works with FileWriter to create me.txt
        BufferedWriter bufWriter = new BufferedWriter(new FileWriter("me.txt"));

        // Adding my name, favorite color, and class code to me.txt
        bufWriter.write("Alyssa Moore\r\n");
        bufWriter.write("Teal\r\n");
        bufWriter.write("2545\r\n");

        // Closing the writer before I use the reader
        bufWriter.close();

        // Creating BufferedReader bufReader, works with FileReader to read me.txt
        BufferedReader bufReader = new BufferedReader(new FileReader("me.txt"));

        // Creating String 'line' from readLine method used with bufReader
        String line = bufReader.readLine();

        // While there is something in me.txt, print the full line, then move to the next line
        while (line != null) {
            System.out.println(line);
            line = bufReader.readLine();
        }
        // Closing the reader
        bufReader.close();
    }
}