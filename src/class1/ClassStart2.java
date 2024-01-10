package class1;

public class ClassStart2 {

    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2", "학생3", "학생4"};
        int[] studentAge = {15, 16, 17, 20};
        int[] studentGrage = {90, 80, 70, 60};
        for(int i = 0; i < studentNames.length; i++) {
            System.out.println("이름:" + studentNames[i] + " 나이:" + studentAge[i] + " 성적:" + studentGrage[i]);
        }
        // 이 방식은 간편해 보이긴 하지만 학생의 데이터가 각각 나누어져 있으며 인덱스에 유의해서 데이터를 변경해야 한다.
    }
}
