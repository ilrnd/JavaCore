/**
 * 1. Написать функцию, создающую резервную копию всех файлов в директории
 * во вновь созданную папку ./backup
 */

package org.example;

import java.io.*;
import java.net.URI;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class Program {
    private static final File BACKUP_FILENAME = new File("./backup");

    public static void main(String[] args) throws IOException{
        createBackup(new File("./HT5.1"), BACKUP_FILENAME);

    }

    public static void createBackup(File sourceFile, File destinationFile) throws IOException
    {
        if (sourceFile.isDirectory())
        {
            if (!destinationFile.exists())
            {
                destinationFile.mkdirs();
            }

            String files[] = sourceFile.list();

            for (String file : files)
            {
                File srcFile = new File(sourceFile, file);
                File destFile = new File(destinationFile, file);
                createBackup(srcFile, destFile);
            }
        }
        else
        {
            try (FileOutputStream fileOutputStream = new FileOutputStream(destinationFile)){
                int c;
                try(FileInputStream fileInputStream = new FileInputStream(sourceFile)){
                    while ((c = fileInputStream.read()) != -1){
                        fileOutputStream.write(c);
                    }
                }
            }
        }
    }
}