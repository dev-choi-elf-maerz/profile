import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    private String name;
    private String no;

    public student(String name, String no) {
        this.name = name;
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

}

public class Main {

    public static void Main(String[] arge) {

        Student student1 = new Student("Son", "1");
        Student student2 = new Student("Kon", "2");
        Student student3 = new Student("Bon", "3");

        ArrayList <Student> studentList = new ArrayList<Student>();

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        for (Student student : studentList) {
            System.out.println(student.getName());
            System.out.println(student.getNo());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Suchen Sie weiter? y oder n");
        
        while (true) {
            String input = scanner.next();
            
            if (input.equals("y")) {
                System.out.println("Suchen.");
                String name = scanner.next();
                boolean flag = false;

                for (Student student : studentList) {
                    if (student.getName().equals(name)) {
                        System.out.println("StudentNo: " + student.getNo());
                        flag = true;
                    }
                }

                if (!flag) {
                    System.out.println("Finden Nicht: " + name);
                }
            } 
            if (input.equals("n")) {
                break;
            }
        }

        System.out.println("Endet");
    }
}

 /*
학생정보을 저장하고, 학생이름 검색시 학생번호 출력
- Student 클래스 생성
- name, no 변수 선언
- 학생을 ArrayList에 저장
- 검색 요구시 반복 검색

- 학생이름 있는경우 학번 출력, 없으면 없는 학생이름이라고 출력

>> while, flag, ArrayList, foreach 사용
 */