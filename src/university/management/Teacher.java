/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ASHAR
 */
public class Teacher {
    public static int iterator=0;
    int[] id=new int[3];
    String[] Tname=new String[3];
    String [] Tcourse=new String[3];
    
    
    Scanner scanner=new Scanner(System.in);
  
    public void AddTeacher() 
    {
        
        
        System.out.println("Enter Teacher id:");
        id[iterator]=scanner.nextInt();
        System.out.println("Enter teacher name:");
        Tname[iterator]=scanner.next();
        System.out.println("Enter teacher course:");
        Tcourse[iterator]=scanner.next();
         iterator++;
           
    }
    
    public void ReadTheRecord()
    {
        for (int i = 0; i < 3; i++) 
        {
            System.out.println("ID of a teacher:"+id[i]); 
            System.out.println("Name of a teacher:"+Tname[i]);
            System.out.println("Course of a teacher:"+Tcourse[i]); 
            
        }
    
    }
    
    
    public void SearchTheRecord(String name)
    {
        for (int i = 0; i < 3; i++) {
            if (Arrays.asList(Tname).contains(name))
            {
             System.out.println("found");
             System.out.println("ID of a teacher:"+id[i]); 
             System.out.println("Course of a teacher:"+Tcourse[i]);
             System.out.println("name:"+Tname[i]);
            
             break;
            }
        
        if(name!=Tname[i]){ 
             System.out.println("Not found in  domain"); 
             break;
                }
            }
    }
        
      
                
        
    }

