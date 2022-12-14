
import AdditionalComponents.Login;
import AdditionalComponents.Message;
import CommandLine.*;
import Courses.*;
import personPackage.Student;
import personPackage.Teacher;

import java.io.FileNotFoundException;
import java.sql.Array;
import java.sql.SQLException;
import java.util.*;
import AdditionalComponents.Date;

public class Main {

    public static void main(String[] args) throws Exception {

        if (args.length == 1 && args[0].equals("-h")) {
            CommandLineArguments commandLineArguments = new CommandLineArguments();
            System.out.println(commandLineArguments);

        }
        if (args[1].equals("Students")) {
            StudentsCommands.connect(args);
        } else if (args[1].equals("Teachers")) {
            TeachersCommands.connect(args);
        } else if(args[1].equals("Courses")) {
            CoursesCommand.connect(args);
        }
        if (args.length == 1 && args[0].equals("-h")) {
            CommandLineArguments commandLineArguments = new CommandLineArguments();
            System.out.println(commandLineArguments);
        }

        if (args[1].equals("Students")) {
            StudentsCommands.connect(args);
        } else if (args[1].equals("Teachers")) {
            TeachersCommands.connect(args);
        }

    }
}