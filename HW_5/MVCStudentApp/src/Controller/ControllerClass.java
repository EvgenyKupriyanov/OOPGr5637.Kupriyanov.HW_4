package Controller;

import Controller.Interfaces.iGetFileModel;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.Domain.Student;
import Model.FileModelClass;
import Model.ModelClass;
import View.ViewClass;
import View.ViewClassEng;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControllerClass {

    private iGetModel model;
    private iGetView view;
    private List<Student> bufferStudentList = new ArrayList<Student>();
    private iGetFileModel modelFile;

    public ControllerClass(iGetModel model, iGetView view, iGetFileModel modelFile) {
        this.model = model;
        this.view = view;
        this.modelFile = modelFile;
    }

    private boolean testData(List<Student> students) {
        if (students.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void update() {
        // MVC
        // view.printAllStudent(model.getStudents());

        // MVP
        bufferStudentList = model.getAllStudents();
        if (testData(bufferStudentList)) {
            view.printAllStudents(bufferStudentList);
        } else {
            System.out.println("Список студентов пуст!");
        }

    }

//Добавил метод удаления контакта. Если такого номера нет, то выводит
// сооющение об ошибке
    public void run() {
        Command com = Command.NONE;
        boolean getNewIteration = true;
        while (getNewIteration) {
            List<Student> listExit = new ArrayList<>();
            String command = view.prompt("Введите команду: ");
            com = Command.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    listExit = model.getAllStudents();
                    getNewIteration = false;
                    modelFile.saveAllStudentToFile(listExit);
                    System.out.println("Выход из программы!");
                    break;
                case LIST:
                    view.printAllStudents(model.getAllStudents());
                    break;
                case DELETE:
                    Integer id = view.promptNum("Введите номер студента, которого необходимо удалить из списка: ");
                    List<Student> newList = model.getAllStudents();
                    int count = 0;
                    for (int i = 0; i < model.getAllStudents().size(); i++) {
                        if (newList.get(i).getId() == id) {
                            model.removeStudent(id, model.getAllStudents());
                            count++;
                        }
                    }
                    if (count == 0) {
                        System.out.println("Нет такого номера!");
                    }



                    break;
            }
        }
    }















//    public void runENG() {
//        Command com2 = Command.NONE;
//        boolean getNewIteration = true;
//        while (getNewIteration) {
//            List<Student> listExit = new ArrayList<>();
//            String command2 = view.promptENG("Enter command: ");
//            com2 = Command.valueOf(command2.toUpperCase());
//            switch (com2) {
//                case EXIT:
//                    listExit = model.getAllStudents();
//                    getNewIteration = false;
//                    modelFile.saveAllStudentToFile(listExit);
//                    System.out.println("Выход из программы!");
//                    break;
//                case LIST:
//                    view.printAllStudentsENG(model.getAllStudents());
//                    break;
//                case DELETE:
//                    List<Student> newList = model.getAllStudents();
//                    Integer id = view.promptNumENG("Введите номер студента, которого необходимо удалить из списка: ");
//                    newList.remove(id - 1);
//                    model.setAllStudents(newList);
//                    break;
//            }
//        }
//    }


}

//    public void runEng() {
//        Command com = Command.NONE;
//        boolean getNewIteration = true;
//        while (getNewIteration) {
//            String command = view.prompt("Enter the command: ");
//            com = Command.valueOf(command.toUpperCase());
//            switch (com) {
//                case EXIT:
//                    getNewIteration = false;
//                    System.out.println("Finishing!");
//                    break;
//                case LIST:
//                    view.printAllStudents(model.getAllStudents());
//                    break;
//            }
//        }
//    }


