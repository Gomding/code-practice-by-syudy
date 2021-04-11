package equals_and_hashcode_20210412;

public class EqualsTest {

    public static void main(String[] args) {
        String str1 = "aa";
        String str2 = "aa";
        String str3 = new String("aa");

        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str1 == str3 : " + (str1 == str3));
        System.out.println();
        System.out.println("str1.equals(str2) : " + str1.equals(str1));
        System.out.println("str1.equals(str3) : " + str1.equals(str3));
    }
}
