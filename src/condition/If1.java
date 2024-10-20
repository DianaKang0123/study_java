package condition;

public class If1 {
    public static void main(String[] args) {
        int age = 15;
      /*  if(20<=age){
            System.out.println("성인입니다.");
        }
        if (20>=age){
            System.out.println("미성년자입니다.");

        }*/

        // if - else
        /*if(20<=age){
            System.out.println("성인입니다.");
        }else {
            System.out.println("미성년자입니다.");
        }*/

        // else if
        if(age<=8){
            System.out.println("미취학");
        }else if(age<=13){
            System.out.println("초등학생");
        }else if(age<=16){
            System.out.println("중학생");
        }else if(age<=19){
            System.out.println("고등학생");
        }else{
            System.out.println("성인");
        }
    }

}
