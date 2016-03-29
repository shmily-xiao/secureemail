package com.demo.thread;

import com.demo.domain.Employee;
import com.demo.domain.Manager;
import org.apache.commons.io.output.WriterOutputStream;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by simpletour_Jenkin on 2016/3/24.
 */
public class TestSerializable implements Serializable{

    public static void main(String[] args) throws IOException,ClassNotFoundException{
        Employee harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        Manager carl = new Manager("Carl Cracker",80000,1987,12,15);

        carl.setSecretary(harry);
        Manager tony = new Manager("Tony Tester",40000, 1990, 3, 15);
        tony.setSecretary(harry);

        Employee[] staff = new Employee[3];
        staff[0] = harry;
        staff[1] = carl;
        staff[2] = tony;

        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employee.txt"))){

            outputStream.writeObject(staff);

            outputStream.flush();

        }
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employee.txt")))
        {
            Employee[] newStaff = (Employee[])inputStream.readObject();

            newStaff[1].raiseSalary(10);

            for (Employee e: newStaff){
                System.out.println(e);
            }

        }

        Path employeeRelative = Paths.get("employee.txt");
        Path p = Paths.get("/home","cay","myprog.properties");
        Path parent = p.getParent();
        Path file = p.getFileName();
        Path root = p.getRoot();
        System.out.println(p.toAbsolutePath());

        System.out.println(p.normalize());
        System.out.println(p.resolve("test"));
        System.out.println(p.relativize(p).toAbsolutePath());
        System.out.println("emd");

        byte[] bytes = Files.readAllBytes(employeeRelative);
        String content = new String(bytes, Charset.defaultCharset());

        Path newPath = Files.createTempFile(p.relativize(p).toAbsolutePath(),"te",".txt");
        BasicFileAttributes attributes = Files.readAttributes(newPath,BasicFileAttributes.class);

        FileSystem  fs = FileSystems.newFileSystem(Paths.get("target.zip"),null);
        Files.walkFileTree(fs.getPath("/"),
                new SimpleFileVisitor<Path>(){

                    public FileVisitResult visitResult(Path file, BasicFileAttributes attrs)throws IOException{
                        System.out.println(file);
                        return FileVisitResult.CONTINUE;
                    }
            });



        Employee employee1 = new Employee();

        Employee employee2 = new Employee();
        System.out.println(Employee.getTestStatic());

    }
}

