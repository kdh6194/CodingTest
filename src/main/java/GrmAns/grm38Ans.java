package GrmAns;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class grm38Ans {
    //해당 월일 입력시 요일 출력 -- 시간 남으면 하는걸로
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("월을 입력하세요 (1-12): ");
            int month = scanner.nextInt();

            System.out.print("일을 입력하세요 (1-31): ");
            int day = scanner.nextInt();

            String dateStr = String.format("%02d-%02d", month, day);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd");
            LocalDate date = LocalDate.parse(dateStr, formatter);
            DayOfWeek dayOfWeek = date.getDayOfWeek();

            System.out.println(dateStr + "은(는) " + dayOfWeek.toString() + "입니다.");
        }
    }