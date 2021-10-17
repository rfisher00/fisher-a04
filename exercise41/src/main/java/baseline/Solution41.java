/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Ryan Fisher
 */

package baseline;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution41 {
    public static void main(String[] args) throws Exception {
        Solution41 app = new Solution41();
        //declare input file
        String inputFile = "data/exercise41_input.txt";
        //declare empty ArrayList
        List<String> names;

        //retrieve list of names from getInput() and
        names = app.getInput(inputFile);

        //sort list of names in sortInput()

        //print out alphabetical list of names
        app.makeOutput(names);
    }

    private List<String> getInput(String inputFile) throws Exception {
        //create new filereader and bufferedreader instance
        FileReader fw = new FileReader(inputFile);
        BufferedReader br = new BufferedReader(fw);

        //declare string inputline and empty names list
        String inputLine;
        List<String> names = new ArrayList<>();

        //iterate through file and add each line to arraylist


        //close file and return list

        return names;
    }

    private void makeOutput(List<String> names) throws IOException {
        //declare and convert list to array of listsize
        String[] nameArr = new String[names.size()];


        //create new filewriter and bufferedwriter instance for output.txt
        FileWriter fw = new FileWriter("data/exercise41_output.txt");
        PrintWriter pw = new PrintWriter(fw);

        //print output through printwriter from name arr
        //close file

    }
}

