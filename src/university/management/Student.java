/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ASHAR
 */
public class Student {
    
    public static int iterator=0;
    int[] Sid=new int[3];
    String[] Sname=new String[3];
    String [] Scourse_enrolled=new String[3];
    
    
    Scanner scanner=new Scanner(System.in);
  
    public void AddStudent() 
    {
        
        
        System.out.println("Enter Student id:");
        Sid[iterator]=scanner.nextInt();
        System.out.println("Enter Student name:");
        Sname[iterator]=scanner.next();
        System.out.println("Enter enrollment of  course:");
        Scourse_enrolled[iterator]=scanner.next();
         iterator++;
           
    }
    
    public void ReadTheRecord()
    {
        for (int i = 0; i < 3; i++) 
        {
            System.out.println("ID of a Student:"+Sid[i]); 
            System.out.println("Name of a Student:"+Sname[i]);
            System.out.println("Enrolledment of a student in course:"+Scourse_enrolled[i]); 
            
        }
    
    }
    
    
    public void SearchTheRecord(String name)
    {
        for (int i = 0; i < 3; i++) {
            if (Arrays.asList(Sname).contains(name))
            {
             System.out.println("found");
             System.out.println("name:"+Sname[i]);
             System.out.println("ID of a Student:"+Sid[i]); 
             System.out.println("Student enrollement in course:"+Scourse_enrolled[i]);
          
            
             break;
            }
        
        if(name!=Sname[i]){ 
             System.out.println("Not found in  domain"); 
             break;
                }
            }
    }
        
    
}
