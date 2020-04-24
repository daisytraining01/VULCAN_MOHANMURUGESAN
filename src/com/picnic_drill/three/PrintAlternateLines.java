package com.picnic_drill.three;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PrintAlternateLines {
    public static void main(String[] args) throws IOException {
        File inputile = new File("\\Drill_Day_Java\\supportingFiles\\input.txt");
 
        try (BufferedReader bf = new BufferedReader(new FileReader(inputile))) {
 
            String readFile;
            int line = 0;
 
            while ((readFile = bf.readLine()) != null) {
                if (line % 2 != 0) {
                    System.out.println(readFile);
                }
                line++;
            }
 
        }
        catch (Exception e) {
        	System.out.println(e);
        }
    }
}



/***************************OUTPUT********************************/
/*

Lorem Ipsum is simply dummy text of the printing and typesetting industry.
when an unknown printer took a galley of type and scrambled it to make a type specimen book.
It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages
Lorem Ipsum is simply dummy text of the printing and typesetting industry.
when an unknown printer took a galley of type and scrambled it to make a type specimen book.
It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages


*/
/*****************************************************************/ 
