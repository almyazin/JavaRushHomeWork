package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String fileName = in.readLine();
        OutputStream fout = new FileOutputStream(fileName);
        BufferedWriter bfout = new BufferedWriter(new OutputStreamWriter(fout));

        while (true)
        {
            String line = in.readLine();
            fout.write(line.getBytes());
            //bfout.write(line);
            if (line.equals("exit"))
                break;
            fout.write("\r\n".getBytes());
            //bfout.newLine();
        }

        in.close();
        fout.close();
        //bfout.close();
    }
}
