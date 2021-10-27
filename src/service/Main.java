package service;

import model.Student;

public class Main {
    public static void main(String[] args) {
      StudentManagement studentManagement = new StudentManagement();
      studentManagement.add(new Student(1,"1",1,1,1,1));
      studentManagement.add(new Student(2,"2",2,22,2,2));
      studentManagement.add(new Student(3,"5",5,22,6,5));

      studentManagement.delete(2);
      studentManagement.findIndexById(1);
      studentManagement.print();
      studentManagement.update(3,(new Student(4,"4",7,12,5,8)));
      studentManagement.sort();
      studentManagement.print();

    }
}
