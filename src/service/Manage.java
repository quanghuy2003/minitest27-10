package service;

public interface Manage <T>{
    void add(T t);

    void update(int id,T t);

    void delete (int id);

    int findIndexById(int id);

    void print();

    void sort();
}
