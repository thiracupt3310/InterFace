public class Student implements Measurable{
    private int age;
    private double score;

    public Student(int age){
        this.age = age;
    }

    public void addScore(double score){
        this.score += score;
    }


    public double getScore() {
        return score;
    }

    public int getAge() {
        return age;
    }

    @Override
    public double getMeasure() {
        return age;
    }
}
