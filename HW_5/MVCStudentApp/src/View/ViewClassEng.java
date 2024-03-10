package View;


import Controller.Interfaces.iGetView;
import Model.Domain.Student;

import java.util.List;
import java.util.Scanner;
//Создал класс для ввода на английском языке
public class ViewClassEng implements iGetView {


    @Override
    public void printAllStudents(List<Student> students) {
        System.out.println("--------------------List students-------------------");
        for(Student s: students)
        {
            System.out.println(s);
        }
        System.out.println("-------------------------------------------------------");
    }

    @Override
    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter command: ");
        return in.nextLine();
    }

    public Integer promptNum(String msg)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ID student, which you are going to delete from list: ");
        return in.nextInt();
    }


}
