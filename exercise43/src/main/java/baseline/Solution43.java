/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 first_name last_name
 */

package baseline;
BIG KAHUNA

import java.io.*;
import java.util.Scanner;

public class Solution43 {
    public static void main(String[] args) throws IOException {
        //declare new scanner and class instance for i/o and function calls
        Solution43 app = new Solution43();
        Scanner in = new Scanner(System.in);

        //create path string that refers to local directory
        String path = ".\\"+"data\\website"+"\\";
        //prompt user for site name and store as string
        String siteName;


        //have a boolean returned from function makeDir for output
        boolean madeDir;


        //prompt user for author name and store as string
        String author;

        //call function makeHtml to create html with given info
        app.makeHtml(path, siteName, author);

        //prompt user for Javascript folder and store response as string
        String answer;

        //call function makeFolder() with response to create the folder and return boolean for output
        boolean madeJS;

        //prompt user for CSS folder and store response string

        //call function makeFolder() with response to create the folder and return boolean for output
        boolean madeCSS;

        //call function finalOutput to test booleans for output statements
        app.finalOutput(siteName, madeDir, madeJS, madeCSS);
    }

    private boolean makeDir(String path, String siteName) {
        //overwrite path string with appended siteName
        path = path + siteName;
        //create a new File instance with path
        File website = new File(path);
        //return boolean of file.mkdir() to create the folder
        return website.mkdirs();
    }
    private void makeHtml(String path, String siteName, String author) throws IOException {
        //create a new filewriter and printwriter instance (for printf)
        FileWriter fw = new FileWriter(path+siteName+"\\"+"index.html");
        PrintWriter pw = new PrintWriter(fw);
        //look up html syntax for title and meta tags and
        //printwrite printf sitename as title and author in meta

    }

    private boolean makeFolder(String siteName, String path, String folder, String response) {
        //if response == y or Y

        if(response.equals("y"))  {
            //  overwrite path with appended siteName and folder name
            //  create a newFolder File instance with path and return file.mkdirs() for output boolean
            return newFolder.mkdirs();
        }
        //else: return false
        else
            return false;
    }

    private void finalOutput(String siteName, boolean madeDir, boolean madeJS, boolean madeCSS) {
        //test each boolean and print out corresponding statement
        if(madeDir) {

        }
        if(madeJS) {
        }
        if(madeCSS) {
        }
    }
}
