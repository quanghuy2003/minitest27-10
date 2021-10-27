package service;

import model.Student;

import java.util.ArrayList;
import java.util.Comparator;

public class StudentManagement implements Manage<Student> {


    private ArrayList<Student> listStudent;


    public StudentManagement(ArrayList<Student> listStudent) {
        this.listStudent = listStudent;
    }

    public ArrayList<Student> getListStudent() {
        return listStudent;
    }

    public void setListStudent(ArrayList<Student> listStudent) {
        this.listStudent = listStudent;
    }

    public StudentManagement() {
        listStudent = new ArrayList<>(10);
    }

    @Override
    public void add(Student student) {
        listStudent.add(student);
    }

    @Override
    public void update(int id, Student student) {
        int index = findIndexById(id);
        listStudent.set(index, student);
    }

    @Override
    public void delete(int id) {
        int index = findIndexById(id);
        listStudent.remove(index);
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < this.listStudent.size(); i++) {
            if ((listStudent.get(i)).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void print() {
        for (int i = 0; i < this.listStudent.size(); i++) {
            System.out.println(this.listStudent.get(i));
        }
    }

    @Override
    public void sort() {
        listStudent.sort(Comparator.comparingDouble(Student::mediumScore));
    }
    public void biggestPoint(){
        double max = 0;
        int index = 0;
        for (int i = 0; i < listStudent.size(); i++) {
            if (max < listStudent.get(i).mediumScore()) {
                index = i;
            }
        }
        System.out.println(listStudent.get(index));
    }
}
