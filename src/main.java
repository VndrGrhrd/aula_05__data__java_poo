import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class main {
    public static void main(String[] args) throws ParseException {
//        Formato padrão de data
        SimpleDateFormat data1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat data2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat data3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        data3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date y1 = data1.parse("25/06/2018");
        Date y2 = data2.parse("25/06/2018 15:42:07");
        Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println("y1: " + data1.format(y1));
        System.out.println("y2: " + data2.format(y2));
        System.out.println("y3: " + data3.format(y3));

        System.out.println("---------------------------------");
        System.out.println();
        Date x1 = new Date();  // data com horário de agora
        Date x2 = new Date(System.currentTimeMillis());  // data com horário de agora
        Date x3 = new Date(0L);
        Date w1 = new Date(1000L * 60 * 60 * 5); // Cria a data as 5AM de 01/01/1970
        System.out.println(data2.format(x1));
        System.out.println(data2.format(x2));
        System.out.println(data2.format(x3));
        System.out.println(data2.format(w1));



    }
}
