import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss MM/dd/yyyy");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.format(formatter));
    }
}
//упоковка в jar и запуск через терминал:
//G:\projects\java_Skill\lessons_Skill\1module>C:\Users\Ася\.jdks\openjdk-17\bin\java.exe -jar out/DateTime.jar