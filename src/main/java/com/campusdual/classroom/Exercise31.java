package com.campusdual.classroom;

import java.io.*;

public class Exercise31 {

    public static void main(String[] args) {

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(new File("src/main/resources/lorem.txt")));
            String linea = "";
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
