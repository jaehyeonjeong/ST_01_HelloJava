package variable;

public class Var8 {
    public static void main(String[] args) {
        // 정수
        byte b = 127; // -128~127 실무 x
        short s = 32767; // -32,768 ~ 32,767 실무 x
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647 (약 20억)

        //
        long l = 9223372036854775807L;

        // 실수
        float f = 10.0f; // 실무 x
        double d = 10.0;

        // 문자
        char c = 'c'; // 실무 x
        String str = "str";

        System.out.println(b + str);
    }
}
