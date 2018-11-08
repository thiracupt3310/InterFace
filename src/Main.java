import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(10);
        Student s2 = new Student(20);
        Student s3 = new Student(30);
        s1.addScore(10);
        s2.addScore(20);
        s3.addScore(30);
        Data data = new Data();
        ArrayList<Measurable> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
//        System.out.println(data.avarage(students));

        ArrayList<Measurable> memberCards = new ArrayList<>();
        memberCards.add(new MemberCard(10));
        memberCards.add(new MemberCard(20));
        memberCards.add(new MemberCard(30));
//        System.out.println(data.avarage(memberCards));


        // anonymous class
        Measuror ageMeasuror = new Measuror() {
            @Override
            public double measure(Object object) {
                return ((Student)object).getAge();
            }
        };

        System.out.println(data.average(students, ageMeasuror));
        System.out.println(data.average(students, new Measuror(){

            @Override
            public double measure(Object object) {
                return ((Student)object).getScore();
            }
        }));

        System.out.println(data.average(memberCards, new Measuror() {
            @Override
            public double measure(Object object) {
                return ((MemberCard)object).getPoint();
            }
        }));
    }
}
