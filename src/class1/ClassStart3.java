package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1;           //1. Student 객체 생성 = Student변수 선언 = Student 타입을 받을 수 있는 변수를 선언
                                    //   int는 정수, String은 문자를 담을 수 있듯이 Student는 Student타입의 객체를 받을 수 있므
        student1 = new Student();   //2. new Student()의 결과로 x001 참조값 반환
        student1.name = "학생1";     //3. 최종 결과 student1 = x001;
        student1.age = 15;
        student1.grade = 90;

        Student student2;
        student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 점수:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 점수:" + student2.grade);
    }
}
