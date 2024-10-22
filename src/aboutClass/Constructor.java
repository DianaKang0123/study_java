package aboutClass;

public class Constructor {
    String name;
    int age;
    Constructor(String name, int age){
        this.name = name; // 초기화
        this.age = age; // 초기화
    }

    public static void main(String[] args) {
        Constructor constructor = new Constructor("희주",27);
        System.out.println(constructor.age);
        System.out.println(constructor.name);
    }

}
