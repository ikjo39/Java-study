/**
* 메모리: 17396 KB, 시간: 196 ms
* 2022.08.20
* by Alub
*/
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

       ZonedDateTime nowSeoul = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String now = nowSeoul.format(formatter);

        System.out.println(now);

    }
}