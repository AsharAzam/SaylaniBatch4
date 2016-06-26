/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management;

import java.util.Scanner;

/**
 *
 * @author ASHAR
 */
public class UniversityManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean again=true;
        // TODO code application logic here
        Teacher t=new Teacher();
        Student s=new Student();
        Scanner scanner=new Scanner(System.in);
        do
        {
            System.out.println("Press 1 for Inserting Teacher Record:");
            System.out.println("Press 2 for Read Teacher Record:");
            System.out.println("Press 3 for  Search Teacher Record:");
            System.out.println("Press 4 for Inserting Student Record:");
            System.out.println("Press 5 for Read Student Record:");
            System.out.println("Press 6 for  Search Student Record:");
            System.out.println("Press 7 for  Exit Pogramme:1");
            
            int value = scanner.nextInt();
            switch (value)
            {
                case 1:
                {
                    System.out.println("Adding");
                    t.AddTeacher();
                   
                    break;
                }
                case 2:
                {
                    System.out.println("read the record");
                t.ReadTheRecord();
                    break;
               }
                case 3:
                {
                    System.out.println("searching the record");
                    System.out.print("Enter Teacher  Name to SEARCH\t:\t");
                    String name=scanner.next();
                    t.SearchTheRecord(name);
                    
                 break;
  }
                case 4:
                {
                    
                    System.out.println("Adding");
                    s.AddStudent();
                   
                    break;
                }
                   
                
                 case 5:
                {
                    System.out.println("read the record");
                    s.ReadTheRecord();
                    break;
                     
                 }
                 case 6:
                {
                    System.out.println("read the record");
                    System.out.print("Enter Student  Name to SEARCH\t:\t");
                    String name=scanner.next();
                    s.SearchTheRecord(name);
                    break;
                     
                 }
                 case 7:
                {
                    System.out.println("exit");
                    again=false;
                   
                    break;
                     
                 }
                
  
                default:
                {
                    System.out.println("Invalid input");
                }
            }

        }while(again==true);

    }
    
}
