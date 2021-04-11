package equals_and_hashcode_20210412;

public class HashCodeTest {
    public static void main(String[] args) {
        String str1 = "aa";
        String str2 = "aa";
        String str3 = new String("aa");

        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str1 == str3 : " + (str1 == str3));
        System.out.println();
        System.out.println("(str1.hashCode() == str2.hashCode()) : " + (str1.hashCode() == str2.hashCode()));
        System.out.println("(str1.hashCode() == str2.hashCode()) : " + (str1.hashCode() == str3.hashCode()));
    }
}
