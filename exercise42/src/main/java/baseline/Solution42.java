/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Ryan Fisher
 */

package baseline;

import java.io.*;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Solution42 {
    public static void main(String[] args) throws Exception {
        Solution42 app = new Solution42();
        //declare input file
        String inputFile = "data/exercise42_input.txt";

        //use getInput() to return array of inputFile lines
        String[] dataArr = app.getInput(inputFile);

        //use getOutput() to display data formatted
        app.getOutput(dataArr);
    }

    private String[] getInput(String inputFile) throws Exception {
        //create new filereader and bufferedreader instance
        FileReader fw = new FileReader(inputFile);
        BufferedReader br = new BufferedReader(fw);

        //declare string inputline and empty names list
        String inputLine;
        List<String> lines = new ArrayList<>();

        //iterate through file and add each line to arraylist
        while ((inputLine = br.readLine()) != null) {
            lines.add(inputLine);
        }

        //close file and return list as array
        fw.close();
        return lines.toArray(new String[lines.size()]);
    }

    private void getOutput(String[] data) throws Exception {
        //create new filewriter and bufferedwriter instance for output.txt
        FileWriter fw = new FileWriter("data/exercise42_output.txt");
        PrintWriter pw = new PrintWriter(fw);

        //declare new array for split method
        String[] dataArr = new String[data.length];

        pw.printf("Last      First     Salary%n--------------------------%n");

        //iterate through fileLines array and have it split by the comma into new array
        for(String s : data) {
            dataArr = s.split(",", 0);
            //print every iteration of the array split
            pw.printf("%-10s%-10s%s%n", dataArr[0], dataArr[1], dataArr[2]);
        }
        pw.close();
    }
}


