package chapter3_20200821;

public class TestClass {
    public static void main(String[] args) {
        int i[] = new int[4];
        int length = i.length;
        String[] s = new String[1];
        int slength = s.length;
        String str = new String();
        int strLength = str.length();
        String a = "abcdef";
        if (a == "abcdef") System.out.println("==");
        if (a.equals("abcdef")) System.out.println("equal");
    }
}
