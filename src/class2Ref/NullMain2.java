package class2Ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; // NullPointerExceptin 발생
        System.out.println("data = " + data.value);
    }
}
