package aboutClass;

public class Students {
    String name;
    int age;
    static int studentCount = 0; //클래스 변수
    public void introduce(){
        System.out.println("이름 " + name);
        System.out.println("나이 " + age);
    } // 인스턴스 메소드
    public static void printStudentCount() {
        System.out.println(studentCount);
    }
    public void setName(String name){
        this.name = name; //this.name = 인스턴스 변수, = name은 전달값
    }


    public static void main(String[] args) {
        Students.studentCount = 10; // 클래스 변수 : 객체를 만들 필요 없이 클래스 명으로 접근
        System.out.println(Students.studentCount); // 클래스 변수의 사용
        Students students = new Students(); //객체 생성, 인스턴스 변수 및 메소드 호출
        students.name = "희주"; //인스턴스 객체 값 할당
        students.age = 27; // 인스턴스 객체 값 할당
        students.introduce(); //인스턴스 메소드의 사용
        Students.printStudentCount(); // 클래스 메소드의 사용
        students.setName("희맹"); // 인스턴스 메소드 사용
        System.out.println(students.name); // 인스턴스 객체 호출
    }
}
