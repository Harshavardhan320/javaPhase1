package lession1.project;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import school.Display;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext application = new ClassPathXmlApplicationContext("config.xml");
        
        Display dis = (Display)application.getBean("display");
        
        Scanner input = new Scanner(System.in);
        
        dis.studentdisplay();
        
        System.out.println("Enter The student name");
        
        String studentname = input.nextLine();
        
        dis.addstudent(studentname);
    }
}
