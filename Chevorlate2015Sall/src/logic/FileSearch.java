/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author woden_000
 */

public class FileSearch 
{
 

                   public boolean find(File f, String searchString) 
                {
                    boolean result = false;
                    Scanner in = null;
                            try {
                                        in = new Scanner(new FileReader(f));
                                        while(in.hasNextLine() && !result) 
                                        {
                                            result = in.nextLine().contains(searchString);
                                        }
                                }
                    catch(IOException e) 
                    {
                    }
                    finally 
                    {
                        try { in.close() ; } catch(Exception e) { /* ignore */ }  
                    }
                    return result;
                }
                   
                   
                   
                   
                   public boolean findInLine(File f, String searchString) 
                {
                    boolean result = false;
                    Scanner in = null;
                            try {
                                        in = new Scanner(new FileReader(f));
                                        while(in.hasNextLine() && !result) 
                                        {
                                            result = in.next().contains(searchString);
                                        }
                                }
                    catch(IOException e) 
                    {
                    }
                    finally 
                    {
                        try { in.close() ; } catch(Exception e) { /* ignore */ }  
                    }
                    return result;
                }
}

