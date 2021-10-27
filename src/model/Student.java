package model;

public class Student extends People{
    private double mathScores;
    private double pointOfReason;
    private double pointChemistry;

    public Student(int id, String name, int age, int mathScores, int pointOfReason, int pointChemistry) {
        super(id, name, age);
        this.mathScores = mathScores;
        this.pointOfReason = pointOfReason;
        this.pointChemistry = pointChemistry;
    }


    public double getMathScores() {
        return mathScores;
    }

    public void setMathScores(int mathScores) {
        this.mathScores = mathScores;
    }

    public double getPointOfReason() {
        return pointOfReason;
    }

    public void setPointOfReason(int pointOfReason) {
        this.pointOfReason = pointOfReason;
    }

    public double getPointChemistry() {
        return pointChemistry;
    }

    public void setPointChemistry(int pointChemistry) {
        this.pointChemistry = pointChemistry;
    }
    public double mediumScore(){
        return (this.mathScores+this.pointChemistry+this.pointOfReason)/3;
    }

    @Override
    public String toString() {
        return "Student{" +
                " id= " + getId() +
                " name= " + getName() +
                " age= " + getAge() +
                " math Scores= " + mathScores +
                ", point Of Reason= " + pointOfReason +
                ", point Chemistry= " + pointChemistry +
                " medium Score= " + mediumScore()+
                '}';
    }
}
