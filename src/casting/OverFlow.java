package casting;

public class OverFlow {
    public static void main(String[] args) {
        long maxInt = 214783647; //int 최고값
        long maxIntOver = 214783648L; // int 최대값 +  1
        int intValue = 0;

        intValue = (int) maxInt;
        System.out.println(intValue);

        intValue = (int) maxIntOver;
        System.out.println(intValue);
    }
}
