package assignmentproject1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AssignmentProject1 {

    public static void main(String[] args) {

        //LISTS FOR EVERY CLASS
        List<Students> allStudents = new ArrayList();
        List<Students> javaStudents = new ArrayList();
        List<Students> javaPartStudents = new ArrayList();
        List<Students> cStudents = new ArrayList();
        List<Students> cPartStudents = new ArrayList();
        List<Students> bothCoursesStudents = new ArrayList();
        List<Trainers> allTrainers = new ArrayList();
        List<Trainers> javaTrainers = new ArrayList();
        List<Trainers> cTrainers = new ArrayList();
        List<Courses> courses = new ArrayList();
        List<Assignments> assignments = new ArrayList();

        //TRAINERS         
        Trainers t1 = new Trainers("Marios", "Liagkos", "Java");
        Trainers t2 = new Trainers("Antwnis", "Antwniou", "C#");
        Trainers t3 = new Trainers("Kwstas", "Fwtiou", "C#");
        Trainers t4 = new Trainers("Panos", "Platanitis", "Java");
        allTrainers.add(t1);
        allTrainers.add(t2);
        allTrainers.add(t3);
        allTrainers.add(t4);
        javaTrainers.add(t1);
        javaTrainers.add(t4);
        cTrainers.add(t2);
        cTrainers.add(t3);
//COURSES        
        Courses c1 = new Courses("CB9", "full time", "Java", "01/01/2020", "03/03/2020");
        Courses c2 = new Courses("CB9", "full time", "C#", "01/01/2020", "03/03/2020");
        Courses c3 = new Courses("CB9", "part time ", "C#", "01/01/2020", "03/03/2020");
        Courses c4 = new Courses("CB9", "part time", "Java", "01/01/2020", "03/03/2020");
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);
        courses.add(c4);

        //ASSIGNMENTS
        Assignments as = new Assignments("Private school", "", "4/12/2019", 100, 20);
        Assignments as2 = new Assignments("Public school", "", "4/12/2019", 100, 20);
        assignments.add(as);
        assignments.add(as2);

        MainMenu.mainMenu();
        
        Scanner sc = new Scanner(System.in);
        byte numberOfChoice = sc.nextByte();
        boolean main = true;
        while (main == true) {
            switch (numberOfChoice) {
                //INSERT STUDENT
                case (0):
                    main = true;
                    MainMenu.mainMenu();
                    numberOfChoice = sc.nextByte();
                    break;
                case (1):
                    System.out.println("Please give me your name");
                    String name = sc.next();
                    System.out.println("Give me your surname ");
                    String surname = sc.next();
                    System.out.println("Give me your date of birth ");
                    String dob = sc.next();
                    System.out.println("Give me your tuition fee");
                    int tf = sc.nextInt();
                    System.out.println("They are left: " + (2500 - tf) + "$");
                    Students st01 = new Students(name, surname, dob, tf);
                    allStudents.add(st01);
                    System.out.println("Do you want to add this student to Java or C# programm?");
                    String choice = sc.next();

                    if ("java".equalsIgnoreCase(choice)) {
                        System.out.println("You want part-time Java or full-time?");

                        String stream = sc.next();

                        if (stream.equalsIgnoreCase("part-time")) {
                            javaPartStudents.add(st01);
                            System.out.println("You have been succesfully register to Java part time do you want to register to C# full time?");

                            System.out.println("Yes or no?");
                            String n = sc.next();
                            if (n.equalsIgnoreCase("yes")) {
                                bothCoursesStudents.add(st01);
                            }
                        } else if (stream.equalsIgnoreCase("full-time")) {
                            javaStudents.add(st01);
                            System.out.println("You have been succesfully register to Java full time do you want to register to C# part time?");
                            System.out.println("Yes or no?");
                            String n1 = sc.next();
                            if (n1.equalsIgnoreCase("yes")) {
                                bothCoursesStudents.add(st01);
                            }
                        }

                    } else if ("c#".equals(choice)) {
                        System.out.println("You want part-time or full-time C#");
                        String stream2 = sc.next();
                        if (stream2.equalsIgnoreCase("part-time")) {
                            cPartStudents.add(st01);
                            System.out.println("You have been succesfully register to C# part time do you want to register to Java full time?");
                            System.out.println("Yes or no?");
                            String n = sc.next();
                            if (n.equalsIgnoreCase("yes")) {
                                bothCoursesStudents.add(st01);
                            }
                        } else if (stream2.equalsIgnoreCase("full-time")) {
                            cStudents.add(st01);
                            System.out.println("You have been succesfully register to C# full time do you want to register to Java part  time?");
                            System.out.println("Yes or no?");
                            String n = sc.next();
                            if (n.equalsIgnoreCase("yes")) {
                                bothCoursesStudents.add(st01);
                            }

                        }
                    } else {
                        System.out.println("You dont want to register this student.");
                    }
                    System.out.println("If you want to register more students press 1");
                    System.out.println("If you want to go back to main menu press 0");
                    numberOfChoice = sc.nextByte();
                    main = true;
                    break;
                //ADD A TRAINER
                case (2):
                    System.out.println("Please give me your name");
                    String tname = sc.next();
                    System.out.println("Give me your surname ");
                    String tsurname = sc.next();
                    System.out.println("In what subject you want to put the new trainer?");
                    String subject = sc.next();
                    subject.toLowerCase();
                    Trainers t5 = new Trainers(tname, tsurname, subject);
                    allTrainers.add(t5);
                    if (subject.matches("java")) {
                        javaTrainers.add(t5);
                    } else if (subject.matches("c#")) {
                        cTrainers.add(t5);
                    } else {
                        System.out.println("There is no subject with this name try again");
                    }
                    System.out.println("If you want  to add a new trainer press 2");
                    System.out.println("If you want to go back to main menu press 0");
                    numberOfChoice = sc.nextByte();
                    main = true;
                    break;
                case (3):
                    courses.forEach((course) -> {
                        System.out.println(course);
                    });
                    System.out.println("If you want to go back to main menu press 0");
                    numberOfChoice = sc.nextByte();
                    main = true;
                    break;

                case (4):

                    for (Assignments assignment : assignments) {
                        System.out.println(assignment);
                    }
                    System.out.println("If you want to go back to main menu press 0");
                    numberOfChoice = sc.nextByte();
                    main = true;
                    break;

                case (5):
                    allStudents.forEach((student) -> {
                        System.out.println(student);
                    });
                    System.out.println("If you want to go back to main menu press 0");
                    numberOfChoice = sc.nextByte();
                    main = true;
                    break;
                case (6):
                    allTrainers.forEach((trainer) -> {
                        System.out.println(trainer);
                    });
                    System.out.println("If you want to go back to main menu press 0");
                    numberOfChoice = sc.nextByte();
                    main = true;
                    break;
                case (7):
                    System.out.println("Add a title for your assignment");
                    String title = sc.next();
                    System.out.println("Add a description for your assignment");
                    String descriptin = sc.next();
                    System.out.println("Add a date time");
                    String dt = sc.next();
                    System.out.println("Add total mark");
                    int total = sc.nextInt();
                    System.out.println("Add oral mark");
                    int oral = sc.nextInt();
                    Assignments as1 = new Assignments(title, descriptin, dt, oral, total);
                    assignments.add(as1);
                    System.out.println("Do you want to add more assignments?Press 7");
                    System.out.println("If you want to go back to main menu press 0");
                    numberOfChoice = sc.nextByte();
                    main = true;
                    break;
                case (8):
                    for (Students student : javaStudents) {
                        System.out.println("Java full-time students are :");
                        System.out.println(student);
                    }
                    for (Students cStudent : cStudents) {
                        System.out.println("C# full-time students are :");
                        System.out.println(cStudent);
                    }
                    for (Students javaPartStudent : javaPartStudents) {
                        System.out.println("Java part-time students are:");
                        System.out.println(javaPartStudent);
                    }
                    for (Students cPartStudent : cPartStudents) {
                        System.out.println("C# part-time students are: ");
                        System.out.println(cPartStudent);
                    }
                    System.out.println("If you want to go back to main menu press 0");
                    numberOfChoice = sc.nextByte();
                    main = true;
                    break;
                case (9):
                    for (Trainers trainer : javaTrainers) {
                        System.out.println("Java trainers are");
                        System.out.println(trainer);
                    }
                    for (Trainers cTrainer : cTrainers) {
                        System.out.println("C# trainers are");
                        System.out.println(cTrainer);
                    }
                    System.out.println("If you want to go back to main menu press 0");
                    numberOfChoice = sc.nextByte();
                    main = true;
                    break;
                case (10):
                    for (Students bothCoursesStudent : bothCoursesStudents) {
                        System.out.println(bothCoursesStudent);
                    }
                    System.out.println("If you want to go back to main menu press 0");
                    numberOfChoice = sc.nextByte();
                    main = true;
                    break;

                case (11):
                    main = false;
                    break;

            }

        }

    }
}
