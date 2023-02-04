package entities;

public class Student {

    public String name;
    public double firstPeriod;
    public double secondPeriod;
    public double thirdPeriod;

    public double finalGrade (){
        return firstPeriod+secondPeriod+thirdPeriod;
    }

    public String approvation (){
        if (finalGrade() >= 60.0){
            return "PASS";
        }
        else {
            return "FAILED MISSING " + (60 - finalGrade()) + " POINTS";
        }
    }
}
