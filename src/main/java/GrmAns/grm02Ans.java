package GrmAns;
import java.util.ArrayList;
import java.util.Scanner;

public class grm02Ans {
    public static void main(String[] args) {
        // 학생 정보 저장 및 검색
        Student a = new Student("이름11", 1122);
        Student b = new Student("이름22", 3344);
        Student c = new Student("이름33", 2111);

        // 학생들의 개인정보를 arrayList에 저장하기위해서 Student타입의
        // ArrayList타입의 리스트의 인스턴스를 생성한다.

        ArrayList<Student> list = new ArrayList<Student>();

        //리스트에 자료를 넣을때는 add()메소드를 사용해서 넣는다.
        list.add(a);
        list.add(b);
        list.add(c);

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("계속 검색을 하고 싶으시면 y, 종료하고 싶으면 n");
            String input = scan.next();
            if (input.equals("y")) {

                System.out.println("검색시작");
                System.out.println("이름을 입력하세요.");

                //boolean 타입의 변수를 사용해서 초기값은 false로 하고 입력한 사람에 대한 번호가 존재할 경우에은 true로 값을 변경한다.

                boolean flag = false;

                String name = scan.next();

                // boolean 타입 변수를 사용해서 해당하는 학생 이름이 없을때에 "번호가 없는 회원으로 출력되게 한다."
                // for문을 사용해서 list에 담긴값들을 student 타입의 str1변수에 저장한다.
                for (Student str1 : list) {

                    if (str1.getName().equals(name)) {

                        System.out.println("번호 : " + str1.getNo());
                        flag = true;

                    }
                }
                if (!flag) {

                    System.out.println("번호가 없는 회원입니다.");

                }

            }

            else if (input.equals("n")) {

                System.out.println("검색을 종료합니다.");
                break;
            }

        }
    }
}
class Student {

    //이름과 학번을 가져야되므로 name와 no변수를 생성한다.

    //그리고 자료를 넣었다가 빼야하므로 getter과 setter을 생성하고, 생성자도 생성한다.

    //보통 변수는 보통 private타입을 많이 사용한다.

    private String name;

    private int no;

    public Student(String name, int no) {
        super();
        this.name = name;
        this.no = no;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

}